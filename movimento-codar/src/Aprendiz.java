
public class Aprendiz{
	private String compartilharExperiencias;
	private boolean participarEvento;
	private String duvidasTecnicas;
	private Integrantes integrantes;
	private String duvidasProcessosRegras;
	private boolean fazerCursos;
	
	
	public String getCompartilharExperiencias() {
		return compartilharExperiencias;
	}

	public void setCompartilharExperiencias(String compartilharExperiencias) {
		this.compartilharExperiencias = compartilharExperiencias;
	}
	
	public String getDuvidasTecnicas() {
		return duvidasTecnicas;
	}

	public void setDuvidasTecnicas(String duvidasTecnicas) {
		this.duvidasTecnicas = duvidasTecnicas;
	}

	public String getDuvidasProcessosRegras() {
		return duvidasProcessosRegras;
	}

	public void setDuvidasProcessosRegras(String duvidasProcessosRegras) {
		this.duvidasProcessosRegras = duvidasProcessosRegras;
	}
	
	public Integrantes getIntegrantes() {
		return integrantes;
	}
	public void setIntegrantes(Integrantes integrantes) {
		this.integrantes = integrantes;
	}
	
	
	
	public boolean isCursos() {
		return fazerCursos;
	}

	public void setCursos(boolean cursos) {
		this.fazerCursos = cursos;
		if(this.fazerCursos == true) {
			System.out.println("Você realizou mais um curso e desenvolveu novas habilidades!");
			
		} else {
			System.out.println("Você não realizou o curso, então não desenvolveu"
					+ " novas habilidades!");
		}
	}

	public void setParticiparEvento(boolean participarEvento) {
		this.participarEvento = participarEvento;
		if(this.participarEvento == true) {
			System.out.println("Participou do evento!");
			
		} else {
			System.out.println("Não participou do evento!");
		}
	}

	public boolean isParticiparEvento() {
		return participarEvento;
	}
	
	

}
