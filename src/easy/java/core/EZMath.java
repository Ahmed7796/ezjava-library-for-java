package easy.java.core;

import java.util.Random;

public class EZMath {
    // Random object for random methods:
    private static final  Random random = new Random();
    
    // Random integer method: (ranged)
    public static int random(int min, int max){
        if (min >= max) {
            Output.red("[EZMATH] Error: minimum value cannot be larger than maximum value.");
            return min;
        }
        return random.nextInt((max - min) + 1) + min;
    }
    
    
    // Rounding a double into specified number of decimal places:
    // Example: Rounding the value 43.3333 by (2) places will result in 43.33.
    public static double round(double value, int places){
        if(places <= 0) return value;
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }
    
    // Clamping a value between two values (max and min):
    // Use cases: Health bars, percentages, UI limits.
    public static int clamp(int value, int min, int max){
        return Math.max(min, Math.min(max, value));
    }
    
    // Checking if a value is even:
    public static boolean isEven(int value){
        return value % 2 == 0;
    }
    
    // Getting a percentage of two values: (Extremely precise)
    public static double percent(double portion, double whole){
        if (whole == 0){
            Output.red("[EZMATH] Error: Division by zero in percent()");
            return 0;
        }
        return (portion / whole) * 100;
    }
    
    public static double getAverage(double[] numbers){
    return java.util.Arrays.stream(numbers).average().orElse(0.0);
    }
    
    
    
}
