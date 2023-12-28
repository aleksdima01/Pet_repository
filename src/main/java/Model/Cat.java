package Model;

import java.util.Date;

public class Cat extends Home_animals {
    public Cat(String name, Date birthDate, String commands) {
        super(name, birthDate, commands);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", commands='" + commands + '\'' +
                '}';
    }
}
