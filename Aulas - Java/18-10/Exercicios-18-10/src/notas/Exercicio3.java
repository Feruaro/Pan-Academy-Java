/* Crie de  uma classe Aluno com os seguintes atributos e m�todos: 
 - String nome, double[] notas; 
 - aprovado(), maiorNota() e media() (al�m dos getters e setters necess�rios).
 - Dadas as notas: double[] notas = {10, 5.0, 7.0, 9.0, 10.0};, 
   retorne as seguintes observa��es sobre o aluno: 
   a maior nota, m�dia e caso m�dia maior que 7 = aprovado.*/

package notas;

public class Exercicio3 {

	public static void main(String[] args) {
		
		double[] notas = {10.0, 5.0, 7.0, 9.0, 10.0};
		Alunos aluno = new Alunos("Fernanda", notas);
		

	}

}
