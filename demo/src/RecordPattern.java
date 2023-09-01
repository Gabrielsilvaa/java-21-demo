/**
 * To run: `java RecordPatternTest.java`
 */
public class RecordPattern {
    public static void main(String[] args) {
        instanceofExample();
    }
    public static void instanceofExample() {
        System.out.println("=== instanceof example ===");
        var point = new Point(10, 30);
        var coloredPoint =  new ColoredPoint(point, "blue");
        Object obj = coloredPoint;
        if (obj instanceof ColoredPoint(Point(int x, int y), String color)) {
            System.out.printf("Point [%d,%d] has color %s%n", x, y, color);
        }
    }
}
record Point(int x, int y) {}
record ColoredPoint(Point p, String color) {}