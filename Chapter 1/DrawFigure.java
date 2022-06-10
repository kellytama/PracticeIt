public class DrawFigure {
    public static final int SUB_HEIGHT = 6; 
    
    public static void main(String args[]) {
        drawLine();
        drawTop(); 
        drawBot(); 
        drawLine();
        drawBot();
        drawTop();
        drawLine();
    }
    
    // print a solid line 
    public static void drawLine() {
        System.out.print("+");
        for (int i = 1; i <= (2 * SUB_HEIGHT); i++) {
            System.out.print("-");
        }
        System.out.println("+");
    } // drawLine()
    
    // print the top half of the hourglass figure 
    public static void drawTop() {
        for (int line = 1; line <= SUB_HEIGHT; line++) {
            System.out.print("|");
            for (int i = 1; i <= (line - 1); i++) {
                System.out.print(" ");
            }
            System.out.print("\\");
            int dots = 2 * SUB_HEIGHT - 2 * line; 
            for (int i = 1; i <= dots; i++) {
                System.out.print(".");
            }
            System.out.print("/");
            for (int i = 1; i <= (line - 1); i++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    } // drawTop()
    
    // print the bottom half of the hourglass figure 
    public static void drawBot() {
        for (int line = 1; line <= SUB_HEIGHT; line++) {
            System.out.print("|");
            for (int i = 1; i <= (SUB_HEIGHT - line); i++) {
                System.out.print(" ");
            }
            System.out.print("/");
            for (int i = 1; i <= 2 * (line - 1); i++) {
                System.out.print(".");
            }
            System.out.print("\\");
            for (int i = 1; i <= (SUB_HEIGHT - line); i++) {
                System.out.print(" ");
            }       
            System.out.println("|");
        }
    } // drawBot()

}
 
