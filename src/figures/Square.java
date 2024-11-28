package figures;

public class Square {
    private int length;

    public Square(){}

    public Square(int length){this.length = length;}

    //method draw square
    public void drawSquare(){
        if(length < 1){
            System.out.println("There is no length");
        } else {
            System.out.println("=================================");
            System.out.println("Drawing Square with length: " + length + "[u]" + "\n");
            for(int i = 0; i< length; i++){
                for (int j = 0; j< length; j++){
                    System.out.print(" * ");
                }
                System.out.println();
            }
            System.out.println("=================================");
            System.out.println("Perimeter: " + length + " * 4 = " + calculatePerimeter());
            System.out.println("=================================");
            System.out.println("Area: " + length + " * " + length + " = " + calculateArea());
            System.out.println("=================================");
        }
    }

    //method obtains Perimeter
    public int calculatePerimeter(){
        return length *4;
    }

    //method obtains Area
    public int calculateArea(){
        return length * length;
    }

    //getter and setter
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
