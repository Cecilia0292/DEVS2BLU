const perguntas = [
  {pergunta: "Capital do Brasil?", a: "São Paulo", b: "Rio", c: "Brasília", d: "Salvador", correta: "c"},
  {pergunta: "Resultado de 5+3?", a: "8", b: "9", c: "6", d: "7", correta: "a"},
  {pergunta: "Cor da bandeira do Japão?", a: "Branco", b: "Vermelho", c: "Branco e vermelho", d: "Amarelo", correta: "c"},
  {pergunta: "Maior planeta?", a: "Terra", b: "Júpiter", c: "Saturno", d: "Marte", correta: "b"},
  {pergunta: "Animal símbolo do Brasil?", a: "Tamanduá", b: "Onça", c: "Tucano", d: "Arara", correta: "b"},
  {pergunta: "HTML é linguagem de?", a: "Estilo", b: "Programação", c: "Marcação", d: "Banco de Dados", correta: "c"},
  {pergunta: "Cor complementa azul?", a: "Verde", b: "Amarelo", c: "Laranja", d: "Vermelho", correta: "c"},
  {pergunta: "Continente do Egito?", a: "Ásia", b: "Europa", c: "África", d: "América", correta: "c"},
  {pergunta: "PI é igual a?", a: "3.14", b: "3.41", c: "2.14", d: "4.13", correta: "a"},
  {pergunta: "JavaScript roda no?", a: "Back-end", b: "Front-end", c: "Banco", d: "Somente servidor", correta: "b"}
];

let usadas = [];
let acertos = 0;
let perguntaAtual = null;
let respostaSelecionada = "";

function carregarPergunta() {
  if (usadas.length === 5) {
    document.getElementById("quiz-container").innerHTML = `<h2>Você acertou ${acertos} de 5 perguntas!</h2>`;
    return;
  }

  let i;
  do {
    i = Math.floor(Math.random() * perguntas.length);
  } while (usadas.includes(i));
  
  usadas.push(i);
  perguntaAtual = perguntas[i];
  respostaSelecionada = "";

  document.getElementById("pergunta").innerHTML = `<h2>${perguntaAtual.pergunta}</h2>`;
  
  document.getElementById("alternativas").innerHTML = `
    <label><input type="radio" name="resposta" value="a"> a) ${perguntaAtual.a}</label><br>
    <label><input type="radio" name="resposta" value="b"> b) ${perguntaAtual.b}</label><br>
    <label><input type="radio" name="resposta" value="c"> c) ${perguntaAtual.c}</label><br>
    <label><input type="radio" name="resposta" value="d"> d) ${perguntaAtual.d}</label><br>
  `;
}

function proximaPergunta() {
  const opcoes = document.getElementsByName("resposta");
  for (let op of opcoes) {
    if (op.checked) {
      respostaSelecionada = op.value;
      break;
    }
  }

  if (respostaSelecionada === "") {
    alert("Escolha uma alternativa antes de continuar.");
    return;
  }

  if (respostaSelecionada === perguntaAtual.correta) {
    acertos++;
  }

  carregarPergunta();
}

// Inicia o quiz
carregarPergunta();
