public class StarFigures{
    
    public static void main(String[] args){
        drawRect();
        drawX();
        System.out.println();
        drawRect();
        drawX();
        drawRect();
        System.out.println();
        drawLine();
        drawRect();
        drawX();
    }
    public static void drawRect(){
        System.out.println("*****");
        System.out.println("*****");

    }
    public static void drawLine(){
        System.out.println("  *  ");
        System.out.println("  *  ");
        System.out.println("  *  ");

    }
    public static void drawX(){
        System.out.println(" * * ");
        System.out.println("  *  ");
        System.out.println(" * * ");

    }

}
