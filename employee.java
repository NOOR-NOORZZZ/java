import java.util.Scanner;
import java.util.Scanner;
public class employee {
int eNo;
String eName;
double eSalary;
public void getdetails() {

System.out.println("_____________________________________\n");
System.out.println("Name:MOHAMMED NOORUDHEEN MT \n Reg No: 22MCA040 \n Date: 24/03/2023 \n Course Code: 20MCA132 \n");
System.out.println("_____________________________________");
	
System.out.println("\n Enter the Employee details");
Scanner sc = new Scanner(System.in);
System.out.println("Employee number : ");
eNo=sc.nextInt();
System.out.println("Name : ");
sc.nextLine();
eName=sc.nextLine();
System.out.println("Salary : ");
eSalary=sc.nextDouble(); 
}
void dispaly(){
System.out.println("Empolyee No :"+eNo);
System.out.println("Name :"+eName);
System.out.println("Salary Amount"+eSalary+"\n");
}
public static void main(String[] args) {
System.out.println("\nEnter the No. of Employee's");
Scanner sc1 = new Scanner(System.in);
int num = sc1.nextInt();
employee arr[]=new employee[num];
for(int i =0;i<num;i++){
arr[i]=new employee();
arr[i].getdetails();

}
System.out.println("\nInformations of all the employee's");
for(int i=0;i<num;i++){
arr[i].display();
}
boolean state = false;
System.out.println("\nEnter the Employee Number to get details of a employee");
int num2= sc1.nextInt();
for(int i=0;i<num;i++){
if(arr[i].eNo==num2){
System.out.println("\nEmployee details");
arr[i].display();
}
}    
    }
}
