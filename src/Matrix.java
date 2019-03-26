import java.util.ArrayList;
import java.util.List;

public class Matrix {
    public static void createMatrix(int n, int high, int low){
        int bufM = 0-low, bufP = 0-low;
        ArrayList<ArrayList<Integer> > A = new ArrayList<ArrayList<Integer> >(n);
        for (int i = 0; i < n; i++){
            ArrayList<Integer> a1 = new ArrayList<Integer>();
            for (int j = 0; j < n; j++) {
            a1.add((int) Math.round((Math.random() * high) - low));
            }
            A.add(a1);
        }
        int x = n-1, y = 0, isr = 0;
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A.get(i).get(j) + " ");
                if (i == j) if(bufM < A.get(i).get(j)) bufM = A.get(i).get(j);
            }
            System.out.println();
        }
        while (x>=1 && y < n){
            if(bufP < A.get(x).get(y)) bufP = A.get(x).get(y);
            if (x == y){
                isr = x;
            }
            x--;
            y++;
        }
        if (bufM > bufP && isr != 0) A.get(isr).set(isr, bufM);
        else if (bufP > bufM && isr != 0) A.get(isr).set(isr, bufP);
        else System.out.println("We don't have a center. It's no changes there.");
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
