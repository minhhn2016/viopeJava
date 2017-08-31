import java.util.Scanner;

public class ObjectsApplicantProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Applicant[] applicantArray = new Applicant[4];
        for (int i = 0; i < applicantArray.length; i++) {
            System.out.print("Enter " + (i + 1) + ". name: ");
            String applicantName = input.nextLine();
            System.out.print("Enter points: ");
            String applicantPoints = input.nextLine();
            applicantArray[i] = new Applicant(applicantName, Integer.parseInt(applicantPoints));
        }
        System.out.print("Enter the minimum required points: ");
        String minPoints = input.nextLine();

        System.out.println("The following applicants achieved the minimum of " + minPoints + " points:");
        for (int i = 0; i < applicantArray.length; i++) {
            if (applicantArray[i].getPoints() >= Integer.parseInt(minPoints)) {
                System.out.println(applicantArray[i].getName() + ", " + applicantArray[i].getPoints() + " points");
            }
        }
    }
}
