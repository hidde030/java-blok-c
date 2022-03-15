import java.util.ArrayList;

public class BadWordsProces implements OpmaakProces{
    private static ArrayList<String> badWord  = new ArrayList<>();


    public static void Voegtoe(String s){
        badWord.add(s);
    }

    public String maakOp(String input) {
      for (String oneWord : badWord){
          input = input.replaceAll(oneWord, "***");
      }
      return input;
    }
}
