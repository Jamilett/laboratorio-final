package com.gm.mundopc;

public class Orden {

    private int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private static int contadorComputadoras; // Static porque si no el contador sería 1 siempre   
    private static final int MAX_COMPUTADORAS = 10;

    public Orden() {
        idOrden = ++contadorOrdenes;
        computadoras = new Computadora[MAX_COMPUTADORAS];
    }

    /**
     * 
     * @param computadora 
     */
    public void agregarComputadora(Computadora computadora) {

        if (contadorComputadoras < MAX_COMPUTADORAS) {
            computadoras[contadorComputadoras++] = computadora;
        } else {
            System.out.println("Se ha superado el maximo de computadoras: " + MAX_COMPUTADORAS);
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < contadorComputadoras; i++) {
            Computadora computadora = computadoras[i];
            total += computadora.getPrecio();
        }
        return total;
    }

    public void mostrarOrden() {
        System.out.println("ID orden # " + idOrden);
        System.out.println("Total $ " + calcularTotal());
        System.out.println("Características: ");
        for (int i = 0; i < contadorComputadoras; i++){
            System.out.println(computadoras[i]);
        }

    }

    public static int getContadorComputadoras() {
        return contadorComputadoras;
    }

}
