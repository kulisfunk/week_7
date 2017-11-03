package example.codeclan.com.try_catch_start;

/**
 * Created by user on 30/08/2017.
 */

public class ExampleTryCatch{
    PetShop shop;

    public void run(){
        setup();
        Pet found = null;
        try {
            found = shop.findPetByName("John");
            System.out.println("Found pet: " + found.getName());
            System.out.println(1 / 0);
        } catch (NullStringException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Closing database connections!");
            System.out.println("We're done!");
        }

    }

    public void setup(){
        shop = new PetShop();
        shop.addPet(new Dog("Rover"));
        shop.addPet(new Cat("MEOWingtons"));
        shop.addPet(new Fish("FINlay"));
    }
}

