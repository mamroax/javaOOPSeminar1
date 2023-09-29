/**
 * Это точка 2D
 */
public class Point2D {
    private int x, y;

    /**
     * Это конструктор ...
     * @param valueX это координата X
     * @param valueY это координата Y
     */
    public Point2D(int valueX, int valueY){
        x = valueX;
        y = valueY;
    }

//    public Point2D(){
//        x = 0;
//        y = 0;
//    }
//
//    public Point2D(int value){
//        x = value;
//        y = value;
//    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point2D(int value){
        this(value, value);
    }

    public Point2D(){
        this(0);
    }

    private String getInfo(){
        return String.format("x: %d; y: %d", x, y);
    }

    @Override
    public String toString() {
        return getInfo();
    }
}
