package ar.edu.unju.fi.ejercicio10model;

public class Pizza {
    private int diametro;
    private int precio;
    private double area;
    private boolean ingredientesEspeciales;
    private final int Ad20 = 500;
    private final int Ad30 = 750;
    private final int Ad40 = 1000;

    public Pizza() {

    }

    public Pizza(int diametro, boolean ingredientesEspeciales) {
        this.diametro = diametro;
        this.ingredientesEspeciales = ingredientesEspeciales;
        calcularPrecio();
        calcularArea();
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public boolean isIngredientesEspeciales() {
        return ingredientesEspeciales;
    }

    public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
        this.ingredientesEspeciales = ingredientesEspeciales;
    }

    public void calcularPrecio() {
        switch (diametro) {
            case 20:
                precio = ingredientesEspeciales ? 4500 + Ad20 : 4500;
                break;
            case 30:
                precio = ingredientesEspeciales ? 4800 + Ad30 : 4800;
                break;
            case 40:
                precio = ingredientesEspeciales ? 5500 + Ad40 : 5500;
                break;
            default:
                System.out.println("Diámetro no válido");
                break;
        }
    }

    public void calcularArea() {
        area = Math.PI * Math.pow(diametro / 2.0, 2);
    }
}