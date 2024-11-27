package figures;

public class Square {
    private int length;

    public Square(){}

    public Square(int length){this.length=length;}

    //method draw square
    public void drawSquare(){
        if(length <= 1){
            System.out.println("Line length ");
        } else {
            System.out.println("Drawing Line with length: " + length + "[u]" + "\n");
            for(int i = 0; i< length; i++){
                for (int j = 0; j< length; j++){
                    System.out.print(" * ");
                }
                System.out.println();
            }
            System.out.println("\n");
            System.out.println("----------------");
        }
    }

    //getter and setter
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
