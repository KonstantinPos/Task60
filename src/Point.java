import java.util.Objects;

class Point {


    public double x; // абсцисса точки
    public double y; // ордината точки

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public boolean equals(Object o) {
        Point point = (Point) o;

        if ((this.x == point.x) && (this.y == point.y)) {

            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {

        return Objects.hash(x, y);
    }

    String quarter(Point point) {
        if ((point.x > 0) && (point.y > 0)) {
            return "Точка лежит в I четверти";
        }
        if ((point.x < 0) && (point.y > 0)) {
            return "Точка лежит в II четверти";
        }

        if ((point.x < 0) && (point.y < 0)) {
            return "Точка лежит в III четверти";
        } else {
            return "Точка лежит в IV четверти";
        }

    }

    String symmetry(Point point2) {
        if ((Math.abs(x) == Math.abs(point2.x)) && (Math.abs(y) == Math.abs(point2.y))) {
            return "Две точки симметричны относительно начала отчет";
        } else {
            return "Точки не симметричны относительно начала отчета";
        }

    }

    String collinear(Point poi2, Point poi3) {
        if ((0.5 * ((this.x * poi2.y + poi2.x * poi3.y + poi3.x * this.y) - (poi2.x * this.y + poi3.x * poi2.y + this.x * poi3.y)) == 0)) {
            return "Точки коллинеарны";
        } else {
            return "Точки не коллинеаргы";
        }
    }

}
