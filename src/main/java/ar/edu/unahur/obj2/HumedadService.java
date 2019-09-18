package ar.edu.unahur.obj2;

import java.util.Random;

public class HumedadService {

    public double getHumedad() {
        return new Random().nextDouble();
    }
}
