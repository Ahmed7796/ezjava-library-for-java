package easy.java.core;

public class testmain {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Ranged float - PASSED
        float rangedFloat = Input.readFloat("Enter a value between 0.5 - 10.5: ",0.5f,10.5f);
        System.out.println("You entered: "+ rangedFloat);
        
        double rangedDouble = Input.readDouble("Enter a value between 0.50 - 20.50: ",0.5,20.5);
        System.out.println("You entered: "+rangedDouble);
        
        String rangedString = Input.readString("Enter your name (1-10) characters: ", 1, 10);
        System.out.println("You entered: "+rangedString);
		
		int rangedInt = Input.readInt("Enter an integer from 1 to 10",1,10);
		System.out.println("Your integer is: "+rangedInt);
        }
    
}
