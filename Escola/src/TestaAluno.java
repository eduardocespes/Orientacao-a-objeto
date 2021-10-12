
public class TestaAluno {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno();
		a1.nome = "Alfredo";
		a1.rg = "123.456.789-10";
		a1.dataNascimento = "10/01/2000";
		
		Aluno a2 = new Aluno();
		a2.nome = "Eduardo";
		a2.rg = "987.654.321-10";
		a2.dataNascimento = "28/12/1984";
		
		System.out.println(a1.nome);
		System.out.println(a1.rg);
		System.out.println(a1.dataNascimento);
		
		System.out.println("==================");
		
		System.out.println(a2.nome);
		System.out.println(a2.rg);
		System.out.println(a2.dataNascimento);
	}

}
