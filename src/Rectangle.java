public class Rectangle {
    int size; //размер
    int overallLength;  //обшый размер
    int length;    //длина

    public Rectangle(int size, int overallLength, int length) {
        this.size = size;
        this.overallLength = overallLength;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle: \n " +
                "size: " + size + "\n" +
                "overallLength: " + overallLength + "\n" +
                "length: " + length;
    }
}
