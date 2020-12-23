import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {
    private ArrayList<T> boxOfFruits;

    public Box(T... fruits) {
        boxOfFruits = new ArrayList<T>(Arrays.asList(fruits));
    }

    public void addToBox(T fruit) {
        boxOfFruits.add(fruit);
    }

    public float getWeight() {
        float weight = 0.0f;
        for (T fruit : boxOfFruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public void compare(Box<? extends Fruit> anotherBox) {
        if (Math.abs(this.getWeight() - anotherBox.getWeight()) < 0.0001) {
            System.out.println("Weight of boxes are equals: " + this.getWeight());
        } else {
            System.out.printf("Weight of boxes are not equals: %s and %s\n", this.getWeight(), anotherBox.getWeight());
        }
    }

    public void replaceFruit(Box<T> anotherBox) {
        for (T fruit : boxOfFruits) {
            anotherBox.getBoxOfFruits().add(fruit);
        }
        this.boxOfFruits.clear();
//        System.out.println(anotherBox);
//        System.out.println("Now there" + boxOfFruits);
    }

    public ArrayList<T> getBoxOfFruits() {
        return boxOfFruits;
    }

    @Override
    public String toString() {
        return "Box{" +
                "boxOfFruits=" + boxOfFruits +
                '}';
    }
}
