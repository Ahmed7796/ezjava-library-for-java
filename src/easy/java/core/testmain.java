package easy.java.core;


public class testmain {
    
    public static void main(String[] args) {
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
        
           // Testing green output formatting:
          Output.green("Hello World!");
          //Testing loading bar:
          Output.yellow("Loading Resources...");
          Output.autoLoadingBar(15);
          Output.green("Resources loaded successfully!");
        
    }
}
