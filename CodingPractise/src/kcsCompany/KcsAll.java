/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kcsCompany;

import java.util.List;

/**
 *
 * @author User
 */
public class KcsAll {
    private String allergyName; // rashes
    private Sevearity severity;
    
    
    private List<String> symptoms;//itching , redness in sking
     public KcsAll(String allName , Person reportedPerson , Sevearity severity , List<String> sympots)
     {
         this.allergyName = allName;
         this.severity = severity;
         this.symptoms = sympots;
         
     }
    
    public void setAllergyName(String name){
        this.allergyName = name;
    }
    public String getAllergyName()
    {
    return this.allergyName;
    }
    public Sevearity getSeverity() {
        return severity;
    }

    public void setSeverity(Sevearity severity) {
        this.severity = severity;
    }

    public List<String> getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(List<String> symptoms) {
        this.symptoms = symptoms;
    }
    
    public String dispaySympots(KcsAll allergy)
    {   String listOfSympots="";
       for (String eachSympot : allergy.getSymptoms())
       {
               listOfSympots += ","+ eachSympot; 
       }
       
       return listOfSympots;
    }
    
    public void displayAlleryDetails(KcsAll allergy)
    {
        System.out.println(allergy);
    }

    @Override
    public String toString() {
        return "KcsAll{" + "allergyName=" + allergyName + ", severity=" + severity + ", symptoms=" + dispaySympots(this) + '}';
    }
    
    
    
    
}
