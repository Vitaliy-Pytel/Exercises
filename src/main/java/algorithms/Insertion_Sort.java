package algorithms;

public class Insertion_Sort {
    static void sort(int[] cards) {
        int n = cards.length;
        for (int i = 1; i < n; i++) {
            System.out.println("Outer");
            int current = cards[i];
            int internal = i - 1;
            while (internal >= 0 && current < cards[internal]) {
                System.out.println("Inner");
                cards[internal + 1] = cards[internal];
                internal--;
            }
            cards[internal + 1] = current;
        }
    }
}
