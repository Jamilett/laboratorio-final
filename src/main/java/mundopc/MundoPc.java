package mundopc;

import com.gm.mundopc.Computadora;
import com.gm.mundopc.Monitor;
import com.gm.mundopc.Orden;
import com.gm.mundopc.Raton;
import com.gm.mundopc.Teclado;

public class MundoPc {

    public static void main(String[] args) {

        // Primer Computadora
        Monitor monitor1 = new Monitor("HP", 7.5);
        Teclado teclado1 = new Teclado("USB", "HP");
        Raton raton1 = new Raton("Inalambrica", "HP");
        Computadora compu1 = new Computadora("HP", 17000, monitor1, teclado1);

        // Segunda Computadora
        Monitor monitor2 = new Monitor("Sony", 15);
        Teclado teclado2 = new Teclado("Inalambrico", "Unknown");
        Raton raton2 = new Raton("Inalambrica", "HP");
        Computadora compu2 = new Computadora("Sony", 15000, monitor2, teclado2);

        // Tercera Computadora
        Monitor monitor3 = new Monitor("MAC", 15);
        Teclado teclado3 = new Teclado("Inalambrico", "MAC");
        Raton raton3 = new Raton("Inalambrica", "MAC");
        Computadora compu3 = new Computadora("MAC", 30000, monitor3, teclado3);
        
        // Orden
        Orden orden = new Orden();
        orden.agregarComputadora(compu1);
        orden.agregarComputadora(compu2);
        orden.agregarComputadora(compu3);

        for (int i = 1; i <= 4; i++) {
            Monitor monitorMac = new Monitor("MAC Pro", 15);
            Teclado tecladoMac = new Teclado("Inalambrico", "MAC Pro");
            Raton ratonMac = new Raton("Inalambrica", "MAC Pro");
            Computadora compuMac = new Computadora("MAC Pro", 50000, monitorMac, tecladoMac);
            orden.agregarComputadora(compuMac);
        }

        System.out.println("Total de Computadoras: " + Orden.getContadorComputadoras());
        orden.mostrarOrden();
        

    }

}
