package Hilos2;
//Suma de los cuadrados
public class Hilo2 extends Thread{
    int y[] = new int[10];

    Hilo2(int x[]){
        y = x;
    }
    
    @Override
    public void run(){
        int suma = 0;
        for (int i = 0; i < y.length; i++) {
            suma += y[i] * y[i];
        }
        System.out.println("Suma de los cuadrados: " + suma);
    }
}
