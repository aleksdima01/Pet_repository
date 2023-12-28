package Model;

import java.util.Date;

public class Hamster extends Home_animals {
    public Hamster(String name, Date birthDate, String commands) {
        super(name, birthDate, commands);
    }

    @Override
    public String toString() {
        return "Hamster{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", commands='" + commands + '\'' +
                '}';
    }
}
