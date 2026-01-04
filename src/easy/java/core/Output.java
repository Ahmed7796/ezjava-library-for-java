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
    
    
    // Typewriter method: (Requires a TRUE terminal e.g. VSCode, CMD, ZSH).
    
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
                public static void loadingBar(int percent){
                    int barLength = 30;
                    int progress = (percent * barLength) / 100;
                    
                    StringBuilder bar = new StringBuilder("\r[");
                    for (int i = 0; i < barLength; i++){
                        if (i < progress) bar.append("=");
                        else if (i == progress ) bar.append(">");
                        else bar.append(" ");
                    }
                    bar.append("] ").append(percent).append("%");
                    System.out.print(bar.toString());
                    System.out.flush();
                    
                    if (percent >= 100) System.out.println();
                }
    
    
            // Clearing console method:
            public static void clear() {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
            
        public static void autoLoadingBar(int seconds) {
        int totalSteps = 100;
        int delay = (seconds * 1000) / totalSteps;

        for (int i = 0; i <= totalSteps; i++) {
            loadingBar(i);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }    
    
}