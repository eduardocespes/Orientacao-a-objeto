
public class TestaFuncionario {

	public static void main(String[] args) {
	
		Funcionario f1 = new Funcionario();
		f1.cargo = "Professor";
		f1.salario = 3000.00;
		
		Funcionario f2 = new Funcionario();
		f2.cargo = "Diretor";
		f2.salario = 7000.00;
		
		System.out.println("Cargo: " + f1.cargo);
		System.out.println("Salario: " +f1.salario);
		
		System.out.println("====================");
		
		System.out.println("Cargo: " + f2.cargo);
		System.out.println("Salario: " +f2.salario);
	
	}

}
