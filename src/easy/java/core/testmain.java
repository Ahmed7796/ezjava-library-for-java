package easy.java.core;

public class testmain {
    
    public static void main(String[] args) {
        String test = Input.readString("Test 1 (String): ");
        System.out.println(test);
        char Test2 = Input.readChar("Test 2 (char): ");
        System.out.println(Test2);
        int Test3 = Input.readInt("Test 3 (integer): ");
        System.out.println(Test3*2);
        float Test4 = Input.readFloat("Test 4 (float): ");
        System.out.println(Test4*Test4);
        double Test5 = Input.readDouble("Test 5 (double): ");
        System.out.println(Test5*Test5);
        short Test6 = Input.readShort("Test 6 (short): ");
        System.out.println(Test6*2);
        byte Test7 = Input.readByte("Test 7 (byte): ");
        System.out.println(Test7*Test7);
        long Test8 = Input.readLong("Test 8 (Long): ");
        System.out.println(Test8*2);
    }
}
