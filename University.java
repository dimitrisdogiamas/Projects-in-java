package ergasia4;

import java.util.Arrays;

public class University {
	 private Department medicineDepartment;
	    private Department computerScienceDepartment;

	    public University() {
	        // Δημιουργία των δύο τμημάτων
	        medicineDepartment = new Department("Ιατρική", "Διεύθυνση Ιατρικού Τμήματος", "Τηλέφωνο Γραμματείας Ιατρικού Τμήματος", 1000, 50);
	        computerScienceDepartment = new Department("Πληροφορική", "Διεύθυνση Τμήματος Πληροφορικής", "Τηλέφωνο Γραμματείας Πληροφορικής", 800, 40);

	        // Δημιουργία φοιτητών και προσθήκη βαθμών
	        Student student1 = new Student("Όνομα1", "Επώνυμο1", 20, "Διεύθυνση1", medicineDepartment, "1234567", 2021);
	        student1.addGrade("Μάθημα1", 8.5);
	        student1.addGrade("Μάθημα2", 7.0);
	        student1.addGrade("Μάθημα3", 6.5);

	        Student student2 = new Student("Όνομα2", "Επώνυμο2", 21, "Διεύθυνση2", medicineDepartment, "1234568", 2021);
	        student2.addGrade("Μάθημα1", 9.0);
	        student2.addGrade("Μάθημα2", 6.0);
	        student2.addGrade("Μάθημα3", 8.0);

	        Student student3 = new Student("Όνομα3", "Επώνυμο3", 22, "Διεύθυνση3", computerScienceDepartment, "1234569", 2022);
	        student3.addGrade("Μάθημα1", 7.5);
	        student3.addGrade("Μάθημα2", 6.5);
	        student3.addGrade("Μάθημα3", 8.5);

	        Student student4 = new Student("Όνομα4", "Επώνυμο4", 23, "Διεύθυνση4", computerScienceDepartment, "1234570", 2022);
	        student4.addGrade("Μάθημα1", 8.0);
	        student4.addGrade("Μάθημα2", 7.0);
	        student4.addGrade("Μάθημα3", 9.0);

	        // Δημιουργία καθηγητών
	        Professor professor1 = new Professor("ΌνομαΚαθηγητή1", "ΕπώνυμοΚαθηγητή1", 40, "ΔιεύθυνσηΚαθηγητή1",
	                medicineDepartment, "123456", 5000.0, "Ειδικότητα1", 10,
	                "Βαθμίδα1", 5, 20, 10,
	                new String[]{"Μάθημα1", "Μάθημα2"});

	        Professor professor2 = new Professor("ΌνομαΚαθηγητή2", "ΕπώνυμοΚαθηγητή2", 45, "ΔιεύθυνσηΚαθηγητή2",
	                computerScienceDepartment, "123457", 5500.0, "Ειδικότητα2", 15,
	                "Βαθμίδα2", 6, 30, 12,
	                new String[]{"Μάθημα3", "Μάθημα4"});

	        // Εκτύπωση πληροφοριών φοιτητών
	        System.out.println("Πληροφορίες φοιτητών:");
	        System.out.println("Φοιτητής 1:");
	        System.out.println("Όνομα: " + student1.getFirstName());
	        System.out.println("Επώνυμο: " + student1.getLastName());
	        System.out.println("Ηλικία: " + student1.getAge());
	        System.out.println("Διεύθυνση: " + student1.getAddress());
	        System.out.println("Τμήμα: " + student1.getDepartment().getName());
	        System.out.println("Αριθμός φοιτητού: " + student1.getStudentId());
	        System.out.println("Έτος εγγραφής: " + student1.getEnrollmentYear());
	        System.out.println("Μέσος όρος βαθμολογίας: " + student1.getAverageGrade());

	        System.out.println("Φοιτητής 2:");
	        System.out.println("Όνομα: " + student2.getFirstName());
	        System.out.println("Επώνυμο: " + student2.getLastName());
	        System.out.println("Ηλικία: " + student2.getAge());
	        System.out.println("Διεύθυνση: " + student2.getAddress());
	        System.out.println("Τμήμα: " + student2.getDepartment().getName());
	        System.out.println("Αριθμός φοιτητού: " + student2.getStudentId());
	        System.out.println("Έτος εγγραφής: " + student2.getEnrollmentYear());
	        System.out.println("Μέσος όρος βαθμολογίας: " + student2.getAverageGrade());

	        System.out.println("Φοιτητής 3:");
	        System.out.println("Όνομα: " + student3.getFirstName());
	        System.out.println("Επώνυμο: " + student3.getLastName());
	        System.out.println("Ηλικία: " + student3.getAge());
	        System.out.println("Διεύθυνση: " + student3.getAddress());
	        System.out.println("Τμήμα: " + student3.getDepartment().getName());
	        System.out.println("Αριθμός φοιτητού: " + student3.getStudentId());
	        System.out.println("Έτος εγγραφής: " + student3.getEnrollmentYear());
	        System.out.println("Μέσος όρος βαθμολογίας: " + student3.getAverageGrade());

	        System.out.println("Φοιτητής 4:");
	        System.out.println("Όνομα: " + student4.getFirstName());
	        System.out.println("Επώνυμο: " + student4.getLastName());
	        System.out.println("Ηλικία: " + student4.getAge());
	        System.out.println("Διεύθυνση: " + student4.getAddress());
	        System.out.println("Τμήμα: " + student4.getDepartment().getName());
	        System.out.println("Αριθμός φοιτητού: " + student4.getStudentId());
	        System.out.println("Έτος εγγραφής: " + student4.getEnrollmentYear());
	        System.out.println("Μέσος όρος βαθμολογίας: " + student4.getAverageGrade());

	        // Εκτύπωση πληροφοριών καθηγητών
	        System.out.println("\nΠληροφορίες καθηγητών:");
	        System.out.println("Καθηγητής 1:");
	        System.out.println("Όνομα: " + professor1.getFirstName());
	        System.out.println("Επώνυμο: " + professor1.getLastName());
	        System.out.println("Ηλικία: " + professor1.getAge());
	        System.out.println("Διεύθυνση: " + professor1.getAddress());
	        System.out.println("Τμήμα: " + professor1.getDepartment().getName());
	        System.out.println("ΑΦΜ: " + professor1.getAfm());
	        System.out.println("Μισθός: " + professor1.getSalary());
	        System.out.println("Ειδικότητα: " + professor1.getSpecialization());
	        System.out.println("Έτη εμπειρίας: " + professor1.getYearsOfExperience());
	        System.out.println("Ακαδημαϊκή βαθμίδα: " + professor1.getAcademicRank());
	        System.out.println("Έτη διδακτορικού: " + professor1.getYearsOfDoctoralDegree());
	        System.out.println("Αριθμός δημοσιεύσεων: " + professor1.getNumPublications());
	        System.out.println("Αριθμός επιβλεπόμενων αποφοίτων: " + professor1.getNumSupervisedGraduates());
	        System.out.println("Διδασκόμενα μαθήματα: " + Arrays.toString(professor1.getTaughtCourses()));

	        System.out.println("Καθηγητής 2:");
	        System.out.println("Όνομα: " + professor2.getFirstName());
	        System.out.println("Επώνυμο: " + professor2.getLastName());
	        System.out.println("Ηλικία: " + professor2.getAge());
	        System.out.println("Διεύθυνση: " + professor2.getAddress());
	        System.out.println("Τμήμα: " + professor2.getDepartment().getName());
	        System.out.println("ΑΦΜ: " + professor2.getAfm());
	        System.out.println("Μισθός: " + professor2.getSalary());
	        System.out.println("Ειδικότητα: " + professor2.getSpecialization());
	        System.out.println("Έτη εμπειρίας: " + professor2.getYearsOfExperience());
	        System.out.println("Ακαδημαϊκή βαθμίδα: " + professor2.getAcademicRank());
	        System.out.println("Έτη διδακτορικού: " + professor2.getYearsOfDoctoralDegree());
	        System.out.println("Αριθμός δημοσιεύσεων: " + professor2.getNumPublications());
	        System.out.println("Αριθμός επιβλεπόμενων αποφοίτων: " + professor2.getNumSupervisedGraduates());
	        System.out.println("Διδασκόμενα μαθήματα: " + Arrays.toString(professor2.getTaughtCourses()));
	    }
	}

