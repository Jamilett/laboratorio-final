package com.gm.mundopc;

public class Computadora {

    private int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private double precio;
    private static int contadorComputadoras;

    private Computadora() {
        // Inicializa el idComputadora
        this.idComputadora = ++contadorComputadoras;

    }

    /**
     * Constructor sobrecargado el cual llama al constructor default e inicializa el contador.
     * @param nombre
     * @param precio
     * @param monitor
     * @param teclado 
     */
    public Computadora(String nombre, double precio, Monitor monitor, Teclado teclado) {
        this(); // Llamada al constructor vacío
        this.nombre = nombre;
        this.precio = precio;
        this.monitor = monitor;
        this.teclado = teclado;        
    }

    public int getIdComputadora() {
        return this.idComputadora;
    }

    public void setIdComputadora(int idComputadora) {
        this.idComputadora = idComputadora;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return this.monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return this.teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return this.raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getContadorCompitadoras() {
        return this.contadorComputadoras;
    }

    @Override
    public String toString() {
        return "Computadora{" + "idComputadora=" + idComputadora + ", nombre=" + nombre + ", monitor=" + monitor + ", teclado=" + teclado + ", raton=" + raton + ", precio=" + precio + '}';
    }

}
