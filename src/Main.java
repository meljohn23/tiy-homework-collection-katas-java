import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by melaniejohnson on 8/22/16.
 */
public class Main {

    public static void main(String[] args) {

        Kata kata = new Kata();

        System.out.println(Kata.firstLast6(new int[]{1, 2, 6}));
        System.out.println(Kata.firstLast6(new int[]{6, 1, 2, 3}));
        System.out.println(Kata.firstLast6(new int[]{13, 6, 1, 2, 3}));

        System.out.println(Kata.sameFirstLast(new int[]{1, 2, 3}));
        System.out.println(Kata.sameFirstLast(new int[]{1, 2, 3, 1}));
        System.out.println(Kata.sameFirstLast(new int[]{1, 2, 1}));

        System.out.println(Arrays.toString(Kata.rotateLeft3(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(Kata.rotateLeft3(new int[]{5, 11, 9})));
        System.out.println(Arrays.toString(Kata.rotateLeft3(new int[]{7, 0, 0})));

        System.out.println(Arrays.toString(kata.reverse3(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(kata.reverse3(new int[]{5, 11, 9})));
        System.out.println(Arrays.toString(kata.reverse3(new int[]{7, 0, 0})));

        System.out.println(Kata.sumFirstPenultimate(new int[]{1, 2, 3}));
        System.out.println(Kata.sumFirstPenultimate(new int[]{1, 1}));
        System.out.println(Kata.sumFirstPenultimate(new int[]{1, 1, 1, 1}));
        System.out.println(Kata.sumFirstPenultimate(new int[]{1, 2, 3, 4}));

        HashMap<String, String> foo = new HashMap<>();
        foo.put("b", "dirt");
        foo.put("a", "candy");
        System.out.println(Kata.mapBully(foo));
        foo.put("a", "candy");
        System.out.println(Kata.mapBully(foo));
        foo.put("b", "carrot");
        foo.put("c", "meh");
        foo.put("a", "candy");
        System.out.println(Kata.mapBully(foo));

        foo = new HashMap<>();
        foo.put("b", "bbb");
        foo.put("c", "ccc");
        foo.put("a", "aaa");
        System.out.println(Kata.mapShare(foo));
        foo = new HashMap<>();
        foo.put("b", "xyz");
        foo.put("c", "ccc");
        System.out.println(Kata.mapShare(foo));
        foo.put("d", "hi");
        foo.put("c", "meh");
        foo.put("a", "aaa");
        System.out.println(Kata.mapShare(foo));

        foo = new HashMap<>();
        foo.put("b", "There");
        foo.put("a", "Hi");
        System.out.println(Kata.mapAB(foo));
        foo = new HashMap<>();
        foo.put("a", "hi");
        System.out.println(Kata.mapAB(foo));
        foo.put("b", "There");
        System.out.println(Kata.mapAB(foo));

        System.out.println(kata.wordLen(new String[]{"a", "bb", "a", "bb"}));
        System.out.println(kata.wordLen(new String[]{"this", "and", "that", "and"}));
        System.out.println(kata.wordLen(new String[]{"code", "code", "code", "bug"}));

        System.out.println(kata.indexWords(new String[]{"aardvark", "apple", "zamboni", "phone"}));
        System.out.println(kata.indexWords(new String[]{"elephant"}));
        System.out.println(kata.indexWords(new String[]{}));
        System.out.println(kata.indexWords(new String[]{""}));
    }
}