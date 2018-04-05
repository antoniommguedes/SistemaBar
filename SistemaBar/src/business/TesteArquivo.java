package business;

import java.io.IOException;

public class TesteArquivo {

	public TesteArquivo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Cliente c1 =  new Cliente("Fulano", "032145784", 61, 'M');
		Cliente c2 =  new Cliente("Beltrano", "124578954", 72, 'M', "012345");
	
		Bar bar = new Bar();
		
		bar.addCliente(c1);
		bar.addCliente(c2);
		//bar.removeCliente("032145784");
		try {
			bar.gerarTxt();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(bar.ListaClientes());
		
		System.out.println(bar.TotalPessoas());
		
		
		
	}

}
