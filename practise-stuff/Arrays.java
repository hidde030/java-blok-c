import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {
        ArrayList<Integer> numbers  = new ArrayList<Integer>();
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println(j);
            }



        }


        System.out.println(numbers.size());
        System.out.println(numbers);
    }
}
