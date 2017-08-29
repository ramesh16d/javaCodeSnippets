/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kcsCompany;

import static com.oracle.jrockit.jfr.ContentType.Address;
import java.util.Date;
import java.util.List;

/**
 *
 * @author User
 */
class Person {

    String name;
    int age;
    Date dob;
    Address address;
   List<String> allergies;
   
  public void displayAlergies(){
      
      for(String allergy : this.allergies){
          
          System.out.println(allergy);
      }
      
      System.out.println("kcsCompany.Person.displayAlergies()");
      
  }
          
}