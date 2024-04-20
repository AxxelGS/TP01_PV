package ar.edu.unju.fi.ejercicio12model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Persona {
    private String nombre;
    private Calendar fechaNacimiento;

    public Persona(String nombre, Calendar fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int calcularEdad() {
        Calendar today = new GregorianCalendar();
        int age = today.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
        if (today.get(Calendar.DAY_OF_YEAR) < fechaNacimiento.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }
        return age;
    }

    public String obtenerSignoZodiaco() {
        int mes = fechaNacimiento.get(Calendar.MONTH) + 1; // Se suma 1 porque los meses en Calendar van de 0 a 11
        int dia = fechaNacimiento.get(Calendar.DAY_OF_MONTH);
        String signo = "";
        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            signo = "Aries";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            signo = "Tauro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            signo = "Géminis";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            signo = "Cáncer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            signo = "Leo";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            signo = "Virgo";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            signo = "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            signo = "Escorpio";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            signo = "Sagitario";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            signo = "Capricornio";
        } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            signo = "Acuario";
        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
            signo = "Piscis";
        }
        return signo;
    }

    public String obtenerEstacion() {
        int mes = fechaNacimiento.get(Calendar.MONTH) + 1; // Se suma 1 porque los meses en Calendar van de 0 a 11
        String estacion = "";
        if (mes >= 3 && mes <= 5) {
            estacion = "Primavera";
        } else if (mes >= 6 && mes <= 8) {
            estacion = "Verano";
        } else if (mes >= 9 && mes <= 11) {
            estacion = "Otoño";
        } else { // Meses 12, 1, 2
            estacion = "Invierno";
        }
        return estacion;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String fechaFormateada = dateFormat.format(fechaNacimiento.getTime());
        return "Nombre: " + nombre + "\nFecha de nacimiento: " + fechaFormateada;
    }
}