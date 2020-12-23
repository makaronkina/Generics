import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Main {

    public static void main(String[] args) {
        String[] sArray = {"apple", "orange", "kiwi", "lemon"};
        Integer[] iArray = {1, 2, 3, 4, 5, 6};
        Double[] dArray = {6.6, 5.5, 4.4, 3.3, 2.2, 1.1};
        printArray(sArray);
        printArray(iArray);
        printArray(dArray);
        taskOfFruit();
    }

    public static void taskOfFruit() {
        Box<Apple> appleBox1 = new Box<>(new Apple());
        appleBox1.addToBox(new Apple());
        appleBox1.addToBox(new Apple());

        Box<Apple> appleBox2 = new Box<>();

        Box<Orange> orangeBox = new Box<>(new Orange());
        orangeBox.addToBox(new Orange());

//		System.out.println(appleBox1);
//		System.out.println(appleBox2);
//		System.out.println(orangeBox);

        appleBox1.compare(orangeBox);
        orangeBox.compare(appleBox2);

        appleBox1.replaceFruit(appleBox2);
    }

    public static <T> void printArray(T[] array) {
        System.out.println(Arrays.toString(array));
        replaceElement(array, 0, 3);
        changeToList(array);
    }

    public static <T> void replaceElement(T[] array, int firstVal, int secondVal) {
        T originVal = array[firstVal];
        array[firstVal] = array[secondVal];
        array[secondVal] = originVal;
        System.out.println(Arrays.toString(array));
    }

    public static <T> void changeToList(T[] array) {
//        ArrayList<T> list = new ArrayList<>();
//        Collections.addAll(list, array);
        ArrayList<T> list = new ArrayList<>(Arrays.asList(array));
        System.out.println(list);
    }
}
