package br.com.alura.javaServelet.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<Empresa>();
	
	static {
		Empresa empresa = new Empresa();
		empresa.setName("Netflix");
		Empresa empresa2 = new Empresa();
		empresa2.setName("Fiap");
		Empresa empresa3 = new Empresa();
		empresa3.setName("Alura");
		lista.add(empresa);
		lista.add(empresa2);
		lista.add(empresa3);
	}

	public void adiciona(Empresa empresa) {
		lista.add(empresa);
		System.out.println("cadastro feito no banco");
	}
	
	public List<Empresa> getEmpresas(){
		
		return Banco.lista;
	}
	
	
}
