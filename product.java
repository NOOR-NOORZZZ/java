public class product
{
int pcode;
String pname;
double price;
double lowest;
void data(int c, String n, double p)
{
pcode=c;
pname=n;
price=p;
}
void display()
{
System.out.println(pcode+"\t\t"+pname+"\t\t"+price);
}
static void findLowest(double price1,double price2, double price3)
{
if(price1<=price2 && price1<=price3)
{
System.out.println("\nprodct 1 is of the lowest price!");
}
else if(price2<=price1 && price2<=price3)
{
System.out.println("\nprodct 2 is of the lowest price!");
}
else
{
System.out.println("\nprodct 3 is of the lowest price!");
}
}
public static void main(String[] args)
{
System.out.println("MOHAMMED NOORUDHEEN MT \n22MCA040\n24/03/2023\n");
product obj1 = new product();
product obj2 = new product();
product obj3 = new product();
obj1.data(101,"product_1",100.0);
obj2.data(102,"product_2",128.40);
obj3.data(103,"product_3",190.00);
System.out.println("product information:\n product_code\tproduct_name\tproduct_price");
obj1.display();
obj2.display();
obj3.display();
findLowest(obj1.price,obj2.price,obj3.price);            
}
} 
