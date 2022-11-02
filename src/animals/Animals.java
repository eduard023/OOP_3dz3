package animals;

import java.util.Objects;

public abstract class Animals {
    private String name;
    private int age;

    public Animals(String name, int age) {
        if (name == null || name.isBlank() || name.isEmpty()){
            this.name = "Нет имени";
        }else {
            this.name = name;
        }
        if (age <= 0){
            this.age = 1;
        }else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0){
            this.age = 1;
        }else {
            this.age = age;
        }
    }

    public abstract void eat();

    public abstract void go();


    public abstract void sleep();
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return age == animals.age && Objects.equals(name, animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

}
