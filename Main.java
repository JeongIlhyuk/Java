import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        ArrayList<Point> points = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            String[] token = scan.nextLine().split(" ");
            points.add(new Point(Integer.parseInt(token[0]), Integer.parseInt(token[1])));
        }

        Collections.sort(points, (p1, p2) -> {
            if (p1.x == p2.x)
                return p1.y - p2.y;
            return p1.x - p2.x;
        });

        for (Point p : points) {
            System.out.println(p.x + " " + p.y);
        }

        scan.close();
    }
}