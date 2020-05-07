package app;

public class Ejercicio04 extends Thread {
 String nombre;
 public Ejercicio04 (int prioridad,String nombre){
 this.nombre=nombre;
 setPriority(prioridad);
}
 public void run(){
 for(int c=1;c<=30;c++){
 System.out.print(c+"mt ");
 yield(); 
 }
 System.out.println("\n Llego a la meta " + nombre);
}
 static Ejercicio04 leopardo1;
 static Ejercicio04 leopardo2;
 static Ejercicio04 leopardo3;
 public static void main(String []args) throws InterruptedException {
 leopardo2 = new Ejercicio04(1," leopardo2 ");
 leopardo1 = new Ejercicio04(5," leopardo1 ");
 leopardo3 = new Ejercicio04(8," leopardo3 ");
 leopardo2.start();
 leopardo1.start();
 leopardo3.start();
 leopardo2.join();
 leopardo1.join();
 leopardo3.join();
 }
}