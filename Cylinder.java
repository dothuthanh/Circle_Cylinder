public class Cylinder extends Cỉcle {
    public double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public Cylinder() {

    }
    public double getTheTich(){
        return Math.PI *super.getRadius()*2*height;
    }
    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}' + super.toString();
    }

}
