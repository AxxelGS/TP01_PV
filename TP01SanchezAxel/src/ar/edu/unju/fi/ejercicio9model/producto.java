package ar.edu.unju.fi.ejercicio9model;

public class producto {
	//atributos
	private String nombre ;
	private int codigo;
	private double precio;
	private int descuento;
	
	public producto() {
		this.nombre= nombre;
		
	}
	
	public double calcularDescuento() {
		double precioFinal = precio - descuento;
		return precioFinal;
		
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre del producto: " + nombre);
		System.out.println("Codigo del producto: " + codigo);
		System.out.println("Precio del producto: " + precio);
		System.out.println("Descuento del producto: " + descuento);
		System.out.println("Precio final (con descuento) : " + calcularDescuento());
	}


	
	//getters and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getDescuento() {
		return descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
}