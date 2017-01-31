// Janelynn Camingue
// 1/30/17
// This program is a math quiz. It asks the user 3 questions. If the user gets one wrong, the program exits out. If 
// the user keeps getting them right, then the player keeps going until they get a question wrong or they complete
// all 3 questions.
import java.util.Scanner;

class Math_Quiz{
   
   public static void main(String[] args){
	  // declare the variables
	  int answer1, answer2, answer3, start;
      Scanner sc = new Scanner(System.in);

// prints out the instructions
      System.out.println("Let's test your basic math skills!") ;
	  System.out.println("Type 1 for the first answer, 2 for the second, and 3 for the third.");
	  System.out.println("Type 0 and press enter to start");
      start = sc.nextInt();
	  
	  
// question 1	  
	  System.out.println("If x is 7 and y is 9, what is the value of z in the following equation: 4x+2z=3y?");
	  System.out.println("1. -0.75"); //wrong answer
	  System.out.println("2. -0.50"); // right answer
	  System.out.println("3. 1.00"); // wrong answer
	  answer1=sc.nextInt();
// exits out if user answers wrong	  
	  if(answer1==1||answer1==3){
		  System.out.println("Sorry, but you are wrong.");
		  //int n=2;
		  System.exit(answer1=1);
		  System.exit(answer1=3);
	  }
// keep going if the user gets it right.
// question 2
	  else if(answer1==2){
		  System.out.println("Correct!");
		  System.out.println(" ");
	  }
	  
	   System.out.println("Which triangle has two sides of equal length?");
	   System.out.println("1. Isosceles");
	   System.out.println("2. Scalene");
	   System.out.println("3. None of the above");
	   answer2=sc.nextInt();
// exits out if the user gets the question wrong
	  if(answer2==2||answer2==3){
		  System.out.println("Sorry, but you are wrong.");
		  System.exit(answer2=2);
		  System.exit(answer2=3);
	  }
// continues if the user gets it right
// question 3
	  else if(answer2==1){
		  System.out.println("Correct!");
		  System.out.println(" ");
		  
	  }
	  System.out.println("Convert the binary number 0001 to decimal");
	  System.out.println("1. 9");
	  System.out.println("2. 1");
	  System.out.println("3. 3");
	  answer3=sc.nextInt();
// quits if the user gets it wrong
	  
	  if(answer3==1|| answer3==3){
		  System.out.println("Sorry, but you are wrong.");
		  System.exit(answer3=1);
		  System.exit(answer3=3);
	  }
// last question
// if the user gets it right, then the user gets a congrats message.
	  else if(answer3==2){
		  System.out.println("Correct!");
		  System.out.println(" ");
		  System.out.println(" ");
		  System.out.println("Congrats! You got all of the questions right.");
		  System.exit(answer3=2);
	  }
   }
}
	  
	  
	
 
      


