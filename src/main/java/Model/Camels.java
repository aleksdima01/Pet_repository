package Model;

import java.util.Date;

public class Camels extends Packed_animals {
    public Camels(String name, String birthDate, String commands) {
        super(name, birthDate, commands);
    }

    @Override
    public String toString() {
        return "Camel{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                //", commands='" + commands + '\'' +
                '}';
    }
}
