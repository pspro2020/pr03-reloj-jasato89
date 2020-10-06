package ejercicio3.reloj;

import java.util.concurrent.TimeUnit;

public class main {

    public static void main(String[] args)  {

        try {

            Thread thread = new Thread(new Clock());
            thread.start();
            TimeUnit.SECONDS.sleep(12);
            thread.interrupt();
            System.out.println("El hilo secundario ha terminado de ejecutarse");

        } catch (InterruptedException e) {

        }





    }
}
