package ergasia2h;
import java.util.ArrayList;

public class Company {
	String companyName;
	int i=0;
	private static final int NumofProducts=0;
	ArrayList <Product> products= new ArrayList<Product>();
	public Company() {}
	public Company(String companyName , ArrayList products) {
		this.companyName=companyName;
		this.products=products;
	}
	public int getNumofProducts() {
		i++;
		return NumofProducts;
		
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public ArrayList<Product> getProducts() {
		return products;
	}
	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}
	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", i=" + i + ", NumofProducts=" + NumofProducts + ", products="
				+ products + "]";
	}
	
	}



}

}
