package easy.java.core;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time {
    // Start time variable initialization for benchmarking methods:
    private static long startTime;
    
    // Pause method:
    public static void pause(double seconds){
        try {
            // The reason for (long) casting is to convert the double (seconds) into long integers. E.g.: 1.5s to 1500ms
            Thread.sleep((long) (seconds * 1000));
        } catch(InterruptedException e){
            // Catching the interrupted exception - restoring the interrupt flag and printing error details:
            Thread.currentThread().interrupt();
            Output.red("Wait interrupted: "+e.getMessage());
        }
    }
    
    // Benchmarking Methods:
    
    // Start the benchmark by initializing the start time (current time in nanoseconds)
        public static void startBenchmark(){
            startTime = System.nanoTime();
        }
    // Stopping the benchmark process:    
        public static void stopBenchmark(){
            // Initializing the end time:
            long endTime = System.nanoTime();
            // Conversion from nanoseconds (ns) to milliseconds (ms):
            double duration = (endTime - startTime ) / 1_000_000.0;
            // Print benchmark result in yellow utilizing Output method:
            Output.yellow("[BENCHMARK] Performance: "+ String.format("%.2f", duration) + "ms");
        }
   
        // Getting current date:
        public static String getDate(){
            return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        }
        // Getting current time:
        public static String getTimestamp(){
            return LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        }
        
        // Getting precise milliseconds:
        public static long getCurrentMillis(){
             return System.currentTimeMillis();
        }
        
        // Waiting for user key before executing:
        public static void waitForKey(String message){
            Output.yellow("\n" + message);
            Input.readString("");
        }
        
        
}
