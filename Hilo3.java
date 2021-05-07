package Hilos2;
//Media
public class Hilo3 extends Thread{
    int y[] = new int[10];

    Hilo3(int x[]){
        y = x;
    }
    @Override
    public void run(){
        int suma = 0;
        for (int i = 0; i < y.length; i++) {
            suma += y[i];
        }
        System.out.println("Media: " + suma/y.length);
    }
}
