package org.testing.project.teluskoJava;

class Human{
    private int age;
    private String name;

    int getAge(){
        return age;
    }
    String getName(){
        return name;
    }
    void setAge(int n){
        age =n;
    }
    void setName(String n){
        name = n;
    }
}
public class EncapsulationGetterSetter {
    //ENCAPSULATING THE DATA AND METHODS INTO THE SINGLE UNIT

    public static void main(String[] args){
        Human obj = new Human();
        obj.setAge(20);
        obj.setName("Shetty");
        System.out.println(obj.getAge()+":"+obj.getName());
    }
}
