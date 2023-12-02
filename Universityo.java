package ergasia4;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Universityo {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Department> departments = new ArrayList<>();

        // Δημιουργία τμημάτων
        Department medicalDepartment = new Department("Ιατρική", "Οδός Ιατρικής 1", "2101234567", 100, 20);
        Department computerScienceDepartment = new Department("Πληροφορική", "Οδός Πληροφορικής 1", "2109876543", 150, 30);

        departments.add(medicalDepartment);
        departments.add(computerScienceDepartment);

        int choice = 0;
        while (choice != 5) {
            System.out.println("Παρακαλώ επιλέξτε μια επιλογή:");
            System.out.println("1. Εμφάνιση πληροφοριών τμημάτων");
            System.out.println("2. Εμφάνιση μέσου όρου βαθμολογίας φοιτητών ανά έτος εισαγωγής");
            System.out.println("3. Εμφάνιση μέσου όρου δημοσιεύσεων καθηγητών ανά τμήμα");
            System.out.println("4. Αναζήτηση φοιτητή με Α.Μ.");
            System.out.println("5. Έξοδος");
            System.out.print("Επιλογή: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Απαλοιφή του newline χαρακτήρα από το προηγούμενο nextInt()

            switch (choice) {
                case 1:
                    // Εμφάνιση πληροφοριών τμημάτων
                    for (Department department : departments) {
                        System.out.println(department);
                    }
                    break;
                case 2:
                    // Εμφάνιση μέσου όρου βαθμολογίας φοιτητών ανά έτος εισαγωγής
                    for (Department department : departments) {
                        department.printAverageGradeByYear();
                    }
                    break;
                case 3:
                    // Εμφάνιση μέσου όρου δημοσιεύσεων καθηγητών ανά τμήμα
                    for (Department department : departments) {
                        department.printAveragePublications();
                    }
                    break;
                case 4:
                    // Αναζήτηση φοιτητή με Α.Μ.
                    System.out.print("Εισάγετε τον Α.Μ. του φοιτητή: ");
                    int studentAM = scanner.nextInt();
                    scanner.nextLine();
                    searchStudentByAM(departments, studentAM);
                    break;
                case 5:
                    // Έξοδος
                    System.out.println("Το πρόγραμμα τερματίζει...");
                    break;
                default:
                    System.out.println("Μη έγκυρη επιλογή. Παρακαλώ προσπαθήστε ξανά.");
                    break;
            }
            System.out.println();
        }
        scanner.close();
    }

    public static void searchStudentByAM(List<Department> departments, int am) {
        for (Department department : departments) {
            for (Student student : department.getAM()) {
                if (student.getAM() == am) {
                    System.out.println("Ο φοιτητής βρέθηκε:");
                    System.out.println(student);
                    return;
                }
            }
        }
        System.out.println("Ο φοιτητής με Α.Μ. " + am + " δε βρέθηκε.");
    }
}

