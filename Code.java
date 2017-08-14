package qacinema.reisswilsonlee;

import static qacinema.reisswilsonlee.Main.movieList;

public class Code extends Main {
    
  
    public static void getMovie() {
        System.out.println("Please select your movie by selecting its number");
        for (int i=0; i<movieList.length; i++){
        System.out.print(movieList[i] );
                     }
        int number=userInput.nextInt();
        System.out.println("You have selected "+movieList[number -1].substring(3) );
        Week();
        }
    
    public static void Week(){
  
        System.out.println("What date is the movie for");
        for (int j=0; j<dow.length; j++){
        System.out.println(dow[j]);
               }
        int number=userInput.nextInt();
        if (number == 4 ){
            weddisc = true;
        }
        System.out.println("You have selected "+dow[number -1].substring(3) );
        TicketPrices();
        }
     
    public static void TicketPrices(){
        System.out.println("!!!TICKET PRICES!!!");
        System.out.println("Standard £8");
        System.out.println("OAP £6");
        System.out.println("Student £6");
        System.out.println("Child £4");
        StandardTick();
    }
    
    public static void StandardTick(){
        Standard.setCost(8);
        System.out.println("How many Standard tickets would you like to buy?");
        int howmanyStan = userInput.nextInt();
        total1 = howmanyStan * cost;
        
        OAPTick();
    }                 
        
            
    public static void OAPTick(){
        OAP.setCost(6);
        System.out.println("How many OAP tickets would you like to buy?");
        int howmanyOAP = userInput.nextInt();
        total2 = howmanyOAP * cost;
        StudentTick();
}

    public static void StudentTick(){    
        Student.setCost(6);
        System.out.println("How many Student tickets would you like to buy?");
        int howmanyStu = userInput.nextInt();
        total3 = howmanyStu * cost;
        ChildTick();
            }
    
    public static void ChildTick(){
        Child.setCost(4);
        System.out.println("How many Child tickets would you like to buy?");
        int howmanyCh = userInput.nextInt();
        total4 = howmanyCh * cost;
        Result();
            }   
    public static void Result(){
        WD = 2;
        tquantity=total1+total2+total3+total4;
        offers = tquantity-WD;
        System.out.println("Thank you for visiting QA Cinemas");
        System.out.println("We Hope you enjoy your movie");
        System.out.println("Receipt...");
        if (weddisc){
            System.out.println("Discounted for Wednesday Showing.");
            System.out.println("Total Cost =£" +offers);
        }
              else {
        System.out.println("Total Cost = £" +tquantity);
                      }
    }
    
    public static void getName() {
        System.out.println("Welcome to QA Cinemas, What's your name?");
        name = userInput.nextLine(); 
        System.out.println("Hi " +name);
        getMovie();
    }
    public static void main(String[] args) {
        getName();
    }

}