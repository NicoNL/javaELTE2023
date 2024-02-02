public class PointMain {
    public static void main(String []args) {
        Point point1 = new Point(1,1);
        Point point2 = new Point(2,2);
        point1.move(1, 1);
        System.out.println("The x is: " + point1.x + ", and the y is " + point1.y);

        point1.mirror(2,0);
        System.out.println("The x is: " + point1.x + ", and the y is " + point1.y);
        System.out.println("The distance is: "  + point2.distance(point1));
    }
}