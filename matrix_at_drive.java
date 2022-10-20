import java.util.*;
class matrix{
	int a[][] =  new int[10][10];
	int b[][] =  new int[10][10];
	int s[][] =  new int[10][10];
	int r1,c1,r2,c2;
	void reada(){
		
		Scanner scan = new Scanner(System.in);
		System.out.print("r1 = ");
		r1= scan.nextInt();
		System.out.print("c1 = ");
		c1= scan.nextInt();
		for(int i=0;i<r1;i++){
			for(int j=0;j<c1;j++){
				System.out.print("enter element a["+i+"]["+j+"] : ");
				a[i][j] = scan.nextInt();
			}
		}
	}	
	void readb(){
	
		Scanner scan = new Scanner(System.in);
		System.out.print("r2 = ");
		r2= scan.nextInt();
		System.out.print("c2 = ");
		c2= scan.nextInt();
		for(int i=0;i<r2;i++){
			for(int j=0;j<c2;j++){
				System.out.print("enter element b["+i+"]["+j+"] : ");
				b[i][j] = scan.nextInt();
			}
		}
	}
	void displaya(){
		for(int i=0;i<r1;i++){
			for(int j=0;j<c1;j++){
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}System.out.println();System.out.println();
	}	
	void displayb(){
		for(int i=0;i<r2;i++){
			for(int j=0;j<c2;j++){
				System.out.print(b[i][j]+ " ");
			}
			System.out.println();
		}System.out.println();System.out.println();
	}
	void displays(){
		for(int i=0;i<r2;i++){
			for(int j=0;j<c2;j++){
				System.out.print(s[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println();System.out.println();
	}
	
	void mult(){
	if(c1==r2){
		for (int i=0;i<r1;i++){
			for(int j =0;j<c2;j++){
				s[i][j]=0;
				for(int k=0;k<c1;k++){
					s[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
	}
	else
	 System.out.println("multiplication not possible " );

	}
}
public class matrix_at_drive{
	public static void main(String []  args){
		matrix m = new matrix();
		m.reada();
		m.readb();
		m.displaya();
		m.displayb();
		m.mult();
		m.displays();
	}
}