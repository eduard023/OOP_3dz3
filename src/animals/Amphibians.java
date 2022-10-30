package animals;

import java.util.Objects;

public class Amphibians extends Animals {
    private String livingEnvironment;

    public Amphibians(String name, int age, String livingEnvironment) {
        super(name, age);
        if (livingEnvironment == null || livingEnvironment.isBlank() || livingEnvironment.isEmpty()){
            this.livingEnvironment = "Нет данных";
        }else {
            this.livingEnvironment = livingEnvironment;
        }
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment == null || livingEnvironment.isBlank() || livingEnvironment.isEmpty()){
            this.livingEnvironment = "Нет данных";
        }else {
            this.livingEnvironment = livingEnvironment;
        }
    }
    @Override
    public void eat(){
        System.out.println("Охотиться");
    }
    @Override
    public String toString() {
        return "Класс "+getClass() + ". " + getName() + " возвраст: " + getAge() + " года, среда обитания: " +
                getLivingEnvironment();
    }

}
