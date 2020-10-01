import java.util.Scanner; 

/**
 * The example program for Nested Statements 
 * @author Neil Fischer 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create Scanner for user input 
    Scanner input = new Scanner(System.in); 

    //Switch case example 
    // get the user choice between 1 and 5 
    System.out.println("please make a selection (1-5)"); 
    int choice = input.nextInt();  
    // gets rid of the enter key 
    input.nextLine(); 

    // Determine which candy to drop 
    if(choice == 1){
      System.out.println("Here is your chocolate bar"); 
    } else if (choice == 2){
      System.out.println("Here is your Cliff bar");
    } 
    

    //the same thing but as a switch statement 
    switch(choice){
      case 1: 
      System.out.println("here is your chocolate bar"); 
      break;
      case 2: 
      System.out.println("here is your Cliff bar"); 
      break; 
      case 3: 
      System.out.println("here is you M&M's"); 
      break; 
      default: 
      System.out.println("invalid choice");
    }

    
    
    
    
    
    
    
    
    
    //Nested loop example 
    // ask the user if the animal has feathers? (yes/no)
    System.out.println("Does the animal have feathers?"); 
    String featherAnswer = input.nextLine(); 

    // check to see the feather statis
    if(featherAnswer.equals("yes")){ 
    // get the feather colour 
    System.out.println("What colour are the feathers? (red/blue)");
    String featherColour = input.nextLine(); 

    // determine what kind of bird 
    if(featherColour.equals("blue")){
      System.out.println("that is a blue jay");
    } else if(featherColour.equals("red")){
      System.out.println("That is a Cardinal");
    }   
    // if the user answered no   
    }
  }
}
