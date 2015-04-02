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
         
       } catch (IOException ex) {
           System.out.println(ex);
       }
       return null;
   }
   
   
 private void WriteFile(String writeString)
 {
      try {
         
             FileWriter fileWriter;
              fileWriter = new FileWriter("record.txt");
          try (BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
              
              
              
              
             bufferedWriter .append(writeString);
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
           fileReader = new FileReader("record.txt");
           // Always wrap FileReader in BufferedReader.
           BufferedReader bufferedReader =   new BufferedReader(fileReader);
          try {
              String readLine = bufferedReader.readLine().trim();
              
                    
              
              return readLine;
              
          } catch (IOException ex) {
              System.out.println(ex);
          }
           
        
       } catch (FileNotFoundException ex) {
           System.out.println(ex);
       } finally {
           try {
               fileReader.close();
           } catch (IOException ex) {
               System.out.println(ex);
           }
       }
       return null;

         
  }
  
  
   
    
}
