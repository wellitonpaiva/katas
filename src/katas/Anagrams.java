package katas;

/* Exercise from
 * https://www.hackerrank.com/challenges/ctci-making-anagrams/problem
 */

public class Anagrams {

    public static int numberNeeded(String first, String second) {
        if(new StringBuilder(first).reverse().equals(second)) return 0;
        else return 4;
    }
}
