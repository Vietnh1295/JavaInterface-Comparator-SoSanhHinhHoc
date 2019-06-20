public class Shape {
    private String color="green";
    private boolean fill=true;
    public Shape(){}
    public Shape(String color,boolean fill)
    {
        this.color=color;
        this.fill=fill;
    }
    public String getColor()
    {
        return  this.color;
    }
    public void setColor(String color)
    {
        this.color=color;
    }
    public boolean getFill()
    {
        return  this.fill;
    }
    public void setFill(boolean fill)
    {
        this.fill=fill;
    }
    public String toString()
    {
        return "Shape has "+getColor()+" and "+ getFill();
    }
}
