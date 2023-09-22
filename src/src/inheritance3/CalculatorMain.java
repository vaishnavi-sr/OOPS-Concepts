package inheritance3;

class Calculator{
     int result;
    public int add(int a, int b){
        result =(a + b);
        return result;
    }
}
class AdvCalculator extends Calculator{
    public int sub(int a,int b){
        result = a-b;
        return result;

    }
}
class VeryAdvCalculator extends AdvCalculator{
    public int multiplication(int a,int b){
        result = a * b;
        return result;


    }
}

public class CalculatorMain {

    public static void main(String[] args) {
        AdvCalculator a = new AdvCalculator();

        System.out.println(a.add(4,5));
        System.out.println(a.sub(10,5));



    }
}
