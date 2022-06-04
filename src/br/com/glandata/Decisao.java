package br.com.glandata;

public class Decisao {
	/**
	 * Descrever para que ser este metodo/classe (comentario de documentacao)
	 * Esta classe e responsavel por executar o programa principal 
	 * e mostra as opcoes de condicao if
	 * @param args recebe os argumentos de execucao
	 */
	public static void main(String[] args) {
				
		// Nao fazer comentarios utilizando caracteres especiais
		int primeiraNota = 8; // comentario pode ser colocado apos o comando
		int segundaNota = 6;
		
		// Condicao SE menor que (<)
		if (primeiraNota < segundaNota) {
			System.out.println("Segunda nota é maior");
		}else {
			System.out.println("Primeira nota é maior");
		}
        // Condicao igual (==)
		if (primeiraNota == segundaNota) {
			System.out.println("É igual");
		} else {
			System.out.println("É diferente");
		}
		// Condicao com E (&&)
		if ((primeiraNota > 1) && (segundaNota>1)) {
			System.out.println("Valor Positivo");
		} else {
			System.out.println("Valor Negativo");
		}

		// Condicao com OU (||)
		if ((primeiraNota == 1) || (segundaNota == 1)) {
			System.out.println("Um dos valores é igual a 1");
		} else {
			System.out.println("Não tem valor igual a 1");
		}
				
		// Igual ==
		// Diferente !=
		// Menor <
		// Maior >		
		// Operador de inversão ! (primeiraNota > segundaNota)		
		
		int hora = 20;
		
		// if encadeado
		if (hora < 10) {
			System.out.println("Bom Dia!");
		}else if(hora < 20) {
			System.out.println("Boa Tarde!");
		}else {
			System.out.println("Boa Noite!");
		}
			
		int idade = 16;
		
		// Operador ternário (condicao ? (então) ... : (senao) ...
		
		System.out.println(idade < 18 ? "Não pode dirigir" : "Pode dirigir");

		int idade1 = 50;
		
		// Retorno unico em uma unica linha
		
		if(idade1 >= 50) System.out.println("Você já faz parte da velha guarda");
		
		// Se tiver mais de uma impressão tem que usar chaves {}, pois reconhece somente a primeira linha
		
		if (idade1 >= 50) {
			System.out.println("Teste");
		}
	}

}
