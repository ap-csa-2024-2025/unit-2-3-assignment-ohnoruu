public class Classwork
{
  public static void main(String[] args)
  {
    System.out.println(firstLastN("dictionary", 3));
    System.out.println(delEnd("library", 5));
    System.out.println(compareLower("antelope", "tiger"));
    System.out.println(lengthFirst("Everything in its right place"));
  }

  public static String firstLastN(String word, int n){
    String output = new String();
    //Getting first n letters
    String firstN = word.substring(0,n); //0-(n-1)
    //Getting last n letters
    int indexOfNToLast = word.length() - n; //index of nth to last letter
    String lastN = word.substring(indexOfNToLast);
    output = firstN+lastN;
    return output;
  }

  public static String delEnd(String word, int n){
    int wordLength = word.length();
    String output = word.substring(0,(wordLength-n));
    return output;
  }

  public static int compareLower(String word1, String word2){
    //int compareTo(String other)
    String lowerWord1 = word1.toLowerCase();
    String lowerWord2 = word2.toLowerCase();
    int output = lowerWord1.compareTo(lowerWord2);
    return output;
  }

  public static int lengthFirst(String sentence){
    int spaceIndex = sentence.indexOf(" ");
    String firstWord = sentence.substring(0, spaceIndex);
    int lengthFirst = firstWord.length();
    return lengthFirst;
  }

}
