package easy.java.core;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author lesha
 */
public class Input {
    // Static BufferedReader for all input methods:
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    // STRINGS AND CHARACTERS:
    // Reading string easily with Input.readString("Your_Prompt_Here:");
    public static String readString(String prompt){
        System.out.print(prompt);
        try{
            return reader.readLine();
        }
        catch(IOException e){
            return ("Error reading input.");
        }
    }
        
    // Reading a single character (char):
     public static char readChar(String prompt){
      char value = ' ';   
      boolean isValid = false;
      do{
          try{
          System.out.print(prompt);
          String input = reader.readLine();
          if (input.length() == 1){
          value = input.charAt(0);
          isValid = true;
          } else {
              System.out.println("Please enter exactly one character.");
          }
          }catch(IOException e){
      
          System.out.println("Error reading input");
      }
        }   while(!isValid);

      return value;
     }
//---------------------- NUMERICAL VARIABLES (INT, FLOAT, DOUBLE, LONG, SHORT, BYTE):---------
 // Reading an integer with Input.readInt("Your_Prompt_Here:");
    public static int readInt(String prompt){
    int value = 0;
    boolean isValid = false;
    do{
            
        try{
            String input = readString(prompt);
            value = Integer.parseInt(input);
            isValid = true;
        
        }catch(NumberFormatException e){
            System.out.println("Please enter an integer.");
        }
    }while(!isValid);
    return value;
    }
    

    
    // Reading a floating decimal number with Input.readFloat("Your_Prompt_Here:"); (Small floating-point precision).
    public static float readFloat(String prompt){
    float value = 0;
    boolean isValid = false;
        do{
            try{    
                
                String input = readString(prompt);
                value = Float.parseFloat(input);
                isValid = true;
            } 
            catch(NumberFormatException e){
            
                System.out.println("Please enter a floating decimal point number.");
            }
        
        } while (!isValid);
        return value;
    }  
    

    
    // Reading a double number with ez.readDouble("Your_Prompt_Here"); (High floating point precision).
     public static double readDouble(String prompt){
    double value = 0.0;
    boolean isValid = false;
    do{ 
        try{
            String input = readString(prompt);
            value = Double.parseDouble(input);
            isValid = true;
        }catch(NumberFormatException e){
            System.out.println("Please enter a floating decimal (double) number.");
        }
    } while(!isValid);
    
    return value;
}
     

     
     // Reading SHORT integers with ez.readShort("Your_Prompt_Here");
     public static short readShort(String prompt){
       short value = 0;
       boolean isValid = false;
      do {  
            
            try{
                String input = readString(prompt);
                value = Short.parseShort(input);
                isValid = true;
            } catch(NumberFormatException e){
                System.out.println("Please enter a short integer. (Between -32,768 and 32,767)");
            }
      
      } while (!isValid);
     
     return value;
     }
     
     //Reading a LONG integer:
     public static long readLong(String prompt){
     long value = 0;
     boolean isValid = false;
     
     do{
         
         try{   
                String input = readString(prompt);
                value = Long.parseLong(input);
                isValid = true;
                        }catch(NumberFormatException e){
             System.out.println("Please enter a valid long integer. ");
         }
     } while(!isValid);
     
        return value;
     }
     
     //Reading a BYTE integer:
     public static byte readByte(String prompt){
         byte value = 0;
         boolean isValid = false;
         
         do{
             
             try{
                 String input = readString(prompt);
                 value = Byte.parseByte(input);
                 isValid = true;
             } catch (NumberFormatException e){
             
                 System.out.println("Please enter a byte integer. (Between -127 and 128)");
             }
             
         } while(!isValid);
     
         return value;
     }

     // Read user boolean: (Accepts Y/Yes/True for true value, and N/No/False for false value).
     public static boolean readBoolean(String prompt){
     boolean value = false;
     boolean isValid = false;
     
        do {
            // This can be customized.
            String input = readString(prompt).trim().toLowerCase();
            if (input.equals("true") || input.equals("y") || input.equals("yes") ){
                value = true;
                isValid = true;
            } else if (input.equals("false") || input.equals("n") || input.equals("no"))
            {
                value = false;
                isValid = true;
            } else {
                System.out.println("Please enter a valid input (Y/N), (true/false), (yes/no).");
            }
        } while (!isValid);

        return value;
     }
     
         




// --------------------------Method Overloading: (Ranged Input)------------------------------------------
    public static String readString(String prompt, int min, int max){
      String value;
        do{
             value = readString(prompt);
            if ( value.length() > max || value.length() < min ){
                System.out.println("Please enter a string between "+min+" and "+max+" characters.");
            }
        
        }while (value.length() > max || value.length() < min);
        return value;
    }
    
        // Overloaded readInt for range validation
    public static int readInt(String prompt, int min, int max) {
    int value;
    do {
        // Using the existing readInt method, the user has to specify range (min-max).
        value = readInt(prompt);
        if (value < min || value > max) {
            System.out.println("Error: Please enter a value between " + min + " and " + max + ".");
        }
    } while (value < min || value > max);
    return value;
}
    
         // Method overloading for reading a ranged double:
     public static double readDouble(String prompt, double min, double max){
     double value;
     do{
            value = readDouble(prompt);
            if(value > max || value < min){
                System.out.println("Please enter a value between "+min+" and "+max);
            }
     
     }while(value > max || value < min);
     
     return value;
     }
     
         // Method overloading to add ranged float:
    public static float readFloat(String prompt, float min, float max){
    float value;
    do{
            value = readFloat(prompt);
            if (value > max || value < min){
                System.out.println("Please enter a value between "+min+" and "+max);
            }
    
    } while(value > max || value < min);
    
    return value;
    }
    
    // Reading a ranged short
    public static short readShort(String prompt, int min, int max){
    short value;
    do{
        value = readShort(prompt);
        if( value > max || value < min ){
            System.out.println("Please enter a value between: "+min+" and "+max);
        }
    
    } while( value > max || value < min); 
    
    return value;
    }
    
    // Reading a ranged byte:
    public static byte readByte(String prompt, int min, int max){
     byte value;
     do{
         value = readByte(prompt);
         if (value > max || value < min){
               System.out.println("Please enter a value between "+min+" and "+max);
         }
     } while(value > max || value < min);
     return value;
    }
    
    // Reading a ranged long input:
    public static long readLong(String prompt, int min, int max){
    long value;
    do{
        value = readLong(prompt);
        if (value > max || value < min){
            System.out.println("Please enter a value between "+min+" and "+max);
        }
    } while(value > max || value < min); 
    return value;
    }
}

   
