package ergasia2h;
import java.util.Scanner;
public class Product {
	private double price=0;
	private String name;
	private String code;
	

public Product() {}
public Product(double price,String name,String code) {
	super();
	this.name=name;
	this.code=code;
    this.price=price;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
@Override
public String toString() {
	return "Product [price=" + price + ", name=" + name + ", code=" + code + "]";
}
public void readProduct() {
	Scanner input= new Scanner(System.in);
}
public boolean compare(Product p) {
	return this.price> p.price;
	}

}





