package bootcamp;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		AtividadeCurso curso1 = new AtividadeCurso();
		curso1.setTitulo("Curso PHP");
		curso1.setDescricao("Descrição curso PHP");
		curso1.setCargaHoraria(2);
		
		
		AtividadeCurso curso2 = new AtividadeCurso();
		curso2 .setTitulo("Curso POO");
		curso2 .setDescricao("Descrição curso POO");
		curso2 .setCargaHoraria(3);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria Java");
		mentoria.setDescricao("Descrição Mentoria Java");
		mentoria.setDataMentoria(LocalDate.now());
		
		
//		System.out.println(curso1);
//		System.out.println(curso2);
//		System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("bootcamp");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Desenvolvedores dev1 = new Desenvolvedores();
		dev1.setNome("John");
		dev1.inscreverBootcamp(bootcamp);
		dev1.progredir();
		System.out.println(dev1.calcularTotalXp());
		dev1.progredir();
		System.out.println(dev1.calcularTotalXp());
		dev1.progredir();
		System.out.println(dev1.calcularTotalXp());

		System.out.println(dev1);
	}

}
