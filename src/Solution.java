


import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        // 1. Read the number of elements N
        if (sc.hasNextInt()) {
            int n = sc.nextInt();

            // 2. Read N integers and add them to the LinkedList
            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            }

            // 3. Create a ListIterator
            ListIterator<Integer> it = list.listIterator();

            // 4. Forward Traversal
            System.out.print("Forward: ");
            while (it.hasNext()) {
                System.out.print(it.next() + (it.hasNext() ? " " : ""));
            }
            System.out.println();

            // 5. Backward Traversal
            // Note: After the forward loop, the iterator 'it' is at the end of the list
            System.out.print("Backward: ");
            while (it.hasPrevious()) {
                System.out.print(it.previous() + (it.hasPrevious() ? " " : ""));
            }
            System.out.println();
        }

        sc.close();
    }
}