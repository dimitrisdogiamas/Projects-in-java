package ergasia4;

public class Professor extends Employee {
	 private String academicRank;
	    private int yearsOfDoctoralDegree;
	    private int numPublications;
	    private int numSupervisedGraduates;
	    private String[] taughtCourses;

	    public Professor(String firstName, String lastName, int age, String address, Department department,
	                     String afm, double salary, String specialization, int yearsOfExperience,
	                     String academicRank, int yearsOfDoctoralDegree, int numPublications,
	                     int numSupervisedGraduates, String[] taughtCourses) {
	        super(firstName, lastName, age, address, department, afm, salary, specialization, yearsOfExperience);
	        this.academicRank = academicRank;
	        this.yearsOfDoctoralDegree = yearsOfDoctoralDegree;
	        this.numPublications = numPublications;
	        this.numSupervisedGraduates = numSupervisedGraduates;
	        this.taughtCourses = taughtCourses;
	    }

	    public String getAcademicRank() {
	        return academicRank;
	    }

	    public int getYearsOfDoctoralDegree() {
	        return yearsOfDoctoralDegree;
	    }

	    public int getNumPublications() {
	        return numPublications;
	    }

	    public int getNumSupervisedGraduates() {
	        return numSupervisedGraduates;
	    }

	    public String[] getTaughtCourses() {
	        return taughtCourses;
	    }
	}

