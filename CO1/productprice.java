class Product{
String pcode;
String pname;
double price;

String lesscost(Product p1, Product p2){
	if(p1.price<p2.price)
		return p1.pname;
	if(p1.price<price)
		return p1.pname;
	if(p2.price<p1.price)
		return p2.pname;
	if(p2.price<price)
		return p2.pname;
	else
		return pname;
}
void setClass(String pc,String pn ,double p)
{
pcode=pc;
pname=pn;
price=p;
} 
}
class productprice{
public static void main(String args[])
{
Product p1=new Product();
Product p2=new Product();
Product p3=new Product();
String pnname;

p1.setClass("001", "MI laptop", 30000);
p2.setClass("002", "Redmi 9i", 9000);
p3.setClass("003", "SmartBand", 2000);

pnname=p3.(p1,p2);
System.out.println("Lowest price is" +pnname);

}
}
