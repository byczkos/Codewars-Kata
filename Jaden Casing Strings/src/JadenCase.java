//    Jaden Smith, the son of Will Smith, is the star of films such as The Karate Kid (2010)
//    and After Earth (2013). Jaden is also known for some of his philosophy that he delivers
//    via Twitter. When writing on Twitter, he is known for almost always capitalizing every word.
//
//    Your task is to convert strings to how they would be written by Jaden Smith. The strings
//    are actual quotes from Jaden Smith, but they are not capitalized in the same way he originally typed them.
//
//    Example:
//
//    Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
//    Jaden-Cased:     "How Can Mirrors Be Real If Our Eyes Aren't Real"
//    Note that the Java version expects a return value of null for an empty string or null.

//    URL: https://www.codewars.com/kata/5390bac347d09b7da40006f6/solutions/java

public class JadenCase {

    
//    === check the solution ===
    public static void main(String[] args) {
        JadenCase jadenCase = new JadenCase();
        System.out.println(jadenCase.toJadenCase("How can mirrors be real if our eyes aren't real"));
    }
    
    public String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty()) {
            return null;
        }
        String[] stringArray = phrase.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < stringArray.length; i++) {
            builder.append(stringArray[i].substring(0, 1).toUpperCase());
            builder.append(stringArray[i].substring(1) + " ");
        }
        builder.deleteCharAt(builder.lastIndexOf(" "));
        return builder.toString();
    }

}
