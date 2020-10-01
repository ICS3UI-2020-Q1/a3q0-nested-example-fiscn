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

    // ask the user if the animal has feathers? (yes/no)
    System.out.println("Does the animal jave feathers?"); 
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
