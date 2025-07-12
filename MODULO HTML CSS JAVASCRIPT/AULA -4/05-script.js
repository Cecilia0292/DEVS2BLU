function calcularFatorial() {
  const n = Number(document.getElementById("numero").value);
  const resultadoDiv = document.getElementById("resultado");

  if (isNaN(n) || n < 0 || !Number.isInteger(n)) {
    resultadoDiv.innerText = "⚠️ Digite um número inteiro positivo válido.";
    return;
  }

  let fatorial = 1;
  let expressao = `${n}! = `;

  for (let i = n; i >= 1; i--) {
    fatorial *= i;
    expressao += (i !== 1) ? `${i} × ` : `${i}`;
  }

  resultadoDiv.innerHTML = `<h1>${expressao} = ${fatorial}</h1>`;
}

function limpar() {
  document.getElementById("numero").value = "";
  document.getElementById("resultado").innerText = "";
}
