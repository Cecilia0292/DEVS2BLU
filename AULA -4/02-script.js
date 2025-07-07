    function converter() {
      const valor = parseFloat(document.getElementById("valor").value);
      const moeda = document.getElementById("moeda").value;
      const imagemMoeda = document.getElementById("imagemMoeda");
      let resultado = 0;
      let simbolo = "";

      if (isNaN(valor) || valor <= 0) {
        document.getElementById("resultado").innerText = "Por favor, insira um valor válido.";
        imagemMoeda.style.display = "none";
        return;
      }

      switch (moeda) {
        case "dolar":
          resultado = valor / 5.00;
          simbolo = "US$";
          imagemMoeda.src = "assets/dolar.png";
          break;
        case "euro":
          resultado = valor / 5.40;
          simbolo = "€";
          imagemMoeda.src = "assets/euro.png";
          break;
        case "libra":
          resultado = valor / 6.20;
          simbolo = "£";
          imagemMoeda.src = "assets/libra.png";
          break;
        case "bitcoin":
          resultado = valor / 250000;
          simbolo = "₿";
          imagemMoeda.src = "assets/bitcoin.png";
          break;
        default:
          document.getElementById("resultado").innerText = "Selecione uma moeda válida.";
          imagemMoeda.style.display = "none";
          return;
      }

      document.getElementById("resultado").innerText = `Resultado: ${simbolo} ${resultado.toFixed(6)}`;
      imagemMoeda.style.display = "block"; // Mostrar imagem
    }

    function limparCampos() {
      document.getElementById("valor").value = "";
      document.getElementById("moeda").value = "";
      document.getElementById("resultado").innerText = "";
      const imagemMoeda = document.getElementById("imagemMoeda");
      imagemMoeda.src = "";
      imagemMoeda.style.display = "none";
    }

function limparCampos() {
    document.getElementById("valor").value = "";
    document.getElementById("imagemMoeda").src = "assets/real.png";
    document.getElementById("resultado").innerText = "";
    document.getElementById("moeda").value = "";
}