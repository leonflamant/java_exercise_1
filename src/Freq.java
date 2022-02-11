import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Scanner;
import java.nio.file.Paths;

public class Freq {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Donne moi le chemin du fichier que je dois lire: ");
        String rep = scan.nextLine();

        try {
            Path path = Paths.get(rep);
            String content = Files.readString(path);
            String[] words = content.split(" ");
            Stream<String> wordStream = Arrays.stream(words);
            Map<String, Long> countsByWord = wordStream
                    .filter(s -> !s.isBlank())
                    .map(s -> s.toLowerCase())
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            Comparator<Map.Entry<String, Long>> countReversed =
                    Comparator.<Map.Entry<String, Long>, Long>comparing(e -> e.getValue())
                            .reversed();
            String threeMostOccurringWords = countsByWord.entrySet().stream()
                    .sorted(countReversed)
                    .limit(3)
                    .map(e -> e.getKey())
                    .collect(Collectors.joining(" "));
            System.out.println(threeMostOccurringWords);
        } catch (IOException e) {
            System.out.println("Unreadable file: " + e);
        }
    }


}
