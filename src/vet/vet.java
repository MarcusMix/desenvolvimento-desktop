package vet;

import java.util.Arrays;

public class vet {

	public static void main(String[] args) {
		int numeros[] = {7, 2, 4, 9};
		
		//percorrendo array de forma simples
		for(int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i]);
		}
		
		
		System.out.println("\n--------");
		
		//para cada indice de numeros, ele joga o valor em valor.
		for(int valor: numeros) {
			System.out.println("Número: " + valor);
		}
		
		
		//encontrar um valor usando pesquisa binária
		Arrays.sort(numeros);
		int posicao = Arrays.binarySearch(numeros, 9);
		System.out.println("Posição do número 9: ");
		System.out.println(posicao);
		
		
		//colocando em ordem
		Arrays.sort(numeros);
		for(int valor: numeros) {
			System.out.println("Números em ordem (do menor para o maior): " + valor);
		}
		
		//array com 200 zeros
		int arrayVazio[] = new int[200];
		Arrays.fill(arrayVazio, 0);
		
		for(int valor: arrayVazio) {
			System.out.print(valor);
		}
		
	}
}
 