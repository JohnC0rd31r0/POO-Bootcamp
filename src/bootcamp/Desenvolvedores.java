package bootcamp;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Desenvolvedores {
	
	private String nome;
	private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
	private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
	
	private Mentoria mentoria;
	private AtividadeCurso atividade;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void inscreverBootcamp(Bootcamp bootcamp) {
		this.conteudosInscritos.addAll(bootcamp.getConteudos());
		bootcamp.getDevsInscritos().add(this);
	}
	
	public void progredir() {
		Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
		if(conteudo.isPresent()) {
			this.conteudosConcluidos.add(conteudo.get());
			this.conteudosInscritos.remove(conteudo.get());
		}else {
			System.err.println("Você não está matriculado em nenhum conteúdo");
		}
	}
	
	public double calcularTotalXp() {
		return this.conteudosConcluidos.stream().mapToDouble(conteudo -> conteudo.calcularXp()).sum();
	}
	public Set<Conteudo> getConteudosInscritos() {
		return conteudosInscritos;
	}
	public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
		this.conteudosInscritos = conteudosInscritos;
	}
	@Override
	public int hashCode() {
		return Objects.hash(conteudosConcluidos, conteudosInscritos, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Desenvolvedores other = (Desenvolvedores) obj;
		return Objects.equals(conteudosConcluidos, other.conteudosConcluidos)
				&& Objects.equals(conteudosInscritos, other.conteudosInscritos) && Objects.equals(nome, other.nome);
	}
	public Set<Conteudo> getConteudosConcluidos() {
		return conteudosConcluidos;
	}
	public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
	}
	@Override
	public String toString() {
		return "Desenvolvedor: " + nome + ", Conteúdos Inscritos : " + conteudosInscritos + ", Conteudos concluidos:"
				+ conteudosConcluidos + ", mentoria: " + mentoria + ", atividade:" + atividade;
	}

}
