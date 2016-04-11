package psun;

import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/peeking-iterator/
 *
 * solution reference:
 * https://github.com/google/guava/blob/703ef758b8621cfbab16814f01ddcc5324bdea33/guava-gwt/src-super/com/google/common/collect/super/com/google/common/collect/Iterators.java#L1125
 */
public class Main {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1,2,3);

        PeekingIterator peekingIterator = new PeekingIterator(list1.iterator());

        while (peekingIterator.hasNext()) {

            Integer next =  peekingIterator.next();

            System.out.print(next + ", ");

        }

        System.out.println();

        List<String> list2 = Arrays.asList("foo", "boo", "woo");

        PeekingIteratorGeneric<String> peekingIteratorStr = new PeekingIteratorGeneric<String>(list2.iterator());

        while (peekingIteratorStr.hasNext()) {

            String next =  peekingIteratorStr.next();

            System.out.print(next + ", ");

        }


    }
}
