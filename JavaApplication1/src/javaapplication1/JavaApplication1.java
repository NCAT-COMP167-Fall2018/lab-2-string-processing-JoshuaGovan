/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author jagovan
 */

import java.util.Scanner;
import java.io.File;
        
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    static String[] records;
    public static void main(String[] args) {
        // TODO code application logic here
        records= new String[100];
      try{
        Scanner dataReader = new Scanner(new File(args[0]));   
       
            int currentIndex=0;
            while (dataReader.hasNext()){
               String[] line = dataReader.nextLine().split(",");
               String firstName = line[0];
               String lastName = line[1];
               String age = line[2];
               String gender= line[3];
               String phoneNumber= line[4];
               String email = line[5];
                
              
           records[currentIndex]= String.format("%-20s%-20s%-10s%10d",
                   firstName, lastName, gender, age);
           System.out.println(records[currentIndex]);
               currentIndex++;
 
            }
        }
                catch (java.io.FileNotFoundException ex){
                    System.out.println("Your data is lost");
                }
      
    
    }
    
}
