import java.util.ArrayList;

//This is the Problem 5 of CS673 Assignment 1
//Name: Yuhe Zhang
public class CombineList {
    public ArrayList<Character> combineList(ArrayList<Character> a, ArrayList<Character> b) {
        ArrayList<Character> result = new ArrayList<>();
        int index = a.size() - 1;
        for (int i = 0; i <= index; i++) {
            result.add(a.get(i));
            result.add(b.get(i));
        }
        return result;
    }
}
