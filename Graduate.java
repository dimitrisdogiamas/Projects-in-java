package ergasia4;

public class Graduate  extends Student {
	private String degreeTitle;
    private double degreeGrade;
    private String supervisor;
    private String thesisTitle;

    public Graduate(String firstName, String lastName, int age, String address, Department department,
                    String studentId, int enrollmentYear, String degreeTitle, double degreeGrade,
                    String supervisor, String thesisTitle) {
        super(firstName, lastName, age, address, department, studentId, enrollmentYear);
        this.degreeTitle = degreeTitle;
        this.degreeGrade = degreeGrade;
        this.supervisor = supervisor;
        this.thesisTitle = thesisTitle;
    }

    public String getDegreeTitle() {
        return degreeTitle;
    }

    public double getDegreeGrade() {
        return degreeGrade;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public String getThesisTitle() {
        return thesisTitle;
    }
}


