package pattern.objectpool;

public class TestaPool {

	public static void main(String[] args) {
		Pool<Funcionario> funcionarioPool = new FuncionarioPool();
		Funcionario funcionario = funcionarioPool.acquire();
		while(funcionario != null){
			System.out.println(funcionario.getNome()) ;
			funcionario = funcionarioPool.acquire() ;
		}
	}

}
