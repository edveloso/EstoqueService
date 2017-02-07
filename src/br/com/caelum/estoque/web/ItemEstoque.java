package br.com.caelum.estoque.web;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="ItemEstoque")
public class ItemEstoque implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public String toString() {
		return "ItemEstoque [codigo=" + codigo + ", quantidade=" + quantidade
				+ "]";
	}

	private String codigo;
	
	private Integer quantidade;


	public ItemEstoque(){
      super();		
	}
	
	public ItemEstoque(String codigo, int quantidade) {
		this.codigo = codigo;
		this.quantidade = quantidade;
	}
	

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
