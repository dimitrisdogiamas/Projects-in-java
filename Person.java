package ergasia4;

public class Person {
	 private String firstName;
	    private String lastName;
	    private int age;
	    private String address;
	    private Department department;

	    public Person(String firstName, String lastName, int age, String address, Department department) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.age = age;
	        this.address = address;
	        this.department = department;
	    }

	    public String getFirstName() {
	        return firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public int getAge() {
	        return age;
	    }

	    public String getAddress() {
	        return address;
	    }

	    public Department getDepartment() {
	        return department;
	    }
	}

