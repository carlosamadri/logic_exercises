package SA_LPD6;

import java.util.Scanner;

public class Inverted {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int i;
        
        System.out.print("Enter the string to be inverted:");
        String text = scanner.nextLine();
        System.out.println(text);

        for(i = text.length()-1; i >= 0; i--){
            System.out.print(text.charAt(i));
        }
    }
}