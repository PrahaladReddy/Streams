import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class stream_basic_skeleton {
   public static void main(String[] args) {
       Supplier<String> supplier = new Supplier<String>() {
           @Override
           public String get() {
               return "hello stream !!";
           }
       };

       Consumer<String> consumer = new Consumer<String>() {
           @Override
           public void accept(String str) {
               System.out.println("Printing " + str);
           }
       };
       Stream<String> streamOfStrings = Stream.generate(supplier);

       streamOfStrings.forEach(consumer);


   }
}
