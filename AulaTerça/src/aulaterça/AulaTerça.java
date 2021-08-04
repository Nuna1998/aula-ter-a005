/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaterça;

/**
 *
 * @author bruna.pereira2
 */
public class AulaTerça {
    int a = 1;
    int b = 2;
    int c = 3;
    int d = 4;
    int e = 6;
    int f = 8;
    int g = 10;
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        AulaTerça Val = new AulaTerça ();
            String str1 = "ola mundo \n";
            int[] ListNum = {1, 2, 3, 4, 6, 8, 10};
            int resp = 11;
            
            
            System.out.println(str1);
            System.out.printf ("soma das variáveis a e b = %d \n ", (Val.b + Val.g + Val.e));
                if(Val.b + Val.g + Val.e == resp){
                    System.out.print("Resposta correta " + (ListNum [6] + ListNum[0]));
                }
                else{
                     System.out.print("Resposta Incorreta");
                }       
        // TODO code application logic here
    }
    
}
