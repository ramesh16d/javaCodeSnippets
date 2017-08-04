/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacodepractice;
/**
 *
 * @author User
 */
public class AmstrongNumber {
    
    public boolean isAmstrongNumber(int num){
        boolean isAmstrong = false;
        int sum =0;
        int number= num;
     while (number>0)
     {
       int eachDigit = number%10;
       number = number/10;
       sum= (int) (sum+ (Math.pow(eachDigit, (num+"").length())));
     }    
     if(sum == num)
     {
     isAmstrong=true;
             }
   return isAmstrong; }
     
}
