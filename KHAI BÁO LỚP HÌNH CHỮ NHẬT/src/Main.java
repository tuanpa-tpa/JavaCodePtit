import java.util.Scanner;

class Rectange {
    private double width;
    private double height;
    private String color;

    public Rectange() {
        this(1, 1, "");
    }

    public Rectange(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String convertColor() {
        return String.valueOf(color.charAt(0)).toUpperCase() + color.substring(1).toLowerCase();
    }


    public double findPerimeter() {
        return (width + height) * 2;
    }

    public double findArea() {
        return (width * height);
    }

    @Override
    public String toString() {
        if (width > 0 && height > 0) {
            return String.format("%d %d %s", (int) findPerimeter(), (int) findArea(), convertColor());
        }
        return "INVALID";
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectange rectange = new Rectange();
        rectange.setWidth(scanner.nextDouble());
        rectange.setHeight(scanner.nextDouble());
        rectange.setColor(scanner.next());
        System.out.println(rectange);
        scanner.close();
    }

}

