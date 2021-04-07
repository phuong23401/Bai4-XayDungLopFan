public class Main {
    public static void main(String[] args) {
        Fan fan1 =  new Fan();
        fan1.setSpeed(fan1.getFAST());
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        Fan fan2 = new Fan();
        fan2.setSpeed(fan1.getMEDIUM());
        fan2.setRadius(5);
        fan2.setColor("blue");
    }
}
