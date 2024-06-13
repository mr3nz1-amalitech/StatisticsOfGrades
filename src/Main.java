import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the marks separated by space: ");
        String[] numsStringArr = scanner.nextLine().split(" ");


        int[] stats = {0, 0, 0, 0, 0};
        int max = Integer.parseInt(numsStringArr[0]);
        int min = Integer.parseInt(numsStringArr[0]);
        int sum = 0;

        for (int i = 0; i < numsStringArr.length; i++) {
            if (Integer.parseInt(numsStringArr[i]) > max) {
                max = Integer.parseInt(numsStringArr[i]);
            }

            if (Integer.parseInt(numsStringArr[i]) < min) {
                min = Integer.parseInt(numsStringArr[i]);
            }

            sum = sum + Integer.parseInt(numsStringArr[i]);

            if (Integer.parseInt(numsStringArr[i]) <= 20) {
                stats[0]++;
            } else if (Integer.parseInt(numsStringArr[i]) <= 40) {
                stats[1]++;
            } else if (Integer.parseInt(numsStringArr[i]) <= 60) {
                stats[2]++;
            } else if (Integer.parseInt(numsStringArr[i]) <= 80) {
                stats[3]++;
            } else if (Integer.parseInt(numsStringArr[i]) > 80) {
                stats[4]++;
            }
        }

        System.out.println("Values: \n\n");
        System.out.println("The maximum grade is: " + max);
        System.out.println("The minimum grade is: " + min);


        System.out.println("\n\nGraph: \n\n");
        int maxCount = Arrays.stream(stats).max().getAsInt();
        for (int i = maxCount; i > 0; i--) {
            StringBuilder ln = new StringBuilder(i + " > ");
            for (int j = 0; j < stats.length; j++) {
                if (i == stats[j]) {
                    ln.append("\t#######\t");
                    stats[j]--;
                } else {
                    ln.append("\t\t\t");
                }
            }
            System.out.println(ln);
        }

        System.out.println("\t+-----------+-----------+-----------+-----------+-----------+\t");
        System.out.println("\tI\t0-20\tI\t0-20\tI\t41-60\tI\t61-80\tI\t81-100\tI5" +
                "\tn");
    }
}