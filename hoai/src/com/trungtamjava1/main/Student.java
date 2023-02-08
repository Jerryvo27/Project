package com.trungtamjava1.main;

public class Student extends Person {
    String major;





    public Student(int id, String name, String address) {
        super(id, name, address);
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }


   public static void main(String[] args){
     Student student1 = new Student(123,"Hoai","Hanoi");
     Student student2 = new Student(222,"nam","hanoi");
       System.out.println(student1.id);
       System.out.println(student2.name);

   }
}
