import java.util.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int N = random.nextInt(1000);

        int[] votes = new int[16];

        for (int i = 0; i < N; i++) {
            int pairNumber = random.nextInt(16)+1;
            votes[pairNumber-1]++;}

        int[] sortedVotes = Arrays.copyOf(votes, votes.length);
        Arrays.sort(sortedVotes);
        int count = 0;
        for (int i = sortedVotes.length - 1; i >= 0 && count < 3; i--) {
            int maxElement = sortedVotes[i];
            for (int j = 0; j < votes.length; j++) {
                if (votes[j] == maxElement) {
                    System.out.println("Команда под № " + (j + 1) + " набрала " + maxElement + " голосов!");
                    votes[j] = 0;
                    count++;
                    break;
                }
            }
        }
    }
}