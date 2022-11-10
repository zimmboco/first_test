package shape;

import java.util.Objects;

public class Cylinder implements Shape {
    private final Double length;
    private final Double radius;

    public Cylinder(Double length, Double radius) {
        this.length = length;
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 2 * Math.PI * radius * length;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "length=" + length +
                ", radius=" + radius +
                ", area=" + calculateArea() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Cylinder cylinder = (Cylinder) o;
        return Objects.equals(length, cylinder.length) &&
                Objects.equals(radius, cylinder.radius);
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, radius);
    }
}
