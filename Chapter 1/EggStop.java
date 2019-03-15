public class EggStop {
    public static void main(String[] args){
           egg();
           System.out.println();
           egg();
           line();
           System.out.println();
           stop();
           line();
       }
    public static void egg(){
        System.out.println("  ______");
        System.out.println(" /      \");
        System.out.println("/        \");
        System.out.println("\        /");
        System.out.println(" \______/");
    }
    public static void stop(){
        System.out.println("  ______");
        System.out.println(" /      \");
        System.out.println("/        \");
        System.out.println("|  STOP  |");                   
        System.out.println("\        /");
        System.out.println(" \______/");
    }
    public static void line(){
        System.out.println("+--------+");
    }
}
