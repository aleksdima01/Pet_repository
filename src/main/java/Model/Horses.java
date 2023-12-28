package Model;

import java.util.Date;

public class Horses extends Packed_animals {
    public Horses(String name, String birthDate, String commands) {
        super(name, birthDate, commands);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
               // ", commands='" + commands + '\'' +
                '}';
    }
}
