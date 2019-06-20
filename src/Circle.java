public class Circle extends Shape{
    private double radius=1.0;
    public Circle(){}
    public Circle(double radius)
    {
        this.radius=radius;
    }
    public Circle(String color,boolean fill,double radius)
    {
        super(color,fill);
        this.radius=radius;
    }
    public double getRadius(){ return  this.radius;}
    public void setRadius(double radius){this.radius=radius;}
    public String toString()
    {
        return "Circle has "+ getRadius() +" and " +super.toString();
    }

}
