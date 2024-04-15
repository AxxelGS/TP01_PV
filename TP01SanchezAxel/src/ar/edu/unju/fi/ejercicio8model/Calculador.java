package ar.edu.unju.fi.ejercicio8model;

public class Calculador {

	private int a;
	
	public Calculador(int a){
		this.a=a;
	}
	
	//sumatoria
	public void calcularSumatoria() {
		int n1 =0;
		int n =1;	
		for (int k =1;k<=a;k++) {
			n = (k*(k+1)/2) ;
			n=n*n;
			n1 = n1 + n; 
		}
		System.out.println("El resultado de la sumatoria es: " + n1);	
	}
	
	//productoria
	public void calcularProductoria() {
		int n1 =1;
		int n =1;
		for (int k =1;k<=a;k++) {
			n = k*(k+4) ;
			n1 = n1 * n; 
		}
		System.out.println("El resultado de la productoria es: " + n1);
	}
}