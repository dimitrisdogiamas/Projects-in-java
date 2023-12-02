package ergasia4;

import java.util.HashMap;

public class Student extends Person {
	private String studentId;
    private int enrollmentYear;
    private HashMap<String, Double> grades;

    public Student(String firstName, String lastName, int age, String address, Department department,
                   String studentId, int enrollmentYear) {
        super(firstName, lastName, age, address, department);
        this.studentId = studentId;
        this.enrollmentYear = enrollmentYear;
        this.grades = new HashMap<>();
    }

    public String getStudentId() {
        return studentId;
    }

    public int getEnrollmentYear() {
        return enrollmentYear;
    }

    public void addGrade(String course, double grade) {
        grades.put(course, grade);
    }

    public double getAverageGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }

        double sum = 0.0;
        for (double grade : grades.values()) {
            sum += grade;
        }

        return sum / grades.size();
    }

	public int getAM() {
		// TODO Auto-generated method stub
		return 0;
	}
}

