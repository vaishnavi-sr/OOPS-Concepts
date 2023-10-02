package polimorphism.overloading;
class AddNum{
   public int add(int a,int b){
       return a + b;
   }

    public int add(int a,int b,int c){
        return a + b + c;
    }


}

public class Addition {
    public static void main(String[] args) {

        AddNum obj = new AddNum();
        System.out.println(obj.add(2,3,4));
        System.out.println(obj.add(5,10));
    }
}
