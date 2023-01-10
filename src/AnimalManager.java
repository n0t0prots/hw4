public class AnimalManager {public static void main(String[] args) {
    Animal dogBobik = new Dog("Bobik");
    Animal catMurzik = new Cat("Murzik");
    dogBobik.run(8);
    dogBobik.swim(9);
    catMurzik.swim(5);
    catMurzik.run(200);
    System.out.println("We created" + " " + Animal.animalCount + " Animals:" + " " + Dog.dogCount + " Dogs" + "," + Cat.catCount + " Cats.");
}
}
