class Pen {
    String color;
    String type;
    
    public void print() {
        System.out.println(color + " " + type);
    }
}

public class Pro {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color = "BLACK";
        p1.type = "Board Marker";
        Pen p2 = new Pen();
        p2.color = "Blue";
        p2.type = "Ball pen";
        
        p1.print();
        p2.print();
    }