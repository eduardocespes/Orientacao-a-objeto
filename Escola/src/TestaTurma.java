
public class TestaTurma {
	public static void main(String[] args) {

		Turma t1 = new Turma();
		t1.periodo = "manh�";
		t1.serie = "1� ano";
		t1.sigla = "ST1";
		t1.tipoEnsino = "prova";
		
		Turma t2 = new Turma();
		t2.periodo = "tarde";
		t2.serie = "2� ano";
		t2.sigla = "ST2";
		t2.tipoEnsino = "teste";
		
		System.out.println(t1.periodo);
		System.out.println(t1.serie);
		System.out.println(t1.sigla);
		System.out.println(t1.tipoEnsino);
		System.out.println("============================");
		System.out.println(t2.periodo);
		System.out.println(t2.serie);
		System.out.println(t2.sigla);
		System.out.println(t2.tipoEnsino);
		
		
		
		
	}

}
