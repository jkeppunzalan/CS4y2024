/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs4truthpunzalan.exercise01;

/**
 *
 * @author TRUTH
 */
public class CS4TruthPunzalanExercise01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Qone = 15;
        String Tone = "CS";
        int Sone = 14;
        
        int Qtwo = 20;
        String Ttwo = "SS";
        int Stwo = 17;
        
        int Qthree = 25;
        String Tthree = "Math";
        int Sthree = 21;
        
        
        
        System.out.println("Test 1");
        System.out.println("No. of Questions: " + Qone);
        System.out.println("Subject: " + Tone);
        System.out.println("Top Score: " + Sone);
        
        
        System.out.println("Test 2");
        System.out.println("No. of Questions: " + Qtwo);
        System.out.println("Subject: " + Ttwo);
        System.out.println("Top Score: " + Stwo);
        
        System.out.println("Test 3");
        System.out.println("No. of Questions: " + Qthree);
        System.out.println("Subject: " + Tthree);
        System.out.println("Top Score: " + Sthree);
        
        System.out.println("Total Questions: " + (Qone + Qtwo + Qthree));
        System.out.println("Top score on Test 1 has higehr percentage comapred to Top socre on Test 3: " + (((Sone/Qone)*100)>((Sthree/Qthree)*100)));
        System.out.println("Test 3 has the same subject as Test 2: " + (Ttwo.equals(Tthree)));
    }
    
}
