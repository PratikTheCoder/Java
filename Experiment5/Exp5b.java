package Experiment5;
import java.util.ArrayList;
import java.util.Scanner;

class Exp5b {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> courses = new ArrayList<>();

        System.out.print("Enter number of courses to register: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter course " + (i + 1) + ": ");
            courses.add(sc.nextLine());
        }

        System.out.print("Enter course to remove: ");
        String removeCourse = sc.nextLine();
        courses.remove(removeCourse);

        StringBuffer sb = new StringBuffer();
        sb.append("\nRegistered Courses:\n");

        for (String course : courses) {
            sb.append("- ").append(course).append("\n");
        }

        System.out.println(sb);

        sc.close();
    }
}