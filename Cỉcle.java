public class Cỉcle {
    public double radius = 3.0;
    public String color = "red";
    public Cỉcle() {
    }

    public Cỉcle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return radius* radius*Math.PI;
    }
    @Override
    public String toString() {
        return "Cỉcle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
