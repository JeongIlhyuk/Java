import java.util.Scanner;
import java.util.Stack;

public class ex28278 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner scan = new Scanner(System.in);
        // System.out.print("Input:");
        int instNum;
        // while (true) {
        // instNum = Integer.parseInt(scan.nextLine());
        // if (instNum >= 1 && instNum <= 1000000)
        // break;
        // else
        // sb.append("Type 1~1000,000");
        // }
        instNum = Integer.parseInt(scan.nextLine());

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < instNum; i++) {
            // System.out.print("Input:");
            String select = scan.nextLine();
            String[] token = select.split(" ");
            switch (token[0]) {

                case "1" -> {
                    int tokenInt = Integer.parseInt(token[1]);
                    // if (tokenInt >= 1 && tokenInt <= 100000)
                    // stack.push(tokenInt);
                    // else
                    // sb.append("Type 1~100,000");
                    stack.push(tokenInt);
                }
                case "2" -> {
                    if (stack.empty())
                        sb.append("-1\n");
                    else
                        sb.append(stack.pop() + "\n");
                }
                case "3" -> sb.append(stack.size() + "\n");
                case "4" -> {
                    if (stack.empty())
                        sb.append("1\n");
                    else
                        sb.append("0\n");
                }
                case "5" -> {
                    if (!stack.empty())
                        sb.append(stack.peek() + "\n");
                    else
                        sb.append("-1\n");
                }
            }
        }
        System.out.println(sb);
        scan.close();
    }
}