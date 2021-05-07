package Hilos2;

public class Principal {
    public static void main(String args[]){
        int x[] = new int[10];
        for ( int i = 0; i < x.length; i++) {
            x[i] = (int) (Math.random() * 10);
        }
        System.out.println("Numeros generados: ");
        for (int i = 0; i < x.length; i++) {
            System.out.printf("%d, ", x[i]);
        }
        System.out.println("\nCorrida de los hilos: ");
        Hilo1 h1 = new Hilo1(x);
        Hilo2 h2 = new Hilo2(x);
        Hilo3 h3 = new Hilo3(x);
        h1.start();
        h2.start();
        h3.start();
    }
}
