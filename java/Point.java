class Point{
    public double x;
    public double y;
    Point(double i,double j){
        x=i;
        y=j;
    }
    public double getLength(Point p1,Point p2)
    {
        Math.sqrt((p1.x-p2.x)*(p1.x-p2.x)-(p1.y-p2.y)*(p1.y-p2.y));

    }
     public double getArea (double a,double b,double c){
        double s=(a+b+c)/2;
        double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
     }

     class wednesday{
        public static void main(String[] args){
           Point p1,p2,p3;
            p1=new Point(4,4);
            p2=new Point(5,8);
            p3=new Point(5,6.5);
            double a=Point.getLength(p1,p2);
            double b=Point.getLength(p2,p3);
            double c=Point.getArea(p3,p1);

            double area=Point.getArea(a,b,c);
            System.out.printf("% .3f",area);
}
}
}
    

