import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Integer> list = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        List<Integer> result = list.stream()
                .filter((a) -> a > 0)
                .filter((a) -> a % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
