package br.com.alura.cliente;

import java.io.IOException;

import org.apache.http.client.fluent.Request;

public class ClienteWebService {

	public static void main(String[] args) throws IOException{
		
		String conteudo = Request.Post("http://localhost:8080/gerenciador/empresas")
		.addHeader("Accept","application/json")
	    .execute()
	    .returnContent()
	    .toString();
		
		
		System.out.println(conteudo);
	}
}
