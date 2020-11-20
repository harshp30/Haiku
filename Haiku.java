
import java.util.Scanner;

public class Haiku {
    public static void main(String[] args) {
        Scanner numscan = new Scanner(System.in);
        Scanner wordscan = new Scanner(System.in);
        
        int mark;       
        mark = (int) (Math.random()*10+1);
        
        boolean rhyme;
        boolean dub = false;
                
        String name;
        String line1;
        String line2;
        String line3;
        String work;
        int age;
        int years;
        
        System.out.println("What is your name?");
            name = wordscan.nextLine();
            
        System.out.println("Welcome to So You Think You Can Haiku.  How old are you " + name + "?");
            age = numscan.nextInt();
            
        if (age < 18){
            System.out.println("Just to clarify " + name + " your are in the junior division");           
        } else {
            System.out.println("Just to clarify " + name + " you are in the senior division");
        }
        
        System.out.println("Now type out the first line of your haiku below");
            line1 = wordscan.nextLine();
        System.out.println("Now type out the second line of your haiku below");
            line2 = wordscan.nextLine();
        System.out.println("Now type out the third line of your haiku below");
            line3 = wordscan.nextLine();
            
        String one = line1.substring(line1.length() - 3, line1.length()) + ".";
        String two = line2.substring(line2.length() - 3, line2.length()) + ".";
        String three = line3.substring(line3.length() - 3, line3.length()) + ".";
        
        if(two.equals(three)){
            dub = true;
        } else{
            dub = false;
        }
            
        
        System.out.println("Your mark out of 10 is " + mark);
        
        System.out.println("How many years have you been spitting this hot fire?");
            years = numscan.nextInt();
            
        System.out.println("What is your actual job, because we know you ain't earning from this?");
            work = wordscan.nextLine();
                     
        int prizemoney = years * mark * 500;
        
        if (dub == true) {
            prizemoney = prizemoney * 2;
        }
        
        System.out.println(name + ", that was a pretty good haiku for someone who works at " + work + ". Now, thanks for your haiku writing skills, you get $" + prizemoney);
        
        
    } //end main
} // end class
