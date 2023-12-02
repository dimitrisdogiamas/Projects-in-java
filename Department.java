package ergasia4;


public class Department {
	
	
	 private String name;
	    private String address;
	    private String secretaryPhone;
	    private int numOfStudents;
	    private int numOfEmployees;

	    public Department(String name, String address, String secretaryPhone, int numOfStudents, int numOfEmployees) {
	        this.name = name;
	        this.address = address;
	        this.secretaryPhone = secretaryPhone;
	        this.numOfStudents = numOfStudents;
	        this.numOfEmployees = numOfEmployees;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getAddress() {
	        return address;
	    }

	    public String getSecretaryPhone() {
	        return secretaryPhone;
	    }

	    public int getNumOfStudents() {
	        return numOfStudents;
	    }

	    public int getNumOfEmployees() {
	        return numOfEmployees;
	    }

		public Student[] getAM() {
			// TODO Auto-generated method stub
			return null;
		}

		public void printAveragePublications() {
			// TODO Auto-generated method stub
			
		}

		public void printAverageGradeByYear() {
			// TODO Auto-generated method stub
			
		}

		public Student[] getAM1() {
			// TODO Auto-generated method stub
			return null;
		}

	
	}

