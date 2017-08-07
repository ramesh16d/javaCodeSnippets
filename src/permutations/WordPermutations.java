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
public class WordPermutations {
    int a ;
    int b;
    int c;
    int d;
    int e;
    public boolean resultWord = false;

    public WordPermutations(int a, int b, int c, int d, int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }

    public  void permutateOperations(char[] chars, int len, char[] build, int pos) {
        if (pos == len) {
            String word = new String(build);
         
            int result = computeResult(word);
            if (42 == result)
            {
                System.out.println("YES");
                 resultWord = true;
                return;
            }
            else
            {
               
                    resultWord = false;
                 
            }
            return;
        }
        for (int i = 0; i < chars.length; i++) {
            build[pos] = chars[i];
            permutateOperations(chars, len, build, pos + 1);
        }
    }
    
    public  String stringExpression( String word)
    {
     
        char opsArray[] = word.toCharArray();
        
        String s = ""+a+opsArray[0]+""+b+opsArray[1]+""+c+opsArray[2]+""+d+opsArray[3]+""+e;
    return s;
    }
    
   public  int computeResult(String word) {
        int result = 0;
        String equation = this.stringExpression(word);
        String noMinus = equation.replace("-", "+-");
        String[] byPluses = noMinus.split("\\+");

        for (String multipl : byPluses) {
            String[] byMultipl = multipl.split("\\*");
            double multiplResult = 1.0;
            for (String operand : byMultipl) {
               multiplResult *= Double.parseDouble(operand);
            }
            result += multiplResult;
        }

        return result;
    }
    
}
