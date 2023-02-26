import java.lang.*;
public class Main {
    public static void main(String[] args) {

        if(Integer.parseInt(args[0])<0 || Integer.parseInt(args[0])!=Math.floor(Integer.parseInt(args[0]))){
            System.exit(-1);
        }
        if(Integer.parseInt(args[0])<30000) {
            int l = Integer.parseInt(args[0]);

            String[] v = new String[10000];
            String[][] m = new String[10000][10000];
            for (int k = 1; k <= l; k++) {

                v[k] = new StringBuffer().append(k).toString();

            }
            String h = "";
            for (int i = 1; i <= l; i++) {

                for (int j = 1; j <= l; j++) {
                    m[i][j] = v[j];

                }
                h = v[l];
                for (int p = l; p > 1; p--) {

                    v[p] = v[p - 1];
                }
                v[1] = h;
            }

            for (int i = 1; i <= l; i++) {


                for (int j = 1; j <= l; j++) {
                    System.out.print(m[i][j] + " ");

                }
                System.out.print("\n");
            }

            String[] row = new String[10000];
            String[] col = new String[10000];

            System.out.println("Linii:");
            for (int i = 1; i <= l; i++) {
                for (int j = 1; j <= l; j++) {

                    if (j == 1) {

                        row[i] = m[i][j];
                    } else {
                        row[i] = row[i] + m[i][j];
                    }

                }
            }


            for (int i = 1; i <= l; i++) {

                System.out.println(row[i]);
            }
            System.out.println("Coloane:");
            for (int i = 1; i <= l; i++) {
                for (int j = 1; j <= l; j++) {

                    if (j == 1) {
                        col[i] = m[j][i];

                    } else {
                        col[i] = col[i] + m[j][i];
                    }

                }
            }
            for (int i = 1; i <= l; i++) {
                System.out.println(col[i]);
            }
        }
        else{
            System.out.println("Execution time is: "+System.nanoTime());

        }

    }




}