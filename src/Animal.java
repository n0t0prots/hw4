public class Animal { static int animalCount;
    private String name;
    private int obstacleLength;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public void run(int obstacleLength) {
        System.out.println("I can run");
    }

    public void swim(int obstacleLength) {
        System.out.println("I can swim");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
