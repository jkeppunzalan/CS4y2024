import java.util.Scanner;

public class Main{
  
   public static void intro(){
     System.out.println("Welcome to Rock, Paper, Scissors!");
     System.out.println("Please choose an option:");  
     System.out.println("1. Start game");  
     System.out.println("2. Change number of rounds");  
     System.out.println("3. Exit application");  
    }
  
	public static void main(String[] args){
		
		int roundsToWin = 2;
    int pWins = 0;
    int cWins = 0;
    int counter = 0;
    int choice = 0;
		

 while(counter <  3){
    intro();

    Scanner sc = new Scanner(System.in);
    choice = sc.nextInt();

    if(choice == 1){
       
       while(counter <= 0){
       System.out.println("This match will be first to " + roundsToWin + " wins");
       int random = (int) Math.floor(Math.random()*3) + 1;
       System.out.println("The computer has selected its move. Select your move:");
       System.out.println("1. Rock");  
       System.out.println("2. Paper");  
       System.out.println("3. Scissors");
       Scanner p = new Scanner(System.in);
       int rps = p.nextInt();

       if((rps == 1 && random == 3) || (rps == 2 && random == 1)|| (rps == 3 && random == 2)){
         System.out.println("Player Won!");
         pWins++;
       }

       else if((random == 1 && rps == 3) || (random == 2 && rps == 1)|| (random == 3 && rps== 2)){
         System.out.println("Computer Won!");
         cWins++;
       }

        else if(random == rps){
          System.out.println("It's a tie!");
        }

       if(cWins == roundsToWin){
         counter++;
       }

       if(pWins == roundsToWin){
         counter++;
       }

       
    }

       if(pWins > cWins){
       System.out.println("Player has won! Points: " + pWins);
         counter = 0;
         pWins = 0;
         cWins = 0;
       }

       if(cWins > pWins){
       System.out.println("Computer has won! Points: " + cWins);
         counter = 0;
         pWins = 0;
         cWins = 0;
       }
    }

    

    if(choice == 2){
       System.out.println("How many wins neeeded?");  
       roundsToWin = sc.nextInt();

      }

     if(choice == 3){
        System.out.println("End of program");
       System.exit(0);
      }
 }
	}
}