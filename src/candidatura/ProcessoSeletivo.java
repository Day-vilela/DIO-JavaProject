package candidatura;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		System.out.println("Processo Seletivo\n");
		//selecaoCandidatos();
		imprimirSelecionados();
	}
	
	static void imprimirSelecionados() {
		String [] candidatos = {"FELIPE", "PATRICIA", "JULIA", "PAULO", "AUGUSTO"};
		
		System.out.println("Imprimir a lista de candidatos informando o indice do elemento");
		
		for (int indice = 0; indice < candidatos.length; indice ++ ) {
			System.out.println("O candidato de N° " + (indice+1) + " é " + candidatos[indice]);
			
		}
		
		System.out.println(" ");
		System.out.println("forma abreviada de interação for each");
		
		for (String candidato: candidatos ) {
			System.out.println("O candidato selecionado foi " + candidato);
			
		}
		
	}
	
	static void selecaoCandidatos() {
		String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELE", "JORGE"};
		
		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.0;
		while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.printf("O candidato %s solicitou este valor de salario: %.2f%n", candidato, salarioPretendido);
			if (salarioBase >= salarioPretendido) {
				System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
				candidatosSelecionados++;
				
			} else {
				System.out.println("O candidato não foi selecionado");
			}
			System.out.println("_________________________________________________________________");
			candidatoAtual++; 
		}
	}
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.00;
		if (salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO");
			
		} else if(salarioBase == salarioPretendido){
			System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA");

		}else {
			System.out.println("AGUARDAR RESULTADO DEMAIS CANDIDATOS");
		}
	}
	
}
