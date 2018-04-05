package business;
import java.util.ArrayList;

public class Bar {

	private ArrayList<Cliente> clientes = new ArrayList();

	public Bar() {
	}

	public String ListaClientes() { // MÉTODO RETORNA TODOS CLIENTES
		String cliente = null;
		for (int i = 0; i < clientes.size(); i++) {
			cliente = cliente + clientes.get(i).getNome();

		}

		return cliente;

	}

	public boolean BuscaCpf(String cpf) { //consulta cpf

		for (int i = 0; i < clientes.size(); i++) {

			if (clientes.get(i).getCpf().equals(cpf))
				return true;

		}

		return false;
	}
	
	public int TotalPessoas() { //total de pessoas
		
		return clientes.size();
		
	}
	
	public double porcentHomem() { // porcentagem homens
		int conthomem = 0;
		for (int i = 0; i < clientes.size(); i++) {
			 if( clientes.get(i).getGenero() == 'M')
				 conthomem++;
		}
		
		return (conthomem *100) / clientes.size();
	}

	public double porcentMulher() { //porcentagem mulheres
		int contmulher = 0;
		for (int i = 0; i < clientes.size(); i++) {
			 if( clientes.get(i).getGenero() == 'F')
				 contmulher++;
		}
		
		return (contmulher *100) / clientes.size();
	}
	
	public int socios() {
		int contsocio = 0;
		for (int i = 0; i < clientes.size(); i++) {
			 if( !clientes.get(i).getSocio().equals(null))
				 contsocio++;
		}
		
		return contsocio;
	}
	
	public int naoSocios() {
		int contNaoSocio = 0;
		for (int i = 0; i < clientes.size(); i++) {
			 if( clientes.get(i).getSocio().equals(null))
				 contNaoSocio++;
		}
		
		return contNaoSocio;
	}
	
	public void addCliente(Cliente c) {
		clientes.add(c);
	}
	
	public void removeCliente(String cpf) {
		for (int i = 0; i < clientes.size(); i++) {
			 if( clientes.get(i).getCpf().equals(cpf)) {
				 clientes.remove(clientes.get(i));
			 }
		}
	}
	
	
	
	
}
