import java.util.stream.Stream;

public class lambda_skeleton {
    public static void main(String[] args) {

        Stream.generate(() -> "hello stream !!")
                    .forEach(str -> System.out.println("printing the string : " + str));
    }
}

