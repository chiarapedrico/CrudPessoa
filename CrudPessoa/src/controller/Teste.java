package controller;

public class Teste {

	public static void main(String[] args) {
		RepositoryPessoaFisica rpf = new RepositoryPessoaFisica();
		RepositoryPessoaJuridica rpj = new RepositoryPessoaJuridica();
		
		PessoaFisica pf1 = new PessoaFisica("Chiara");
		pf1.setCpf("22345678900");
		rpf.cria(pf1);
		rpf.retornaLista();
		System.out.println( rpf.retornaLista().get(0).getCpf());
		rpf.atualiza(pf1);
		
	}

}
