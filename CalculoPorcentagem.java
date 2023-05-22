public class CalculoPorcentagem {
  public void calculaPorcentagem(Pessoa pessoa) {
    if (pessoa.estaRetornandoViagem.equals("SIM") || pessoa.teveContatoComPessoasSintomaticas.equals("SIM") || pessoa.teveSintomasRecentemente.equals("SIM")){
      pessoa.porcentagemInfeccao += 300;
    }

    else if (pessoa.cartaoVacinaEmDia.equals("NAO")) {
      pessoa.porcentagemInfeccao += 100;
    }
  }
  }

