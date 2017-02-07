package br.com.caelum.estoque.web;
import javax.xml.ws.WebFault;


@WebFault(name="ErroAuth")
public class AutorizationExcetption extends RuntimeException {

	   public AutorizationExcetption(String erro) {
		   super(erro);
	   }
	
}
