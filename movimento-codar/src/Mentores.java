
public class Mentores {
	
	private String compartilharExperiencias;
	private Desafios desafios;
	private Integrantes integrantes;
	private CriarEvento evento;
	private String MinistrarEvento = "Realizar Evento";
	private String perguntarParaOrganizador;
	private String responderPerguntasTecnicas;
	
	public CriarEvento getEvento() {
		return evento;
	}
	public void setEvento(CriarEvento evento) {
		this.evento = evento;
	}
	
	public Integrantes getIntegrantes() {
		return integrantes;
	}
	public void setIntegrantes(Integrantes integrantes) {
		this.integrantes = integrantes;
	}
	public Desafios getDesafios() {
		return desafios;
	}
	public void setDesafios(Desafios desafios) {
		this.desafios = desafios;
	}
	
	public String MinistrarEvento() {
		return MinistrarEvento;
	}
	public String getCompartilharExperiencias() {
		return compartilharExperiencias;
	}
	public void setCompartilharExperiencias(String compartilharExperiencias) {
		this.compartilharExperiencias = compartilharExperiencias;
	}
	public String getPerguntarParaOrganizador() {
		return perguntarParaOrganizador;
	}
	public void setPerguntarParaOrganizador(String perguntarParaOrganizador) {
		this.perguntarParaOrganizador = perguntarParaOrganizador;
	}
	public String getResponderPerguntasTecnicas() {
		return responderPerguntasTecnicas;
	}
	public void setResponderPerguntasTecnicas(String responderPerguntasTecnicas) {
		this.responderPerguntasTecnicas = responderPerguntasTecnicas;
	}
	
	
}
