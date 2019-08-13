import java.io.PrintStream;


public class MainC {
    public static void main(String[] args) {
        print(System.out);
    }

    public static void print(PrintStream out) {
        out.println("Hello, World!");
    }
    public int getNcubed(int N){ return N*N*N;}
}
