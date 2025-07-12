function calcularIMC() {
  const peso = Number(document.getElementById("peso").value);
  const altura = Number(document.getElementById("altura").value);
  const resultadoDiv = document.getElementById("resultado");

  if (peso <= 0 || altura <= 0 || isNaN(peso) || isNaN(altura)) {
    resultadoDiv.innerText = "⚠️ Informe valores válidos para peso e altura.";
    return;
  }

  const imc = peso / (altura * altura);
  let classificacao = "";

  if (imc < 18.5) classificacao = "Abaixo do peso";
  else if (imc < 25) classificacao = "Peso normal";
  else if (imc < 30) classificacao = "Sobrepeso";
  else if (imc < 35) classificacao = "Obesidade grau 1";
  else if (imc < 40) classificacao = "Obesidade grau 2";
  else classificacao = "Obesidade grau 3";

  resultadoDiv.innerHTML = `
    <h2>Seu IMC é: ${imc.toFixed(2)}</h2>
    <p>Classificação: <strong>${classificacao}</strong></p>
  `;
}

function limpar() {
  document.getElementById("peso").value = "";
  document.getElementById("altura").value = "";
  document.getElementById("resultado").innerText = "";
}
