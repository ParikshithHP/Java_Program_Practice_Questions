package org.testing.project.javaInterviewPrograms;

public class PrintHelloWordWithEmptyMain {

    PrintHelloWordWithEmptyMain(){
        System.out.println("Hello World of constructor");
    }

    static{
        System.out.println("Hello World of static block");
    }

    public static void main(String[] args){

        // static block is executed when class loads
        // it needs no implementations in the main method
        //To call the constructor block we must need to create a obj of the class


    }
}
