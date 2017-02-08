
package br.com.caelum.estoque.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;


@WebService(targetNamespace="http://caelum.com.br/v1/estoquews")
@Stateless
public class EstoqueWs {
	
	
	private static Map<String, ItemEstoque> repo = new HashMap<String, ItemEstoque>();
	
	public EstoqueWs() {
		super();
		repo.put("ARQ", new ItemEstoque("ARQ",100));
		repo.put("SOA", new ItemEstoque("SOA",200));
		repo.put("TDD", new ItemEstoque("TDD",300));
		repo.put("RES", new ItemEstoque("RES",400));
		repo.put("LOG", new ItemEstoque("LOG",500));
		repo.put("WEB", new ItemEstoque("WEB",600));
	}
	
	
	
	@WebMethod(operationName="ConsultaEstoque")
	public  @WebResult(name="Estoques") List<ItemEstoque> getItem(
			@WebParam(name="token", header=true) String token,
			@WebParam(name="codigo") List<String> codigos){
		
		if(null == token || !token.equalsIgnoreCase("123"))
			throw new AutorizationExcetption("Erro Autenticacao");
		
		List<ItemEstoque> items = new ArrayList<>();
		
		for (String codigo : codigos) {
		  items.add(repo.get(codigo));
		}
		
		return items;
	}

}
