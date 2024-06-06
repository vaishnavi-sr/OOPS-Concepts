package classes;

 class Computer {
     int a;
     private boolean player;
     public void player() {
         System.out.println("Playing music....");
     }

     public String getMePen(int cost) {
         if (cost >= 10) {
             return "pen";
         } else {
             return "Nothing..";
         }
     }

     public int add(int n1, int n2) {
         int result = n1 + n2;
         return result;
     }

     public int sub(int n1, int n2) {
         if (n1 > n2) {
             return (n1 - n2);
         } else {
             return (n2 - n1);
         }

     }



 }

     public class Demo {

         public static void main(String[] args) {

             int num1 = 24;
             int num2 = 28;

             Computer c = new Computer();
             int result1 = c.add(num1, num2);
             int result2 = c.sub(num1, num2);
             System.out.println(result2);
             System.out.println(result1);
//       System.out.println(c.player);
      System.out.println(c.getMePen(5));

         }


     }

