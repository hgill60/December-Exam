/******************************************
 * Name:    Harnoor Gill
 * Class:   CS20s- 002
 *
 * Assignment:  DecemberExam
 * 
 * Description: This program calculate the overall bill by adding daytime charge, evening charge, 
weekend charge, and contract fee 
 *              In this plan there is a contract fee of $25 
 *             and a usage charge based on the following. No
 *        
 * 
 * Input:   What data will be input
 *          Where will the data come from
 * 
 * Output:  Describe the results that will
 *          be output to the console
 *          window, message dialog, or 
 *          output file 
 *****************************************/
public class DecemberExam1 {
    public static void main(String[] args){
    // ***** Declaration of Constants *****
     
     final double daytimecharges = 0.08;  // charge of daytime per minute.
     final double eveningtimecharges = 0.05;  // charge of evening per minute.
     final double weekendtimecharges = 0.02;  // charge of Weekemd per minute.
     
     final int ContractFee = 25; // contract fee on the total charge.
     
    // ***** Declaration of Varibles *****
     double daytimeminutes = 0.00; 
     double eveningtimecharge = 0.00;
     double weekendtimecharge = 0.00;
     
     double bill = 0.00;
     
        
    // ***** Object Creation *****
    
     
    // ***** Screen Banner *****
    
        System.out.println("************************");
        System.out.println("Name: R.Sveison");
        System.out.println("Class: CS20S 00z");
        System.out.println("Assignment: AxQy");
        System.out.println("************************");
    
    // ***** Get Input *****
    
        System.out.println();
        System.out.println("tell the user what input you want");
        System.out.println("and instruct them to enter it from the");
        System.out.println("keyboard");
        System.out.println();
        
    // ***** Processing *****
    
    // ***** Output *****
    
        System.out.println("\nFormatted output goes here\n");
        
    // ***** Closing Message *****
    
        System.out.println("end of processing");
        
    } // end of main
} // end class
