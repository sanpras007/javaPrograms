import java.net.SocketTimeoutException;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

import javax.print.event.PrintEvent;
import javax.xml.stream.XMLOutputFactory;

class Employee {
    String Name,address;
    int age,phoneno;
    float salary;
    float print_salary(){
        return salary;
    }
}
class Officer extends Employee{
    String Specialization;
    Officer(String n,String a,int p,float s,int ag,String speci){
        Name =  n;
        address = a;
        phoneno = p;
        salary = s;
        age = ag;
        Specialization = speci;
    }
    void print_details(){
        System.out.println("hi..officer "+Name+" you are "+age+" years old and residing at "+address+". You are specialized at "+ Specialization+" and working here with the salary of "+print_salary()+" and anyone can contact you @ "+phoneno);
    }
}
class Manager extends Employee{
    String Dept;
    Manager(String n,String a,int p,float s,int ag,String d){
        Name =  n;
        address = a;
        phoneno = p;
        salary = s;
        age = ag;
        Dept = d;
    }
    void print_details(){
        System.out.println("hi..Manager "+Name+" you are "+age+" years old and residing at "+address+". You're working at "+ Dept+" department with salary of "+print_salary()+" and anyone can contact you @ "+phoneno);
    }
}
class App{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Name,address,Specialization,Department;
        float salary;
        int Phone,age,choice;
       do{
        System.out.println("1.Officer\n2.Manager\nChoice : ");
        choice = scan.nextInt();
        switch (choice) {
            case 1: System.out.print("Enter Your name : ");
                    Name =  scan.next();
                    System.out.print("Address : ");
                    address = scan.next();
                    System.out.print("specialization : ");
                    Specialization = scan.next();
                    System.out.print("phone number : ");
                    Phone = scan.nextInt();
                    System.out.print("Age : ");
                    age =  scan.nextInt();
                    System.out.print("Salary : ");
                    salary = scan.nextFloat();
                    Officer o = new Officer(Name, address, Phone, salary, age, Specialization);
                    o.print_details();
                
                    break;
        
            case 2: System.out.print("Enter Your name : ");
                    Name =  scan.next();
                    System.out.print("Address : ");
                    address = scan.next();
                    System.out.print("department : ");
                    Department = scan.next();
                    System.out.print("phone number : ");
                    Phone = scan.nextInt();
                    System.out.print("Age : ");
                    age =  scan.nextInt();
                    System.out.print("Salary : ");
                    salary = scan.nextFloat();
                    Manager m = new Manager(Name, address, Phone, salary, age, Department);
                    m.print_details();
                    break;

        
            default: System.out.println("invalid choice");
                break;
        }}while(choice !=0);
       
    }
}