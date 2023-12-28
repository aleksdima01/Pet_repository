package Model;

import java.util.Date;

public class Donkeys extends Packed_animals {
    public Donkeys(String name, String birthDate, String commands) {
        super(name, birthDate, commands);
    }

    @Override
    public String toString() {
        return "Donkey{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
               // ", commands='" + commands + '\'' +
                '}';
    }
}
