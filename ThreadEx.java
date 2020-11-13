package  exemploThread ;

public  class  ThreadExemple {
	
	public  void  calculaTotalRecebido () {
		  novo  tópico () {

		    @Sobrepor
		    public  void  run () {
		      // Recebe aproximadamente 70mil registros.
		      Lista < HistoricoRecebimento > recebidos = getListRecebimentos ();
		      Soma inteiro =  0 ;

		      para ( HistoricoRecebimento h1 : Recebidos) {
		        soma = soma + Recebidos . getValorRecebido ();
		      }

		      Integer porcentagemImposto = getReajusteAtualFromWebService ();

		      soma = soma + ((porcentagemImposto / 100 ) * soma);

		      retornaParaWebServiceValorTotal (soma);

		    }
		  } . começar();

		}
	
}
