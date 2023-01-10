public class Dog extends Animal {
    static int dogCount;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    @Override
    public void run(int obstacleLength) {
        if (obstacleLength >= 1 && obstacleLength <= 500) {
            System.out.println(getName() + " " + "run" + " " + obstacleLength + " metres");
        } else {
            System.out.println("I can't run more than 500 meters and less than 1");
        }
    }

    @Override
    public void swim(int obstacleLength) {
        if (obstacleLength >= 1 && obstacleLength <= 10) {
            System.out.println(getName() + " " + "swim" + " " + obstacleLength + " metres");
        } else {
            System.out.println("I can't swim more than 10 meters and less than 1");
        }
    }
}
