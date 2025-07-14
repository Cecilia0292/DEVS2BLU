// ------------------ SELECIONAR OS ELEMENTOS HTML -------------------
const formulario = document.getElementById("formularioendereco");
const inputNome = document.getElementById("nome");
const inputCep = document.getElementById("cep");
const inputEstado = document.getElementById("estado");
const inputCidade = document.getElementById("cidade");
const inputBairro = document.getElementById("bairro");
const inputLogradouro = document.getElementById("logradouro");
const lista = document.getElementById("lista");
const alertSucesso = document.getElementById("alertSucesso");
const alertErro = document.getElementById("alertErro");

// Esconde os alertas no início
alertSucesso.style.display = "none";
alertErro.style.display = "none";

// ------------------ CONFIGURAR A URL DA API -------------------
const urlAPI = "http://localhost:3000/enderecos";

// Variável para armazenar o ID do endereço quando editar
let enderecoID = null;

// ------------------ BUSCAR ENDEREÇO PELO CEP (ViaCEP) -------------------
inputCep.addEventListener("input", (e) => {
    const cep = e.target.value.replace(/\D/g, ""); // remove tudo que não for número

    if (cep.length === 8) {
        fetch(`https://viacep.com.br/ws/${cep}/json/`)
            .then(res => res.json())
            .then(data => {
                if (data.erro) return alert("CEP não encontrado");

                inputEstado.value = data.uf;
                inputCidade.value = data.localidade;
                inputBairro.value = data.bairro;
                inputLogradouro.value = data.logradouro;
            })
            .catch(() => alert("Erro ao buscar o CEP"));
    }
});

// ------------------ FUNÇÃO PARA LISTAR ENDEREÇOS -------------------
function listarEnderecos() {
    lista.innerHTML = ""; // limpa a lista

    fetch(urlAPI)
        .then(res => res.json())
        .then(enderecos => {
            enderecos.forEach(endereco => {
                const li = document.createElement("li");
                li.className = "list-group-item d-flex justify-content-between align-items-center";
                li.innerHTML = `
                    <span><strong>${endereco.nome}</strong> - ${endereco.cidade}/${endereco.estado}</span>
                    <div>
                        <button class="btn btn-sm btn-primary me-1" onclick="editar(${endereco.id})">Editar</button>
                        <button class="btn btn-sm btn-danger" onclick="Remover(${endereco.id})">Remover</button>
                    </div>
                `;
                lista.appendChild(li);
            });
        });
}

// Carrega a lista ao abrir a página
listarEnderecos();

// ------------------ CADASTRAR NOVO ENDEREÇO -------------------
function cadastrar() {
    const endereco = {
        nome: inputNome.value,
        cep: inputCep.value,
        estado: inputEstado.value,
        cidade: inputCidade.value,
        bairro: inputBairro.value,
        logradouro: inputLogradouro.value
    };

    fetch(urlAPI, {
        method: "POST",
        headers: {"Content-Type": "application/json"},
        body: JSON.stringify(endereco)
    })
    .then(() => {
        mostrarSucesso("Endereço cadastrado com sucesso!");
        listarEnderecos();
        formulario.reset();
    })
    .catch(() => mostrarErro("Erro ao cadastrar endereço."));
}

// ------------------ EDITAR ENDEREÇO -------------------
function editar(id) {
    fetch(`${urlAPI}/${id}`)
        .then(res => res.json())
        .then(endereco => {
            // Preenche o formulário com os dados atuais
            enderecoID = id;
            inputNome.value = endereco.nome;
            inputCep.value = endereco.cep;
            inputEstado.value = endereco.estado;
            inputCidade.value = endereco.cidade;
            inputBairro.value = endereco.bairro;
            inputLogradouro.value = endereco.logradouro;
        });
}

// ------------------ ALTERAR ENDEREÇO -------------------
function Alterar() {
    if (!enderecoID) {
        alert("Nenhum endereço selecionado para edição!");
        return;
    }

    const enderecoAtualizado = {
        nome: inputNome.value,
        cep: inputCep.value,
        estado: inputEstado.value,
        cidade: inputCidade.value,
        bairro: inputBairro.value,
        logradouro: inputLogradouro.value
    };

    fetch(`${urlAPI}/${enderecoID}`, {
        method: "PUT",
        headers: {"Content-Type": "application/json"},
        body: JSON.stringify(enderecoAtualizado)
    })
    .then(() => {
        mostrarSucesso("Endereço atualizado com sucesso!");
        listarEnderecos();
        formulario.reset();
        enderecoID = null;
    })
    .catch(() => mostrarErro("Erro ao atualizar o endereço."));
}

// ------------------ REMOVER ENDEREÇO -------------------
function Remover(id) {
    fetch(`${urlAPI}/${id}`, { method: "DELETE" })
        .then(() => {
            mostrarSucesso("Endereço removido com sucesso!");
            listarEnderecos();
        })
        .catch(() => mostrarErro("Erro ao remover endereço."));
}

// ------------------ CANCELAR -------------------
function Cancelar() {
    formulario.reset();
    enderecoID = null;
}

// ------------------ ALERTAS DE SUCESSO E ERRO -------------------
function mostrarSucesso(mensagem) {
    alertSucesso.textContent = mensagem;
    alertSucesso.style.display = "block";
    setTimeout(() => alertSucesso.style.display = "none", 3000);
}

function mostrarErro(mensagem) {
    alertErro.textContent = mensagem;
    alertErro.style.display = "block";
    setTimeout(() => alertErro.style.display = "none", 3000);
}
