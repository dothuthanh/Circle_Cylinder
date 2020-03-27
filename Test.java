public class Test {
    public static void main(String[] args) {
     Cỉcle c = new Cỉcle();
        System.out.println(c);
        c = new Cỉcle(2,"blue");
        System.out.println(c);
        System.out.println("dien tich:" +c.getArea());


        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(3.4,"black",4.0);
        System.out.println(cylinder);
        System.out.println("the tich: " + cylinder.getTheTich());

    }
}
