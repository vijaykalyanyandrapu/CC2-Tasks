import java.util.ArrayList;
public class BagOfNumbers {
private ArrayList bag = new ArrayList<>();
public void add(int number) {
bag.add(number);
}
public boolean remove(int number) {
return bag.remove(Integer.valueOf(number));
}
public boolean contains(int number) {
return bag.contains(number);
}
public int size() {
return bag.size();
}
public boolean isEmpty() {
return bag.isEmpty();
}
public void display() {
System.out.println("Bag contents: " + bag);
}
public static void main(String[] args) {
BagOfNumbers bag = new BagOfNumbers();
bag.add(10);
bag.add(20);
bag.add(10);
bag.display();
bag.remove(10);
bag.display();
System.out.println("Contains 20? " + bag.contains(20));
System.out.println("Size: " + bag.size());
}
}
