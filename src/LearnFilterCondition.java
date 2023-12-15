import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Whenever we have to Filter some Value we use Filter Condition
public class LearnFilterCondition {

    public static void main(String[] args){
        List<Integer> data = Arrays.asList(10, 14, 65, 76, 21, 34, 86, 90);
        //Filter Even numbers from this List
        List<Integer> evenNumber = data.stream().filter(x -> x%2==0).collect(Collectors.toList());
        System.out.println(evenNumber);
    }
}
