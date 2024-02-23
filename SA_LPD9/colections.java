package SA_LPD9;

import java.util.HashMap;
import java.util.Scanner;

public class colections {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> words = new HashMap<>();

        words.put("playa", "beach");
        words.put("sol", "sun");
        words.put("luna", "moon");
        words.put("ciudad", "city");
        words.put("montaña", "mountain");
        words.put("bosque", "forest");
        words.put("viaje", "trip");
        words.put("zapatos", "shoes");
        words.put("ropa", "clothes");
        words.put("reloj", "watch");
        words.put("familia", "family");
        words.put("computadora", "computer");
        words.put("libro", "book");
        words.put("escuela", "school");
        words.put("arte", "art");
        words.put("color", "color");
        words.put("cielo", "sky");
        words.put("estrella", "star");
        words.put("fruta", "fruit");
        words.put("flor", "flower");

        String traduction = "";

        do {
            System.out.print("Type the word you want me to translate:");
            traduction = scanner.nextLine();

            if (!traduction.equals("salir")) {
                if (words.containsKey(traduction)) {
                    System.out.println(words.get(traduction));
                } else {
                    System.out.println("The word is not in the dictionary.");
                }
            } 
        } while (!traduction.equals("salir"));
    }
}
