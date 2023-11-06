import java.util.*;
import java.io.*;

public class prob01 {
    static Scanner in;

    public static void main(String[] args) throws IOException {
        
        in = new Scanner(System.in);
        solve();        
    }
    
    static void solve() {
        String name = in.nextLine();
        System.out.println(name + ", the needs of the many outweigh the needs of the few, or the one; live long and prosper.");
    }
}