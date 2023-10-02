package abstraction;

public class AbstractionA {
    public static void main(String[] args) {
        RamPhone obj = new TomPhone();
        obj.call();
        obj.cook();
        obj.dance();
        obj.move();


    }
}

    abstract class RamPhone {           //abstract class
        public void call() {
            System.out.println("Calling ...");
        }

        public abstract void dance();

        public abstract void move();

        public abstract void cook();

    }

    abstract class SamPhone extends RamPhone {   //abstract class
        public void dance() {
            System.out.println("Dancing ...");
        }

        public abstract void move();

        public abstract void cook();
    }

   class TomPhone extends SamPhone {    //Concrete class- this object can only be instantiated in the main class
        public void move() {
            System.out.println("Moving ...");
        }

        public void cook() {
            System.out.println("Cooking...");
        }
    }
