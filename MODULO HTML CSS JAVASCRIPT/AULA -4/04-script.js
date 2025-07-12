function mostrarTabuada() {
  const numero = Number(document.getElementById("numero").value);
  const resultadoDiv = document.getElementById("resultado");

  if (isNaN(numero)) {
    resultadoDiv.innerText = "⚠️ Por favor, digite um número válido.";
    return;
  }

  let resultado = `<h2>Tabuada do ${numero}</h2><ul style="list-style: none;">`;
  for (let i = 1; i <= 10; i++) {
    resultado += `<li>${numero} × ${i} = ${numero * i}</li>`;
  }
  resultado += "</ul>";

  resultadoDiv.innerHTML = resultado;
}

function limpar() {
  document.getElementById("numero").value = "";
  document.getElementById("resultado").innerHTML = "";
}