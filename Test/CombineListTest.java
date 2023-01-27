import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class CombineListTest {
    private CombineList testList = new CombineList();
    private ArrayList<Character> firstList = new ArrayList<>();
    private ArrayList<Character> secondList = new ArrayList<>();
    private ArrayList<Character> finalList = new ArrayList<>();
    private ArrayList<Character> expectList = new ArrayList<>();

    @Test
    void correctList() {
        Collections.addAll(firstList, 'a', 'b', 'c');
        Collections.addAll(secondList, '1', '2', '3');
        Collections.addAll(expectList, 'a', '1', 'b', '2', 'c', '3');
        finalList = testList.combineList(firstList, secondList);
        assertEquals(expectList, finalList);
    }

    @Test
    void emptyList() {
        finalList = testList.combineList(firstList, secondList);
        assertEquals(expectList, finalList);
    }
}