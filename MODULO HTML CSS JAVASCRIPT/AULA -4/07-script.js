function verificarAno() {
  const ano = Number(document.getElementById("ano").value);
  const resultadoDiv = document.getElementById("resultado");

  if (isNaN(ano) || ano <= 0) {
    resultadoDiv.innerText = "⚠️ Digite um ano válido (maior que 0).";
    return;
  }

  const bissexto = (ano % 4 === 0 && ano % 100 !== 0) || (ano % 400 === 0);

  resultadoDiv.innerHTML = `
    <h2>${ano} ${bissexto ? "é" : "não é"} um ano bissexto.</h2>
  `;
}

function limpar() {
  document.getElementById("ano").value = "";
  document.getElementById("resultado").innerText = "";
}
