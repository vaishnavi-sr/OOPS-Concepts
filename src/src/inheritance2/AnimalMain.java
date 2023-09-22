package inheritance2;

class Cat{
    String food = "Milk, Fish";
    void noise(){
        System.out.println("meaw,meaw");
    }
}
class Dog{
    String food = "Bones, Meat";
    void noise(){
        System.out.println("woof, woof");
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
    }
}
