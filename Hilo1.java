package Hilos2;
//Suma de los numeros
public class Hilo1 extends Thread{
    int y[] = new int[10];
    Hilo1(int x[]){
        y = x;
    }
    @Override
    public void run(){
        int suma = 0;
        for (int i = 0; i < y.length; i++) {
            suma += y[i];
        }
        System.out.println("Suma: " + suma);
    }
}
