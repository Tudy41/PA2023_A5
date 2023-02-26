public class Main {
    public static void main(String[] args) {

        if(Integer.parseInt(args[0])<3){
            System.exit(-1);
        }
        if(Integer.parseInt(args[1])-1<Integer.parseInt(args[2])){
            System.exit(-1);
        }
        int l=Integer.parseInt(args[0]);
        int m[][]=new int[50][50];
        for(int i=1;i<=l+1;i++){
            m[i][l+1]=-1;
            m[l+1][i]=-1;
        }
        for(int i=1;i<l;i++){

            m[i][i+1]=1;
            m[i+1][i]=1;
        }
        m[l][1]=1;
        m[1][l]=1;
        System.out.println("Matricea de adiacenta:");
        for(int i=1;i<=l;i++){
            for(int j=1;j<=l;j++){

                System.out.print(m[i][j]+" ");

            }
        System.out.print("\n");

        }
        System.out.print("\n");
int suma=0; int m2[][]=new int[50][50];int m3[][]=new int[50][50];
int d=l-1;int p=2;

for(int i=1;i<=l;i++){
    for(int j=1;j<=l;j++){

        m2[i][j]=m[i][j];

    }



}
while(d>0) {
    System.out.println("La puterea "+p+":" );
    for (int i = 1; i <= l; i++) {

        for (int j = 1; j <= l; j++) {
            suma = 0;
            for (int b = 1; b <= l; b++) {

                suma = suma + m2[i][b] * m[b][j];

            }
            m3[i][j] = suma;


        }


    }
    for(int i=1;i<=l;i++){
        for(int j=1;j<=l;j++){

            m2[i][j]=m3[i][j];

        }



    }
    for (int i = 1; i <= l; i++) {

        for (int j = 1; j <= l; j++) {

            System.out.print(m2[i][j]+" ");

        }
        System.out.print("\n");

    }
d--;
    p++;
}
        System.out.print("\n");
        System.out.println("Matricea de adiacenta a grafului regulat:");
int n=Integer.parseInt(args[1]);
int g=Integer.parseInt(args[2]);Boolean ok=true;
int m4[][]=new int [50][50];int v[]=new int [51];int ocupat[]=new int[50];int lung=0;
for(int i=1;i<=40;i++){
    for(int j=1;j<=40;j++){
        m4[i][j]=0;
    }
}
for(int i=1;i<=40;i++){
    v[i]=0;
}


        for(int i=1;i<=n;i++){

            for(int j=1;j<=n;j++){

                if(m4[i][j]==0 && i!=j ) {

                    ok=true;
                    for(int h=1;h<l;h++){
                        if(ocupat[h]==j){
                            ok=false;

                        }

                    }
                    if(ok==true) {
                        m4[i][j] = 1;
                        m4[j][i] = 1;
                        v[j]++;
                        v[i]++;
                    }



                }
                if(v[i]==g){
                    ocupat[l]=i;
                    l++;
                    break;
                }
            }


        }



    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){

            System.out.print(m4[i][j]);
        }

        System.out.print("\n");
    }

    }
}