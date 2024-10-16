package funçoes;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		iphone meuIphone = new iphone();
		
		// reprodutor musical
		meuIphone.selecionarMusica("Living for a prayer");
		meuIphone.tocar();
		meuIphone.pausar();
		
		// aparelho telefonico 
		
		meuIphone.ligar("123456790");
		meuIphone.atender();
		meuIphone.iniciarCorreioVoz();
		
		// navegador
		
		meuIphone.exibirPagina("http://www.google.com");
		meuIphone.adicionarNovaAba();
		meuIphone.atualizarPagina();
		
	}

}
