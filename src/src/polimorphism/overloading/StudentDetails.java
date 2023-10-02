package polimorphism.overloading;
class Student{
    void StudentID(String name,int num){
        System.out.println(" Student Name : "+ name + " Student ID : "+ num);
    }
  void StudentID(int num, String name){
      System.out.println(" Student ID : "+ num+ " \n Student name : "+ name);
  }
}

public class StudentDetails {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.StudentID("Raju",111);
        obj.StudentID(222,"Sara");


    }
}