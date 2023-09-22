package inheritance2;

class Cat{
    String play = "Ball, climb";
    String food = "Milk, Fish";
    void noise(){
        System.out.println("meaw,meaw");
        
    }
}
class Dog extends Cat{
    String breed = "Boxer, Labrador";
    String food = "Bones, Meat";
   void noise(){
        System.out.println("woof, woof");
        
    }
}
class Pet extends Dog{
    String color = "Black, White, Gray";

    void action(){
        System.out.println("Jump, Run, Care");
    }
}


public class AnimalMain {

    public static void main(String[] args){

        Cat c = new Cat();
        System.out.println(c.food);
        c.noise();

        Dog d = new Dog();
        System.out.println(d.food);
        d.noise();
        System.out.println(d.breed);


        Pet p = new Pet();
        System.out.println(p.color);
    }

}
