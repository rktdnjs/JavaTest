import java.io.*;
import java.util.*;

public class Main {
        public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine().trim());
        int y = Integer.parseInt(br.readLine().trim());
        if(x>0) {
        	if(y>0)
        		System.out.println("1");
        	else
        		System.out.println("4");
        }
        else {
        	if(y<0)
        		System.out.println("3");
        	else
        		System.out.println("2");
        }
    }
}