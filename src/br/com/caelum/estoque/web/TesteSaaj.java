package br.com.caelum.estoque.web;

import java.io.IOException;

import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPBodyElement;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;


public class TesteSaaj {
	
	public static void main(String[] args) throws SOAPException, IOException {
		
		MessageFactory factory = MessageFactory.newInstance();
		SOAPMessage message = factory.createMessage();
		SOAPBody body = message.getSOAPBody();
		QName qualifiedName = new QName("http://web.estoque.caelum.com.br", "ConsultaEstoque", "web");
		SOAPBodyElement element = body.addBodyElement(qualifiedName);
		SOAPElement codigoProduto = element.addChildElement(new QName("codigo"));
		codigoProduto.setValue("ARQ");
		
		message.writeTo(System.out);
		
		
		
		
	}
	

}
