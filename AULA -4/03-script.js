let numeroSecreto = Math.floor(Math.random() * 100) + 1;
let tentativa = 0;
let acertou = false;

function verificarChute(){
  if (acertou) return;

  const input = document.getElementById("inputChute");
  const resultado = document.getElementById("resultado");
  const chute = Number(input.value);
  tentativa++;

  const diferenca = Math.abs(chute - numeroSecreto);

  if (chute === numeroSecreto) {
    resultado.innerText = `🎉 Parabéns! Você acertou em ${tentativa} tentativa(s).`;
    acertou = true;
  } else if (diferenca <= 5) {
    resultado.innerText = "🔥 Quase!";
  } else if (diferenca <= 10) {
    resultado.innerText = "😬 Perto!";
  } else if (diferenca <= 20) {
    resultado.innerText = "🧐 Longe!";
  } else {
    resultado.innerText = "🥶 Muito longe!";
  }

  input.value = "";
  input.focus();
}

function reiniciarJogo(){
  numeroSecreto = Math.floor(Math.random() * 100) + 1;
  tentativa = 0;
  acertou = false;
  document.getElementById("inputChute").value = "";
  document.getElementById("resultado").innerText = "";
}
