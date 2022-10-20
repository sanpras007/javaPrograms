import java.util.*;;
class matrix_value {
    int a[][] = new int[10][10];
    int b[][] = new int[10][10];
    int c[][] = new int[10][10];
    int m1,n1,m2,n2;
    matrix(int m1,int n1,int m2,int n2){
        this.m1 = n1;
        this.n1 = n1;
        this.m2 = n2;
        this.n2 = n2;
    }
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first martix");
        System.out.println("Enter the elements");
        for(int i = 0; i < m1; i++) {
            for(int j = 0; j < n1; j++) {
                System.out.print("a["+i+"]["+j+"] : ");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter second matrix");
        System.out.println("Enter the elements");
        for(int i = 0; i < m2; i++) {
            for(int j = 0; j < n2; j++) {
                System.out.print("b["+i+"]["+j+"] : ");
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("The first matrix is: ");
        display(a);
        System.out.println("The first matrix is: ");
        display(b);
    }
    void product(){
        if(n1==m2){
            for(int i = 0; i < m1; i++) {
                for(int j = 0; j < n2; j++) {
                    for(int k = 0; k < n1; k++) {
                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            System.out.println("The product of the two matrices is: ");
            display(c);
        }
        else
            System.out.println("multiplication not found");
    }
    void display(int x[][]){
        for(int i = 0; i < m1; i++) {
            for(int j = 0; j < n2; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
    }
}
public class martix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int m1 = sc.nextInt();
        int n1 = sc.nextInt();
        System.out.println("Enter the number of rows and columns");
        int m2 = sc.nextInt();
        int n2 = sc.nextInt();
        matrix_value mymatrix = new matrix_value(m1,n1,m2,n2);
        mymatrix.input();
        mymatrix.product();
    }
}
// myobj.read(b);
// myobj.multiply(a, b);
//     void read(int x[][]) {
    
    //     }
    //     void multiply(int a[][], int b[][]) {
        
        // }
        