package easy.java.core;

import java.util.Arrays;
import java.util.Random;
import java.util.Map;
import java.util.HashMap;

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
    
    
    // Measurements of Central Tendency: Mean (Average), Mode, and Median //
    
    // Mean (Average):
    public static double getAverage(double[] numbers){
    return java.util.Arrays.stream(numbers).average().orElse(0.0);
    }
    
    // Median:
    public static double getMedian(double[] numbers){
        //If the array is empty, return 0:
        if (numbers == null || numbers.length == 0) return 0.0;
        
        // Cloning the array to preserve the values:
        double[] sorted = numbers.clone();
        Arrays.sort(sorted); // Sort the cloned array.
        
        // The middle element index:
        int middle = sorted.length / 2;
        
        // If the array has an even number of elements:
        if (isEven(sorted.length)) {
            return ((sorted[middle] + sorted[middle - 1]) / 2.0);
        } else {
            // else return the element in the middle:
            return sorted[middle];
                    }
    
    }
    
           // Mode: (Most frequent value)
    public static double getMode(double[] numbers){
        // If the array is null or empty, return 0:
        if (numbers == null || numbers.length == 0) return 0.0;
        // Initializing a Map to keep count of mode:
        Map<Double, Integer> counts = new HashMap<>();
        // For each number in the array:
        for (double n : numbers) {
            // Insert the total count into the map:
            counts.put(n, counts.getOrDefault(n, 0) + 1);
        }
            // Initial mode value:
            double mode = numbers[0];
            int maxCount = 0;   // Initial maximum count.
            for(Map.Entry<Double, Integer> entry : counts.entrySet()){
                // If the entry value exceeds the count, re-assign.
                if (entry.getValue() > maxCount)
                {  maxCount = entry.getValue();
                    mode = entry.getKey();
                }
            }
        return mode;    // return the mode value.
    }
    
    // Measurements of Dispersion //
    
    // Variance: (The squared value of the standard deviation):
    
    // If the data is not sample data, the user can just EZMath.getVariance(array); instead of manually flagging it false.
    public static double getVariance(double[] numbers){
        return getVariance(numbers, false);
    }
    
        // Variance: (The squared value of the standard deviation):
    public static double getVariance(double[] numbers, boolean isSample){
        // if the array is null, return 0:
        if (numbers == null || numbers.length == 0 ) return 0.0;
            // Calculating the value of the 
        double mean = getAverage(numbers);
        double temp = 0; // Value to store the deviation from the mean.
        
        // Enhanced for loop:
        for ( double a : numbers){
            temp += (a - mean) * (a - mean); // Calculate and assign the squared value of each element minus the mean to temp.
        }
          
        // Ternary if statement to determine the divisor of whether the data is a sample data or not
        // If its not a sample data, then divide by the length of the array, else divide by the length of the array minus 1 (Bessel's Correlation)
        int divisor = isSample ? numbers.length : numbers.length - 1;
        
        // Final calculation:
        double variance = temp / divisor;
        // Return variance:
        return variance;
        
    }
    
    // Standard Deviation:
    public static double getStandardDeviation(double[] numbers){
        return Math.sqrt(getVariance(numbers)); // Standard deviation is the square root of the variance.
    }
    
    
    // Mean Deviation (The ABSOLUTE value of each elements deviation from its mean (average) ):
    public static double getMeanDeviation(double[] numbers){
        // if the array is empty or null, return 0.
     if (numbers == null || numbers.length == 0) return 0.0;
        
     // Calculate the mean and initialize sum to be 0:
        double mean = getAverage(numbers);
        double sum = 0;
        
        // For each element in numbers, calculate the deviation from the main and add the absolute value to sum:
        for (double n : numbers){
            sum += Math.abs(n - mean); // Sum and assign the value to sum (each deviation from the mean).
        }
        // Return the sum of the deviations divided by (N)umber of elements:
        return sum / numbers.length;
        
    }
    
    // Get the co-efficient of Variation (CV):
    public static double getCoefficientOfVariance(double[] numbers){
        // Get the mean (Average):
        double mean = getAverage(numbers);
        // Get the standard deviation:
        double stdDeviation = getStandardDeviation(numbers);
        if (mean == 0){
            Output.red("[EZMATH] Error: Cannot calculate the CV if the mean is zero.");
            return 0.0;
                                } 
             return (stdDeviation / mean) * 100.0;
    }
    
    
    // Range (Max - Min) Value:
    public static double getRange(double[] numbers){
        // If the array is empty, return 0
    if (numbers == null | numbers.length== 0) return 0.0;
        // Initialize min and max and set them to 0:
        double min = 0;
        double max = 0;
        // Iterate through loop to determine min and max values:
        for (double n : numbers) {
            if (n < min) min = n;
            if (n > max) max = n;
        }
            // Return the range: Max - min:
        return max - min;
    
    }
}
