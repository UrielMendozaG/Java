package com.Practica7Array1D.app;

import java.util.Random;

public class primosArray {
	public static void main(String[] args) {
		// constants variables
		final int DIMENSION_ARREGLO = 10;
		
		//variables
		
		byte numerosPrimos = 0;
		boolean isPrimo = true;
		
		byte[] vector = new byte[DIMENSION_ARREGLO];
		
		//objects declarations
		
		Random numerosAleatorios = new Random(System.nanoTime());
		
		for(int i = 0; i < DIMENSION_ARREGLO; i++) {
			//castear es el proceso de cambiar un tipo de dato a otro
			vector[i] = (byte) numerosAleatorios.nextInt(101);
		}
		
		for(int i = 0; i < 	DIMENSION_ARREGLO; i++) {
			for(int j = 2; j < vector[i] - 1; j++) {
				if(vector[i]%j == 0) {
					isPrimo = false;
					break;
				}
				if(isPrimo) {
					numerosPrimos++;
				}
				
			}
		}
		
		
		
	}
}
