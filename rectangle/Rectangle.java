package ashraf.rectangle;

public class Rectangle {

    int length;
    int breadth;

    public Rectangle(){
        length=1;
        breadth=1;
        System.out.println("Non paramaaterized cons");

    }
    public Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;

        System.out.print("two paramaterized cons");
    }
    public Rectangle(double s){
        length=breadth=1;

        System.out.println("one parameter");
    }
}
