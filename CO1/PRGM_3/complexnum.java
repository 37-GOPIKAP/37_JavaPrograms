class complex{
int real;
int img;
void addition(complex num1)
{
System.out.println("Addition of complex numbers is  "+(real+num1.real)+ "+" + (img+num1.img)+ "i");
}
void SetDim(int r,int i)
{
real=r;
img=i;
}
}
class complexnum
{
public static void main(String args[])
{
complex num1=new complex();
complex num2=new complex();
num1.SetDim(4,9);
num2.SetDim (5,2) ;
num2.addition(num1);
}
}
