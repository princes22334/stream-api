import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//When we have to Manipulate all Value
public class LearnMapCondition {
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(10, 1, 12, 43);
        List<Integer> newData = data.stream().map(x -> x*2).collect(Collectors.toList());
        System.out.println(newData);
    }
}
