public class Cat extends Animal {
    static int catCount;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    public void run(int obstacleLength) {
        if (obstacleLength >= 1 && obstacleLength <= 200) {
            System.out.println(getName() + " " + "run" + " " + obstacleLength + " metres");
        } else {
            System.out.println("I can't run more than 200 meters and less than 1");
        }
    }

    @Override
    public void swim(int obstacleLength) {
        System.out.println("I can't swim");
    }
}
