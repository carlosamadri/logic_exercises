package RR_LPD10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class dictionary {
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

        List<String> wordList = new ArrayList<>(words.keySet());
        Collections.shuffle(wordList);

        String[] terms = new String[5];
        for (int i = 0; i < terms.length; i++) {
            terms[i] = wordList.get(i);
        }

        int rightAnswers = 0;
        for (String term : terms) {
            System.out.print("Please type in the English translation of " + term + ": ");
            String translation = scanner.nextLine();
            if (translation.equals(words.get(term))) {
                System.out.println("Right answer!");
                rightAnswers++;
            } else {
                System.out.println("Wrong answer. The right translation is " + words.get(term) + ".");
            }
        }
        System.out.println("You have " + rightAnswers + " correct answers & " + (terms.length - rightAnswers) + " incorrect answers.");
        scanner.close();
}
}
