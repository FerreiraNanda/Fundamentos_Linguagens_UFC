import java.util.*;


class SensorTemperatura extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            double temp = 20 + Math.random() * 10;
            System.out.printf("[Temperatura] Leitura %d: %.2f ºC%n", i, temp);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Sensor de temperatura interrompido.");
            }
        }
    }
}

class SensorUmidade extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            double umidade = 40 + Math.random() * 20;
            System.out.printf("[Umidade] Leitura %d: %.2f%%%n", i, umidade);
            try {
                Thread.sleep(1200);
            } catch (InterruptedException e) {
                System.out.println("Sensor de umidade interrompido.");
            }
        }
    }
}

public class ConcorrenciaSensores {
    public static void main(String[] args) {
        SensorTemperatura tempSensor = new SensorTemperatura();
        SensorUmidade umidadeSensor = new SensorUmidade();

        tempSensor.start();
        umidadeSensor.start();
    }
}
