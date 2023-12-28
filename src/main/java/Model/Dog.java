package Model;

import java.util.Date;

public class Dog extends Home_animals {
    public Dog(String name, String birthDate, String commands) {
        super(name, birthDate, commands);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
               // ", commands='" + commands + '\'' +
                '}';
    }
}
