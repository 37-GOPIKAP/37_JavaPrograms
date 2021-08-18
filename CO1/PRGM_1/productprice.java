class Product{
String pcode;
String pname;
double price;
Product(String pc, String pn, double p)
{
this.pcode=pc;
this.pname=pn;
this.price=p;
}
String lowcost(Product p1, Product p2){
if(p1.price<p2.price && p1.price<price)
return p1.pname;
if(p2.price<p1.price && p2.price<price)
return p2.pname;
else
return pname ;
}
}
class productprice{
public static void main(String args[])
{
Product p1=new Product("001", "MI laptop", 30000);
Product p2=new Product("002", "Redmi 9i", 9000);
Product p3=new Product("003", "SmartBand", 2000);
String pnname;


pnname=p3.lowcost(p1,p2);
System.out.println("Lowest price is  for " +pnname );

}
}
