package animals;

public class Flying extends Bird {
    private String typeOfMovement;

    public Flying(String name, int age, String livingEnvironment, String typeOfMovement) {
        super(name, age, livingEnvironment);
        if (typeOfMovement == null || typeOfMovement.isBlank() || typeOfMovement.isEmpty()){
            this.typeOfMovement = "Летающие";
        }else {
            this.typeOfMovement = typeOfMovement;
        }
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    public void setTypeOfMovement(String typeOfMovement) {
        if (typeOfMovement == null || typeOfMovement.isBlank() || typeOfMovement.isEmpty()){
            this.typeOfMovement = "Летающие";
        }else {
            this.typeOfMovement = typeOfMovement;
        }
    }
    @Override
    public void go() {
        System.out.println("Летать");
    }

    @Override
    public void sleep() {

    }

    @Override
    public String toString() {
        return "Класс "+getClass() + ". " + getName() + " возвраст: " + getAge() + " года, среда обитания: " +
                getLivingEnvironment() + ",  тип передвижения: " + typeOfMovement;
    }
}
