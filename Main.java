package qacinema.reisswilsonlee;

import java.util.Scanner;

public class Main {
    static String[] movieList = {"1) AtomicBlonde " , "2) TheNutJob2 " , "3) SpidermanHomecoming " , "4) TheEmojiMovie " , "5) Dunkirk "};
    static String[] dow = {"1) Sun" , "2) Mon", "3) Tue" , "4) Wed" , "5) Thu" , "6) Fri" , "7) Sat"};
    public static String name;
    protected static int cost;
    public static int total1;
    public static int total2;
    public static int total3;
    public static int total4;
    public static int discount;
    public static int tquantity;  
    public static int offer;
    public static int WD;
    public static boolean weddisc;
    public static int offers = tquantity-WD;
    static Scanner userInput = new Scanner(System.in);

    public static int getCost(){
        return cost;
    }
    public static void setCost(int newCost){
        cost = newCost;
    }
    public static void StandardTick(){
    //cost = 8;
    }
    protected static void OAPTick(int npo){
    cost = npo;
    }
    protected static void StudentTick(int npst){
    cost = npst;
    }
    protected static void ChildTick(int npc){
    cost = npc;
    }
    
    
    }
