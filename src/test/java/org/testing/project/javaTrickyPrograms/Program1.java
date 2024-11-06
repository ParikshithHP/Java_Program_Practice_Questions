package org.testing.project.javaTrickyPrograms;

public class Program1 {
    public static void main(String[] args) throws Exception {
        if(true){
//            break;
            //break; // BREAK OUTSIDE SWITCH OR LOOP ERROR THROWN
        } else {
            //break;
        }
        /*
        This code will produce a compilation error: "break outside switch or loop".

Explanation:
The break statement is used to exit a loop (like for, while, or do-while) or a switch statement. In your code, the break statement is within an if block but not inside a loop or switch, which is not allowed.

Here's the corrected code structure if you want to use break within a loop:

java
Copy code
public static void main(String[] args) throws Exception {
    while (true) { // A loop or switch statement is needed for break to work
        if (true) {
            break; // This now works correctly
        }
    }
}
        */

    }
}
