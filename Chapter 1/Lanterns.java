public class Lanterns {
    public static void main(String[] args){
        drawCap();
        System.out.println();
        drawCap();
        drawLant();
        drawLong();
        drawCap();
        System.out.println();
        drawCap();
        drawShort();
        drawLant();
        drawLant();
        drawShort();
        drawShort();
    }
    public static void drawCap(){
        System.out.println("    *****");
        System.out.println("  *********");
        System.out.println("*************");
    }
    public static void drawLant(){
        
        System.out.println("* | | | | | *");
        
    }
    public static void drawLong(){
        System.out.println("*************");
    }
    public static void drawShort(){
        System.out.println("    *****");
    }
}
