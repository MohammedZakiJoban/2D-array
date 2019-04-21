/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

import java.util.Scanner;

/**
 *
 * @author mzj10
 */
public class JavaApplication18 {

    /**
     * @param args the command line arguments
     */
    static int biggestlenght = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       String [][]table= new String [6][4];
      
        table[0][0]="Name";
        table[0][1]="Age";
        table[0][2]="Email";
        table[0][3]="Address";
        
        for(int i = 1;i <=5;i++){
            System.out.println(i);
        System.out.print("Please enter a name: ");
        table[i][0]= sc.nextLine();
        System.out.print("Please enter an age: ");
        table[i][1]= sc.nextLine();
        System.out.print("Please enter an emaill: ");
        table[i][2]= sc.nextLine();
        System.out.print("Please enter an address: ");
        table[i][3]= sc.nextLine();  
        System.out.println();
        }
      
       
        
        int i ;
        int col = 0;
       
        
        for (int count = 0; count<=3;count++){
            
       
        for(i=0;i<=5;i++){
            findLength(table[i][col]);
            
        }
        for (i=0;i<=5;i++){
            table[i][col]=filling(table[i][col]);
        }
        col++;
        biggestlenght=0;
            } 
        
       
        
        System.out.println("---------------------------------------------");
        for(String []name:table){// printing thr table
          
            System.out.print("++");
            for (String info: name){
                System.out.print(" "+info+"++");
            }
            System.out.println();
        }
        
   System.out.println("---------------------------------------------");
      }
     public static String filling(String subject){
          String space = "*";
          int letters ;
          for (letters=subject.length();letters <= biggestlenght;letters++){
              subject = subject+space;
             
          }
          return subject;
         
      }
    public static void findLength(String names){
        
        int length = names.length();
       
        biggestlenght = Math.max(length, biggestlenght);
        
        
    }
    }
    

