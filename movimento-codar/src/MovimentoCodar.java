
public class MovimentoCodar {
	public static void main(String[] args) {
		Integrantes primeiraConta = new Integrantes();
        primeiraConta.setNome("teste"); 
        System.out.println(primeiraConta.getNome()); 
        
        Aprendiz aprendiz = new Aprendiz();
        Integrantes lia = new Integrantes();
        lia.setNome("Lia");
        aprendiz.setIntegrantes(lia);
        lia.setEmail("lia@gmail.com");
        lia.setUserDiscord("llia");
        System.out.println("Nome do ou da aprendiz: " + aprendiz.getIntegrantes().getNome());
        System.out.println("Email do ou da aprendiz: " + aprendiz.getIntegrantes().getEmail());
        System.out.println("User do discord do ou da aprendiz: " + aprendiz.getIntegrantes().getUserDiscord());
        aprendiz.setParticiparEvento(true);
        System.out.println(aprendiz.isParticiparEvento());
        aprendiz.setCursos(false);
        System.out.println(aprendiz.isCursos()); 
        aprendiz.setDuvidasTecnicas("alguma duvida aqui");
        aprendiz.setDuvidasProcessosRegras("alguma outra duvida aqui");
        aprendiz.setCompartilharExperiencias("experiencia adquirida em xxx projeto");
        System.out.println(aprendiz.getDuvidasTecnicas());
        System.out.println(aprendiz.getDuvidasProcessosRegras());
        System.out.println(aprendiz.getCompartilharExperiencias());
        
        
        Mentores mentor = new Mentores();
        
        Integrantes julio = new Integrantes();
        Desafios d = new Desafios();
        julio.setNome("Julio");
        mentor.setDesafios(d);
        d.setDescricao("abc");
        mentor.setIntegrantes(julio);
        System.out.println();
        System.out.println();
        System.out.println(mentor.getIntegrantes().getNome());
        mentor.setResponderPerguntasTecnicas("resposta");
        mentor.setCompartilharExperiencias("experiencia y");
        System.out.println("Descrição do desafio: " + mentor.getDesafios().getDescricao());
        
	}
}
