package ergasia4;

public class Employee extends  Person {
	private String afm;
    private double salary;
    private String specialization;
    private int yearsOfExperience;

    public Employee(String firstName, String lastName, int age, String address, Department department,
                    String afm, double salary, String specialization, int yearsOfExperience) {
        super(firstName, lastName, age, address, department);
        this.afm = afm;
        this.salary = salary;
        this.specialization = specialization;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getAfm() {
        return afm;
    }

    public double getSalary() {
        return salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
}

