package classes;

 class Computer{
     int a;
     public int add(int n1, int n2){
         int result = n1 +n2;
         return result;
     }

}
public class Demo {

    public static void main(String[] args) {

        int num1 = 24;
        int num2 = 20;

        Computer c = new Computer();
        int result1 = c.add(num1,num2);
        System.out.println(result1);

    }
}
