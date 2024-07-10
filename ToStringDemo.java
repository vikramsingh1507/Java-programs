class BoxToString {
    double width;
    double height;
    double depth;

    BoxToString(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "Dimensions are " + width + " by " + depth + " by " + height + ".";
    }
}

public class ToStringDemo {
    public static void main(String[] args) {
        BoxToString b = new BoxToString(10, 12, 14);
        String s = "Box b: " + b;

        System.out.println(b);
        System.out.println(s);
    }
}
