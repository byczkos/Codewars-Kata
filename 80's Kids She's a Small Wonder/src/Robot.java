import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;


//
//Vicky is quite the small wonder. Most people don't even realize she's not a real girl, but a robot living amongst us. Sure, if you stick around her
// home for a while you might see her creator open up her back and make a few tweaks and even see her recharge in the closet instead of sleeping in a bed.
//
//        In this kata, we're going to help Vicky keep track of the words she's learning.
//
//        Write a function, learnWord(word) which is a method of the Robot object. The function should report back whether the word is now stored,
// or if she already knew the word.
//
//        Example:
//
//        var vicky = new Robot();
//        vicky.learnWord('hello') -> 'Thank you for teaching me hello'
//        vicky.learnWord('abc') -> 'Thank you for teaching me abc'
//        vicky.learnWord('hello') -> 'I already know the word hello'
//        vicky.learnWord('wow!') -> 'I do not understand the input'
//        Robot vicky = new Robot();
//        vicky.learnWord("hello") -> "Thank you for teaching me hello"
//        vicky.learnWord("abc") -> "Thank you for teaching me abc"
//        vicky.learnWord("hello") -> "I already know the word hello"
//        vicky.learnWord("wow!") -> "I do not understand the input"
//        Case shouldn't matter. Only alpha characters are valid. There's also a little trick here. Enjoy!


public class Robot {

    List<String> list = new ArrayList<>();
    String pattern = "^[a-zA-Z]+$";

    public String learnWord(String word){
        list.add("THANK");
        list.add("YOU");
        list.add("FOR");
        list.add("TEACHING");
        list.add("ME");
        list.add("I");
        list.add("ALREADY");
        list.add("KNOW");
        list.add("THE");
        list.add("WORD");
        list.add("DO");
        list.add("NOT");
        list.add("UNDERSTAND");
        list.add("INPUT");
        if(list.contains(word.toUpperCase())){
            System.out.println("I already know the word "+ word);
            return "I already know the word "+ word;
        }
        else if(word.matches(pattern)){
            list.add(word.toUpperCase());
            System.out.println("Thank you for teaching me " + word);
            return "Thank you for teaching me " + word;}
        else {
            System.out.println("I do not understand the input");
            return "I do not understand the input";
        }
    }
}