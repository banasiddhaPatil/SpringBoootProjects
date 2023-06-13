import project2.NewAreaCalculator;
import project2.Rectangle;
import project2.Square;
public class Main {
    public static void main(String[] args) {

        Rectangle t1=new Rectangle(10,10);
        NewAreaCalculator newAreaCalculator=new NewAreaCalculator();
        newAreaCalculator.setShape(t1);
        newAreaCalculator.printAreaOfShape();

        Square t2=new Square(4);
        NewAreaCalculator newAreaCalculator1=new NewAreaCalculator();
        newAreaCalculator.setShape(t2);
        newAreaCalculator.printAreaOfShape();

    }
}