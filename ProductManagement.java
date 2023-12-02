package ergasia2h;
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
public class ProductManagement {
	
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	while (true) {
		//diavazoume to onoma tis etaireias apo to xrhsth
		System.out.println("dose onoma etairias(exit gia exodo):");
		String companyName = scanner.nextLine();
		if (companyName.equals("exit")) {
			break;
		}
	}
	// dhmiourgoume mia nea etaireia
	Company company = new Company(companyName);
	
	while (true) {
		System.out.print("doste onoma proiontos(exit gia exodo): ");
		String productName=scanner.nextLine();
		if (productName.equals("exit")) {
			break;
		}
	}
		
	}
 public static boolean search(ArrayList <Product> products, String name) {
	 System.out.println("ektypose to proion yparxei");
	 System.out.println(products);
	return false;
 }

}
