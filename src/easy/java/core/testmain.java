package easy.java.core;


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
         

          double numbers[] = {24, 23, 34, 23, 23, 1, 0};

          // Testing the EZMath Methods:
          double average = EZMath.getAverage(numbers);
          double mode = EZMath.getMode(numbers);
          double median = EZMath.getMedian(numbers);
          double variance = EZMath.getVariance(numbers);
          double CV = EZMath.getCoefficientOfVariation(numbers);
          double stdDev = EZMath.getStandardDeviation(numbers);
          double meanDev = EZMath.getMeanDeviation(numbers);
          double range = EZMath.getRange(numbers);
          
          System.out.println("-------------------------------------------");
          System.out.println("Summary of The Array:");
          System.out.println("-------------------------------------------");
          System.out.println("Mean: " +EZMath.round(average, 2));
          System.out.println("Mode: "+EZMath.round(mode, 2));
          System.out.println("Median: "+EZMath.round(median, 2));
          System.out.println("Variance: "+EZMath.round(variance, 2));
          System.out.println("Standard Deviaton: "+EZMath.round(stdDev, 2));
          System.out.println("Mean Deviation: "+EZMath.round(meanDev, 2));
          System.out.println("Co-efficient of Variance: " + EZMath.round(CV, 2));
          System.out.println("Range: " + EZMath.round(range, 2));

    }
}
