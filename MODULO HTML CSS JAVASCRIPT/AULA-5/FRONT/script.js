// requisicao para armazenar os produtos
//vetor

let produtos = [];
// requisicao para obter os produtos

fetch('http://localhost:3000/produtos')
.then(retorno => retorno.json())
.then(p => {produtos = p;
    gerarTabela();
});

// funcao para gerar a tabela

let gerarTabela = () =>{
    //Selecionar elemeto <tbody> da tabela
    let tabela = document.getElementById('tabela');

    // laço repetitivo para percorrer o vetor de produtos
    for(let indice = 0; indice<produtos.length; indice++){
        /// criar linha da tabela- informando a posição do vetor
        let linha = tabela.insertRow(-1);

        // criar colunas <td>
        let colunaId = linha.insertCell(0);
        let colunaNome = linha.insertCell(1);
        let colunaMarca = linha.insertCell(2);
        let colunaValor = linha.insertCell(3);
        let colunaSelecionar = linha.insertCell(4);

        // infomrar o valor de cada coluna
        colunaId.innerText = produtos[indice].id;
        colunaNome.innerText = produtos[indice].nome;
        colunaMarca.innerText = produtos[indice].marca;
        colunaValor.innerText = produtos[indice].valor;
        colunaSelecionar.innerHTML =`<button class="btn btn-primary" id="btnSelecionar" onclick="selecionar('+indice+')">Selecionar</button>`;
    }
}