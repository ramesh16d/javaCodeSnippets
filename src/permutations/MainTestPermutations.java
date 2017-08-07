/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package permutations;

/**
 *
 * @author User
 */
public class MainTestPermutations {
    public static void main(String[] args) {
        char[] chars = "+-*".toCharArray();
        int len = 4;
        WordPermutations mypPermutations = new WordPermutations(44, 6, 1, 49, 47);
        mypPermutations.permutateOperations(chars, len, new char[len], 0);
        if(!mypPermutations.resultWord)
        {
            System.out.println("NOOOOO");}
        
        System.out.println("*****************************************************************");
        
        WordPermutations mypPermutations2 = new WordPermutations(34, 1, 49,2, 21);
        mypPermutations2.permutateOperations(chars, len, new char[len], 0);
                if(!mypPermutations.resultWord)
        {
            System.out.println("NOOOOO");}
    }
}
