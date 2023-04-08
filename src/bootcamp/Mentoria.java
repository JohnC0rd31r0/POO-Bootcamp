package bootcamp;

import java.time.LocalDate;
import java.util.Date;

public class Mentoria extends Conteudo{
	
	private LocalDate dataMentoria;
	
	public LocalDate getDataMentoria() {
		return dataMentoria;
	}
	public void setDataMentoria(LocalDate localDate) {
		this.dataMentoria = localDate;
	}
	
 	@Override
	public String toString() {
		return "Mentoria Dia: " + dataMentoria + getTitulo() + ", Descrição "
				+ getDescricao()+ "/n";
	}
	@Override
	public double calcularXp() {
		return XP_PADRAO + 20d;
	}
	
}
