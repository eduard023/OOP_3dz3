package animals;

public abstract class Mammals extends Animals{
    private String livingEnvironment;
    private int movementSpeed;

    public Mammals(String name, int age, String livingEnvironment, int movementSpeed) {
        super(name, age);
        if (livingEnvironment == null || livingEnvironment.isBlank() || livingEnvironment.isEmpty()){
            this.livingEnvironment = "Нет данных";
        }else {
            this.livingEnvironment = livingEnvironment;
        }
        if (movementSpeed <= 0){
            this.movementSpeed = 1;
        }else {
            this.movementSpeed = movementSpeed;
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

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(int movementSpeed) {
        if (movementSpeed <= 0){
            this.movementSpeed = 1;
        }else {
            this.movementSpeed = movementSpeed;
        }
    }

    @Override
    public void go(){
        System.out.println("Гулять");
    }

}
