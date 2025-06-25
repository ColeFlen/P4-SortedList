
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

/**
 * The SortedList class maintains a list of integers in ascending order.
 * It provides methods to add integers while keeping the list sorted,
 * and to print the current state of the list.
 * 
 *
 * @author Cole Flenniken
 * @version 1.0
 * @since 6/9/25 (Week 4 of CSC6301)
 */
public class SortedList {

    /**
     * Main method of the class. Takes user entered integers and stores in
     * sorted order.
     * 
     * @param args default parameter for main - not used
     * @since 6/9/25 (Week 4 of CSC6301)
     */
    public static void main(String[] args) {
        SortedList elements = new SortedList();
        Scanner scanner = new Scanner(System.in);

        System.out.println(
                """
                        After each input integer please use a space or click enter.
                        Input will be continued to be read until a non-integer
                        is read (excluding mentioned spacing characters).
                        """);

        while (scanner.hasNextInt()) {
            Integer currentInput = scanner.nextInt();
            System.out.println("Now adding: " + currentInput);
            elements.add(currentInput);
            elements.print();

        }

        System.out.println("No more integers expected. Ending execution.");
        scanner.close();

    }

    /**
     * A list that stores the sorted integer elements of the SortedList.
     * 
     * @since 6/9/25 (Week 4 of CSC6301)
     */
    private List<Integer> data;

    /**
     * Constructs an empty SortedList.
     * 
     * @since 6/9/25 (Week 4 of CSC6301)
     */
    public SortedList() {
        data = new LinkedList<>();
    }

    /**
     * Adds the specified integer to the list and maintains the list in sorted
     * order.
     *
     * @param number the integer to be added to the list
     * @since 6/9/25 (Week 4 of CSC6301)
     */
    public void add(Integer number) {
        data.add(number);
        Collections.sort(data);
    }

    /**
     * Prints the current state of the data list to the standard output.
     * The output includes the label "State:" followed by the contents of the data.
     * 
     * @since 6/9/25 (Week 4 of CSC6301)
     */
    public void print() {
        System.out.println("State: " + data);
    }

}