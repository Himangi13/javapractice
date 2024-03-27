package programs;
import java.util.List;
public class IntegerFinder {
	private final Listener listener;
	 
    public IntegerFinder(Listener listener) {
        this.listener = listener;
    }
 
    public void findInteger(List<Integer> inputList, int target) {
        for (int i = 0; i < inputList.size(); i++) {
            if (inputList.get(i) == target) {
                listener.onIntegerFound(target, i);
            }
        }
    }
 
    public static void main(String[] args) {
        IntegerFinder finder = new IntegerFinder((number, index) -> {
            System.out.println("Found " + number + " at index " + index);
        });
 
        List<Integer> myList = List.of(10, 20, 30, 40, 50, 30);
        int targetNumber = 30;
        finder.findInteger(myList, targetNumber);
    }
}
 
interface Listener {
    void onIntegerFound(int number, int index);
}


