package app;
public class Ejercicio01{
    public static void main(String[] args) {
        Thread descendentes = new ascendentes();
        Thread acendentes = new descendentes();
        descendentes.start();
        acendentes.start();
    }
}
class ascendentes extends Thread{
    public ascendentes(){
        System.out.println("Números Ascendentes: ");
    }
    @Override
    public void run(){
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(i);
        }
    }
    
}
class descendentes extends Thread{
    public descendentes(){
        System.out.println("Números Descendentes: ");
    }
    @Override
    public void run(){
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
    }
}