package ar.edu.unju.fi.ejercicio6model;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
public class persona {
	
	private String dni;
	private String nombre;
	private LocalDate fechaNacimiento;
	private String provincia;
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public persona() {
	}

	public persona(String dni, String nombre, LocalDate fnac, String provincia) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fnac;
		this.provincia = provincia;
	}

	public persona( String dni, String nombre, LocalDate fnac) {
		this.dni = dni;
		this.nombre = nombre;
		this.provincia = "jujuy";
		this.fechaNacimiento = fnac;
	}

	public int calcularEdad() {
		LocalDate actual = LocalDate.now();
		Period años = Period.between(fechaNacimiento, actual); 
		int edad = años.getYears();
		return edad;
	}

	public String mayorDeEdad () {
			
		if (calcularEdad()>18) {
			String legal=" Es mayor de 18";
			return legal;
		}else {
			String legal=" Es menor de 18";
			return legal;
		}
	}

	public void  mostrarDatos() {
			System.out.println("DNI: " + dni);
			System.out.println("Nombre: " + nombre);
		try {
			System.out.println("Feha de Nacimiento: " + fechaNacimiento.format(formatter));
		}catch(Exception e) {
			System.out.println("Fecha de Nacimiento: " + "no se puede calcular sin valores");
		}
			System.out.println("Provincia: " + provincia);
		try {
			System.out.println("Edad: " + calcularEdad());
		}catch(Exception e) {
			System.out.println("Edad: " + "no se puede calcular sin valores");
		}
		try {
			System.out.println("El usuario " + nombre + mayorDeEdad());
		}catch(Exception e) {
			System.out.println("El usuario " + " no se puede calcular si es mayor de edad sin valores");
		}
	}
	
	//getters and setters
	public String getDni() {
		return dni;
	}

	public void setDni(String string) {
		this.dni = string;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNac() {
		return fechaNacimiento;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNacimiento = fechaNac;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	
}