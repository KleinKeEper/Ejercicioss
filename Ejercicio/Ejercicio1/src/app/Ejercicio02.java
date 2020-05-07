package app;
public class Ejercicio02 extends Thread{
    int sumador = 0;
    int[] numeros = { 2, 7, 5, 4, 9, 3, 6, 8, 1, 10};
    public Ejercicio02(){
        System.out.println("Sumas");
    }
    @Override
    public void run() {
        for (int i : numeros) {
            try {Thread.sleep(1000);} catch (Exception e) {}
            this.sumador = this.sumador+(int)Math.pow(i, 3);
            System.out.println("sumador de los numeros "+this.sumador);
        }
        System.out.println("suma TOTAL de los numeros "+this.sumador);
    }

    public static void main(String[] args) {
        Thread sum = new Ejercicio02();
        sum.start();
    }
}