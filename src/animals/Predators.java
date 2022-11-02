package animals;

import java.util.Objects;

public class Predators extends Mammals{
    private String typeFood;

    public Predators(String name, int age, String livingEnvironment, int movementSpeed, String typeFood) {
        super(name, age, livingEnvironment, movementSpeed);
        if (typeFood == null || typeFood.isBlank() || typeFood.isEmpty()){
            this.typeFood = "Плотоядные";
        }else {
            this.typeFood = typeFood;
        }
    }
    public String getTypeFood() {
        return typeFood;
    }

    public void setTypeFood(String typeFood) {
        if (typeFood == null || typeFood.isBlank() || typeFood.isEmpty()){
            this.typeFood = "Плотоядные";
        }else {
            this.typeFood = typeFood;
        }
    }

    @Override
    public void eat(){
        System.out.println("Охотиться");
    }

    @Override
    public void sleep() {

    }

    @Override
    public String toString() {
        return "Класс "+getClass() + ". " + getName() + " возвраст: " + getAge() + " года, среда обитания: " +
                getLivingEnvironment() + ",  скорость передвижения " + getMovementSpeed() +
                ", тип питания: " + typeFood;
    }

}
