class Circle
{
  double radius;
  Circle(double r){
      this.radius=r;
  }
  double area(){
      double area=Math.PI*radius*radius;
      return Math.round(area * 100.0) /100.0;
  }
  double circumference() {
      double circumference = 2 * Math.PI * radius;
      return Math.round(circumference * 100.0) / 100.0;
  }
  double getRadius(){
      return Math.round(radius * 10.0) /10.0;
  }
  @Override
  public String toString(){
      return "Circle{radius="+Math.round(radius*10.0)/10.0+"}";
  }
}