package easy.java.core;

public class Output {
    // ANSI Escape Codes 
    private static final String RESET = "\u001B[0m";
    private static final String RED = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";
    private static final String YELLOW = "\u001B[33m";
    private static final String BLUE = "\u001B[34m";

    /**
     * Prints text in a specific color and resets back to default.
     */
    public static void red(String message) {
        System.out.println(RED + message + RESET);
    }

    public static void green(String message) {
        System.out.println(GREEN + message + RESET);
    }

    public static void yellow(String message) {
        System.out.println(YELLOW + message + RESET);
    }
    
    
    // Special Effect Output:
    
    public static void typewriter(String message, int speed){
    
        for (char c : message.toCharArray()){
            System.out.print(c);
            
            System.out.flush();
            try{
                Thread.sleep(speed);
            } catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
            System.out.println();
    }
}