package animals;

import java.util.Objects;

public class Herbivores extends Mammals{
    private String typeFood;

    public Herbivores(String name, int age, String livingEnvironment, int movementSpeed, String typeFood) {
        super(name, age, livingEnvironment, movementSpeed);
        if (typeFood == null || typeFood.isBlank() || typeFood.isEmpty()){
            this.typeFood = "Растительная";
        }else {
            this.typeFood = typeFood;
        }
    }

    public String getTypeFood() {
        return typeFood;
    }
    public void setTypeFood(String typeFood) {
        if (typeFood == null || typeFood.isBlank() || typeFood.isEmpty()){
            this.typeFood = "Растительноядные";
        }else {
            this.typeFood = typeFood;
        }
    }

    @Override
    public void eat(){
        System.out.println("Пастись");
    }
    @Override
    public String toString() {
        return "Класс "+getClass() + ". " + getName() + " возвраст: " + getAge() + " года, среда обитания: " +
                getLivingEnvironment() + ",  скорость передвижения " + getMovementSpeed() +
                ", тип питания: " + typeFood;
    }

}