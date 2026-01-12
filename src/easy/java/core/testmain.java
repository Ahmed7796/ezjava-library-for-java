package easy.java.core;

import java.util.List;


public class testmain {
    
    public static void main(String[] args) {
        // Testing file.util: 
        String filePath = "test.txt";
        
        // Testing string input
        String test = Input.readString("Test 1 (String): ");
        System.out.println(test);
        // Testing character input
        char Test2 = Input.readChar("Test 2 (char): ");
        System.out.println(Test2);
        // Testing integer input
        int Test3 = Input.readInt("Test 3 (integer): ");
        System.out.println(Test3*2);
        // Testing float input
        float Test4 = Input.readFloat("Test 4 (float): ");
        System.out.println(Test4*Test4);
        // Testing double input
        double Test5 = Input.readDouble("Test 5 (double): ");
        System.out.println(Test5*Test5);
        // Testing short input
        short Test6 = Input.readShort("Test 6 (short): ");
        System.out.println(Test6*2);
        
        // BENCHMARKING OUTPUT METHODS:
          Time.startBenchmark();
           // Testing green output formatting:
          Output.green("Hello World!");
          
          Output.yellow("Loading Resources...");
          
          Output.green("Resources loaded successfully!");
          
        // Initializing day and time for testing purposes:
          String day = Time.getDate();
          String time = Time.getTimestamp();
          // Should return current date (yyyy-MM-dd format) and time (HH:mm:ss) format.
          Time.stopBenchmark(); //Ending the benchmark process.
          
          Time.waitForKey("Press [Enter] to start the live timer:  ");
          System.out.println("Current Date (yyyy-MM-dd):  "+day);
          while(true){
              System.out.println("Current time: "+ Time.getTimestamp());
              Time.pause(1);
          }

    }
}
