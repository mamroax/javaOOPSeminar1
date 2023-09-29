
public class Main {

    static double distance(Point2D a, Point2D b){
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }
    public static void main(String[] args) {
        Point2D pointA = new Point2D(0,2);

        System.out.println(pointA);
        Point2D pointB = new Point2D(10);
        System.out.println(pointB.toString());
//        System.out.println(distance(pointA, pointB));

        var dis = distance(pointA, pointB);
        System.out.println(dis);
    }
}