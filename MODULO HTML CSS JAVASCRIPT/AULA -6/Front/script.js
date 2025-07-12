//Url API
const urlAPI = "http://localhost:3000/enderecos";
// Armazena id da pessoa
let enderecoID = null;

// chamando o via cep
function buscarCep(cep) {
    if(cep.length !==8){
        return;
    }
    fetch(`https://viacep.com.br/ws/${cep}/json/`)
        .then((response) => response.json())
        .then((data) => {
            inputEstado.value = data.uf;
            inputCidade.value = data.localidade;
            inputBairro.value = data.bairro;
            inputLogradouro.value = data.logradouro;
        });
}

// elementos html que serao utilizados

const formulario = document.getElementById("formularioendereco");
const inputNome = document.getElementById("nome");
const inputCep = document.getElementById("cep");
const inputEstado = document.getElementById("estado");
const inputCidade = document.getElementById("cidade");
const inputBairro = document.getElementById("bairro");
const inputLogradouro = document.getElementById("logradouro");
const lista = document.getElementById("lista");

// ouvinte para cep input
inputCep.addEventListener("input", (event) => {
    const userInput = event.target.value;
    buscarCep(userInput);
});
