import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner in = null;
        PrintWriter out = null;

        try {

            in = new Scanner(new FileReader("input.txt"));
            out = new PrintWriter(new FileWriter("output.txt"));

            MyLinkedList<String> list = new MyLinkedList<>(null, null);
            MyLinkedQueue<String> queue = new MyLinkedQueue<>();

            while (in.hasNext()) {
                list.addLast(in.next());
            }

            int n = toInt(list.get(list.size() - 1));
            list.removeLast();

            while (!list.isEmpty()) {
                queue.enqueue(list.get(0));
                list.removeFirst();
            }

            while (queue.size() > 1) {
                for (int i = 0; i < n - 1; i++) {
                    String temp = queue.dequeue();
                    queue.enqueue(temp);
                }
                queue.dequeue();
            }

            out.print(queue.dequeue());

        } finally {

            if (in != null) in.close();
            if (out != null) out.close();

        }

    }

    /**
     * <p>Makes from String Integer.</p>
     *
     * @param s input string
     * @return result - converted s
     */
    private static int toInt(String s) {
        int result = 0;
        StringBuilder buffer = new StringBuilder();

        while (s.length() > 1) {
            result *= 10;
            result += s.charAt(0) - '0';

            s = buffer.substring(1, s.length());
        }

        result *= 10;
        result += s.charAt(0) - '0';

        return result;
    }

}
