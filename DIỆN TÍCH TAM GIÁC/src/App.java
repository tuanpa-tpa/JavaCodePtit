import java.text.DecimalFormat;
import java.util.Scanner;

class Point {
    private double x;
    private double y;

    public Point() {

    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance(Point secondPoint) {
        double d1 = this.x - secondPoint.x;
        double d2 = this.y - secondPoint.y;
        return Math.sqrt((d1 * d1) + (d2 * d2));
    }

}

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            Point p1 = new Point();
            Point p2 = new Point();
            Point p3 = new Point();

            p1.setX(scanner.nextDouble());
            p1.setY(scanner.nextDouble());

            p2.setX(scanner.nextDouble());
            p2.setY(scanner.nextDouble());

            p3.setX(scanner.nextDouble());
            p3.setY(scanner.nextDouble());

            double a = p1.distance(p2);
            double b = p1.distance(p3);
            double c = p2.distance(p3);

            DecimalFormat decf = new DecimalFormat("#0.00");
            if (a + b > c && a + c > b && b + c > a) {
                double res = Math.sqrt((a + b + c) * (a + b - c) * (a - b + c) * (-a + b + c))/(double)4;
                System.out.println(decf.format(res));
            } else {
                System.out.println("INVALID");
            }
        }
        scanner.close();
    }
}