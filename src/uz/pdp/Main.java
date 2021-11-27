package uz.pdp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.function.IntSupplier;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Checker checker = (s, s2) -> s.contains(s2);

        System.out.println(checker.check("hello","lo"));
        System.out.println(checker.check("hello","lol"));
    }
}

interface Checker{
    boolean check(String s1,String s2);
}
