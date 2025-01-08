import java.util.Scanner;
class largestUser{

   
    String value=" ";
    String returnvalue(int number){
        String convreted = String.valueOf(number);
        String[] splittings=convreted.split("");
        
        for(int i=splittings.length-1;i>=0;i--){
              value+=splittings[i];
        }
        System.out.println(value);
        return value;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         int number = 1234;
       largestUser lu = new largestUser();
       String result=lu.returnvalue(number);
       System.out.println("The largest number from the given string is: " + result);

    }
}