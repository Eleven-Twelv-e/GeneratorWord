import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Translator {
    public static List<String> translator(String text) {
        return Arrays.stream(text.replaceAll("\\p{Punct}", "").split(" "))
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
}