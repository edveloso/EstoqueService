package br.com.caelum.estoque.web;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;



@MessageDriven(
		activationConfig={
				@ActivationConfigProperty(propertyName="destinationLookup",propertyValue="jms/TOPICO.LIVRARIA"),
				@ActivationConfigProperty(propertyName="destinationType",propertyValue="javax.jms.Topic"),
				@ActivationConfigProperty(propertyName="messageSelector",propertyValue="formato='ebook'")
		}
		)
public class GeradorMDB implements MessageListener{

	@Override
	public void onMessage(Message msg) {
			try {
				System.out.println("Gerador mdb com selecao do wildfly: "+((TextMessage) msg).getText());
			} catch (JMSException e) {
				e.printStackTrace();
			}
	}

}
