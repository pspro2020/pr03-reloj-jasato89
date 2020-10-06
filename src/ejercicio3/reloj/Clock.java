package ejercicio3.reloj;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Clock implements Runnable{

    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");


    @Override
    public void run() {

        while (!Thread.currentThread().isInterrupted()) {

            System.out.println(LocalDateTime.now().format(dateTimeFormatter));
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                return;
            }
        }

    }
}
