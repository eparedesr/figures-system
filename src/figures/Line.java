package figures;

public class Line {
    private int length;

    public Line(){}

    public Line(int length){
        this.length=length;
    }

    //method draws line
    public void drawLine(){
        if(length <= 1){
            System.out.println("Line length ");
        } else {
            System.out.println("Drawing Line with length: " + length + "[u]" + "\n");
            for(int i = 1; i<= length; i++){
                System.out.print(" * ");
            }
            System.out.println("\n");
            System.out.println("-");
        }
    }

    public int getLength(){
        return length;
    }

    public void setLength(int length){
        this.length = length;
    }
}
