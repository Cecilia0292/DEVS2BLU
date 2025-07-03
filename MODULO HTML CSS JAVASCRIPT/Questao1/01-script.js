function calcularMedia(){
    let formulario = document.getElementById("formulario");
    // Obtendo os valores das notas
    let n1 = parseFloat(document.getElementById("nota1").value);
    let n2 = parseFloat(document.getElementById("nota2").value);
    let n3 = parseFloat(document.getElementById("nota3").value);

    const media = (n1 + n2+ n3) / 3;

    let situação = media >= 7 ? "Aprovado" : media >=5 ? "Recuperação" : "Reprovado";

    let corFonte = media >= 7 ? "green" : media >= 5 ? "orange" : "red";
        
    
    let exibirMedia = document.getElementById('exibirMedia');
    let exibirSituacao = document.getElementById('exibirSituacao');

    exibirMedia.innerText = `Média: ${media.toFixed(2)}`;
    exibirSituacao.innerText = `Situação: ${situação}`;
    exibirMedia.style.color = corFonte;
    exibirSituacao.style.color = corFonte;
}   

function limparCampos() {
    document.getElementById("nota1").value = "";
    document.getElementById("nota2").value = "";
    document.getElementById("nota3").value = "";
    document.getElementById("exibirMedia").innerText = "";
    document.getElementById("exibirSituacao").innerText = "";
}