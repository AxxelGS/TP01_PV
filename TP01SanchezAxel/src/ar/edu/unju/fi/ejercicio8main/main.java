package ar.edu.unju.fi.ejercicio8main;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio8model.Calculador;
public class main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insertar valor para la suamtoria: ");
		int n = sc.nextInt();
		Calculador calc = new Calculador(n);
		calc.calcularSumatoria();
		Calculador calc2 = new Calculador(n);	
		calc2.calcularProductoria();
	}
}