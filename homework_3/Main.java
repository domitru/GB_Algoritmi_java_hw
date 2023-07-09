package homework_3;

public class Main {
    public static void main(String[] args) {

        reverseLinkedlistMetod list = new reverseLinkedlistMetod();

        list.add(7);
        list.add(67);
        list.add(98);
        list.add(0);
        list.add(-55);

        list.print();
        list.reverse();
        list.print();
    }
}
