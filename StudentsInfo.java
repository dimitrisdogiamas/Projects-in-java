package askisi2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
	public class StudentsInfo{
	    private ArrayList<Courses> coursesTaken;


		public ArrayList<Courses> getCoursesTaken() {
			ArrayList<Courses> coursesTaken = null;
			return coursesTaken;
		}

		public void setCoursesTaken(ArrayList<Courses> coursesTaken) {
			this.coursesTaken = coursesTaken;
		}

		public void setId(int id) {
			this.id = id;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public void setCourses(String[] courses) {
			this.courses = courses;
		}

		public void setGrades(double[] grades) {
			this.grades = grades;
		}

		private int id;
	    private String name;
	    private String department;
	    private int age;
	    private String[] courses;
	    private double[] grades;
	   

	    public StudentsInfo(int id, String name, String department, int age, String[] courses, double[] grades) {
	        this.id = id;
	        this.name = name;
	        this.department = department;
	        this.age = age;
	        this.courses = courses;
	        this.grades = grades;
	    }

	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getDepartment() {
	        return department;
	    }

	    public int getAge() {
	        return age;
	    }

	    public String[] getCourses() {
	        return courses;
	    }

	    public double[] getGrades() {
	        return grades;
	    }

	    public double getMaxGrade(int id) {
	        double maxGrade = 0.0;
	        for (int i = 0; i < courses.length; i++) {
	            if (this.id == id && grades[i] > maxGrade) {
	                maxGrade = grades[i];
	            }
	        }
	        return maxGrade;
	    }
	    public void displayStudentInfo() {
	    	System.out.println("ο αριθμος μητρωωου:" +id);
	    	System.out.println("το ονομα του φοιτητη ειναι:" +name);
	    	System.out.println("το τμημα του φοιτητη ειναι:" +department);
	    	System.out.println("η ηλικια του φοιτητη ειναι" +age);
	    	}
	    public StudentsInfo(int id , String name ) {
	    	this.id=id;
	    	this.name=name;
	    	this.coursesTaken= new ArrayList<Courses>();
	    	
	    }
	    public void addCourse(Courses course) { 
	    	this.coursesTaken.add(course);
	    }
	    
	    //method to display all courses taken by the student, sorted by graded in descending order
	    public void displayCoursesTaken() {
	    	// sort the courses taken by the student by grade in descending order
	    	Collections.sort(coursesTaken, new Comparator<Courses>() {
	    		public int compare(course c1, course c2) { 
	    			return Double.compare(c2.getname(), c1.getname());
	    		}

				@Override
				public int compare(Courses o1, Courses o2) {
					// TODO Auto-generated method stub
					return 0;
				}
	    		});
	    	
	    	System.out.println("Courses taken by" +name + " (sorted by descending order):");
	    	for (Courses course : coursesTaken) {
	    		System.out.println(course.getname()+ "-grade: " + course.getname());
	    	}
	    	
	    	
	    
	    
	    	
	    }

		public StudentsInfo() {
			super();
		}

		@Override
		public String toString() {
			return "StudentsInfo [coursesTaken=" + coursesTaken + ", id=" + id + ", name=" + name + ", department="
					+ department + ", age=" + age + ", courses=" + Arrays.toString(courses) + ", grades="
					+ Arrays.toString(grades) + "]";
		}	
	   public static void main(String args[]) {
	   }
	}
	