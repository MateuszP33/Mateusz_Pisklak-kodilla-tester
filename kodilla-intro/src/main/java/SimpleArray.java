import com.sun.source.util.SourcePositions;

import java.sql.SQLOutput;
import java.util.Arrays;

public class SimpleArray {
    public static void main(String[] args) {
        String[] books = new String[5];
        books[0] = "7 cząteczek";
        books[1] = "Wartka śmierć";
        books[2] = "Pułapki myslenia";
        books[3] = "Sekretne życie ptaków";
        books[4] = "Przepis na człowieka";
        String book3 = books[3];
        System.out.println(book3);
        int lenght = books.length;
        System.out.println("Moja tablica zawiera "+ lenght + " książek!");

    }
}
