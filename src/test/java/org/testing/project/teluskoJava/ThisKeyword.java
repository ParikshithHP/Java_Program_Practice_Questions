package org.testing.project.teluskoJava;

import java.lang.reflect.Method;

        //THIS IS A KEYWORD WHICH REPRESENTS THE CURRENT OBJECT, CURRENT oBJECT MEANS
        //THE OBJECT WHICH IS CALLING THE METHOD
        //INSTEAD OF PASSING THE CURRENT CLASS OBJECT IN THE CLASS AND AGAIN USING THAT OBJECT FOR ASSIGN OPERATION
        // WE CAN USE THIS KEYWORD
        // WHERE IT REPRESENTS THE CURRENT OBJECT OF THE CLASS
//AND WHEN THE INSTANCE VARIABLE NAME IS SAME AS LOCAL VARIABLE NAME IN THE METHOD WE WILL USE THE THIS KEYWORD


    class Human1{
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
    public class ThisKeyword {
        //ENCAPSULATING THE DATA AND METHODS INTO THE SINGLE UNIT

        public static void main(String[] args){
            Human1 obj = new Human1();
            obj.setAge(20);
            obj.setName("Shetty");
            System.out.println(obj.getAge()+":"+obj.getName());
        }
}
