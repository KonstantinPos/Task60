public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(1, 14);
        System.out.println(p1.quarter(p1));
        Point p2 = new Point(1, 3);
        Point p3 = new Point(4, 8);
        System.out.println(p1.symmetry(p2));
        System.out.println(p1.collinear(p2, p3));
        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

    }
}