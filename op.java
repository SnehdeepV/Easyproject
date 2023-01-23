
class circle {
    public double radius;

    public double area() {
        return Math.PI * radius * radius;

    }
}

class cylinder extends circle {
    public double height;

    public double volume() {
        return area() * height;
    }
}

public class op {
    public static void main(String[] args) {
        cylinder c = new cylinder();
        c.radius = 7.0;
        c.height = 10.0;
        System.out.println(c.volume());
    }
}
