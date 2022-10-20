import java.util.Scanner;
class box{
    int length;
    int breadth;
    int height;
    box(int length,int breadth,int height){
        this.length=length;
        this.breadth=breadth;
        this.height=height;
        
    }
    int volume(){
        return length*breadth*height;
    }
}
class Myclass{
    int length;
    int breadth;
    int height;
    void sum(int a,int b){
        System.out.println(a+b);
    }
    void sum(){
        System.out.println("No arguments");
        int n,m;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        System.out.println(n+m);

    }
    void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }
    void input(){
       System.out.println("Length");
        length = scan.nextInt();
        System.out.println("Breadth");
        breadth = scan.nextInt();
        System.out.println("height");
        height = scan.nextInt();
    }
    public static void main(String args[]) {
        Scanner scan;
        scan = new Scanner(System.in);
        box b1 = new box(2,3,4);
        Myclass obj1;
        obj1.sum();
        obj1.sum(1,2);
        obj1.sum(1,2,3);
        // System.out.println("Hello World");
        // System.out.println("Enter your name");
        // String name;
        // name = scan.nextLine();
        // int age;
        // System.out.println("Enter your age");
        // age = scan.nextInt();
       
       
       
        // System.out.println("Length");
        // b1.length = scan.nextInt();
        // System.out.println("Breadth");
        // b1.breadth = scan.nextInt();
        // System.out.println("height");
        // b1.height = scan.nextInt();
        System.out.println(b1.volume());
        obj1.input();
        
        // System.out.println("Hello " + name + " you are " + age + " years old");
        scan.close();
    }
}
class Myclass2{
    public static void main(String args[]){
        System.out.println("Hello World from class 2");
    }
}