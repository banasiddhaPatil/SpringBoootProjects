package project2;

public class Rectangle implements IShape {
    private int length;
    private int breath;

    public int getLength() {
        return length;
    }

    public int getBreath() {
        return breath;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setBreath(int breath) {
        this.breath = breath;
    }

    public Rectangle(int length, int breath) {
        this.length = length;
        this.breath = breath;
    }

    public void printArea(){
        System.out.println(length*breath);
    }
}
