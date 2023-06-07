import java.util.Scanner;
public class MatrixAdd
{
public static void main(String[] args)
{
System.out.println("MOHAMMED NOORUDHEEN MT \n22MCA040\n24/03/2023\n");
int p,q,m,n;
Scanner s=new Scanner(System.in);
System.out.print("enter number of rows in first matrix:");
p=s.nextInt();
System.out.print("enter number of columns in first matrix:");
q=s.nextInt();
System.out.print("enter number of rows in second matrix:");
m=s.nextInt();
System.out.print("enter number of columns in second matrix:");
n=s.nextInt();
if ( p==m&&q==n )
{
int a[][]=new int[p][q];
int b[][]=new int[m][n];
int c[][]=new int[m][n];
System.out.println("enter all the elements of first matrix:");
for(int i=0;i<p;i++)
for(int j=0;j<q;j++)
a[i][j]=s.nextInt();
System.out.println("enter all the elements of second matrix:");
for(int i=0;i<m;i++)
for(int j=0;j<n;j++)
b[i][j]=s.nextInt();

System.out.println("first matrix:");
for(int i=0;i<p;i++)
{
for(int j=0;j<q;j++)
System.out.print(a[i][j]+" ");
System.out.println("");
}
System.out.println("second matrix:");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
System.out.print(b[i][j]+" ");
System.out.println("");
}

for(int i=0;i<p;i++)
{
for(int j=0;j<n;j++)
{
for(int k=0;k<q;k++)
c[i][j]=a[i][j]+b[i][j];
}
}
System.out.println("matrix after addition:");
for (int i=0;i<p;i++)
{
for(int j=0;j<n;j++)
System.out.print(c[i][j]+" ");
System.out.println("");
}
}
else
{
System.out.println("Addition would not be possible");
}
}
}
