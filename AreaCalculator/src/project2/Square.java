package project2;

public class Square implements IShape{
    private int length;

    public int getLength() {
        return length;
    }

    public Square(int length) {
        this.length = length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    public void printArea(){
        System.out.println(length*length);
    }
}
