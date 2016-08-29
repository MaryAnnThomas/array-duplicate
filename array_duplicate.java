package javaapplication5;

import java.util.Arrays;

/**
 *
 * @author sony
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a = {1,4,2,9,9,6,3,2,1,1};
        int[] b = new int[30];
        Arrays.sort(a);
        int length = a.length;
        
        for(int i=0;i<length-1;i++)
        {
            if(a[i] != a[i+1])
            {
                b[i] = a[i];
                System.out.println(b[i]);
            }
            if(i == length-2)
            {
                b[i+1] = a[length-1];
                System.out.println(b[i+1]);
            }
        }
    }
    
}
