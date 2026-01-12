package easy.java.core;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    
    // ------ READING ------ //
    
    
    // Reading the entire content as a string:
    public static String read(String filePath){
        try{
                return Files.readString(Path.of(filePath));
        } catch (IOException e) {
            Output.red("Error reading file: " + e.getMessage());
            return "";
        }
    }
    
   // Reading a file as a list of strings (one string per line):
    public static List<String> readLines(String filePath){
        try{
            return Files.readAllLines(Path.of(filePath));
        } catch(IOException e){
            Output.red("Error reading file:  "+e.getMessage());
            return new ArrayList<>();
        }
    }
    
    
    
    //@param action - a lambda expression (Syntax: line -> {TODO}) for action to do on each line (e.g., printing, etc.)
    // Reading large files with responsible memory usage:
    public static void stream(String filePath, java.util.function.Consumer<String> action)
    {
        try(java.util.stream.Stream<String> lines = Files.lines(Path.of(filePath))){
            lines.forEach(action);
        } catch (IOException e) {
            Output.red("File streaming error: "+e.getMessage());
        }
    }
    
    // ------- WRITING ------- //
    
    // Writing into a file:
   public static void write(String filePath, String content){
       try{
            Files.writeString(Path.of(filePath), content);
       } catch(IOException e){
           Output.red("Error writing into file: "+e.getMessage());
       }
   }
   // Appending onto a file:
   public static void append(String filePath, String content){
       try{
           Files.writeString(Path.of(filePath), content + System.lineSeparator(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
       } catch (IOException e){
           Output.red("Error appending into file: "+ e.getMessage());
            }
    }
   
   // -- FILE MANAGEMENT -- //
   
   // Check if a file exists:
   public static boolean exists(String filePath){
       return Files.exists(Path.of(filePath));
   }
   
   // Deleting a file:
   public static void delete(String filePath){
       try{
           // Re-assurance: (This will assure the user if the file is deleted or not.)
           boolean isDeleted = Files.deleteIfExists(Path.of(filePath));
           
           if (isDeleted)
           {Output.green("File at: " + filePath + " deleted successfuly!");}
           else {Output.red("Error deleting file: "+filePath+" (FILE DOES NOT EXIST!)");}
           
       } catch (IOException e){
           Output.red("Error deleting: "+filePath +" | Details: "+e.getMessage());
       }
   }
}
