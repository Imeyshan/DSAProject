/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dsaproject;

import com.cedarsoftware.util.io.JsonReader;
import com.cedarsoftware.util.io.JsonWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Imeyshan
 */
public class HouseFile {
 
    public HouseFile() {
         
    }
   
   
      
   public void Work_With_JSONWrite(ListHouse []theArray )
   {
       try {
     String JSONString=    JsonWriter.objectToJson(theArray);
                
           WriteFile(JSONString);
       } catch (IOException ex) {
           System.out.println(ex);
          
       }
   }
   
   
   
   public ListHouse[] Work_With_JSONReader()
   {
       try {
           
           ListHouse  []jsonToJava = (  ListHouse[]) JsonReader.jsonToJava(ReadFile());
        
         return jsonToJava;
       }catch(NullPointerException ex){
          // System.out.println();
       } catch (IOException ex) {
           System.out.println(ex);
          
       }
       return null;
   }
   
   
 private void WriteFile(String writeString)
 {
      try {
         
             FileWriter fileWriter;
              fileWriter = new FileWriter("List.txt");
          try (BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
              
              
              
              
             bufferedWriter .write(writeString);
              bufferedWriter.close();
          }
       } catch (IOException ex) {
           System.out.println(ex);
          
       
       }
       
 }
 
 
   private String ReadFile()
  {
      FileReader fileReader =   null;
       try {
           fileReader = new FileReader("List.txt");
           // Always wrap FileReader in BufferedReader.
           BufferedReader bufferedReader =   new BufferedReader(fileReader);
          try {
              String readLine = bufferedReader.readLine().trim();
                               
              
              return readLine;
            
              
          } catch (IOException ex) {
              System.out.println(ex);
             
          }
           
       }catch(NullPointerException ex){
       } catch (FileNotFoundException ex) {
           System.out.println(ex);
         
       } finally {
          
       }
       return null;

         
  }
  
  
   
    
}
