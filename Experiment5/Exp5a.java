package Experiment5;
import java.util.ArrayList;

class Exp5a {

    public static void main(String[] args) {

        ArrayList<String> tasks = new ArrayList<>();

        tasks.add("Complete Java Assignment");
        tasks.add("Study for Exam");
        tasks.add("Submit Lab Report");

        StringBuffer list = new StringBuffer();

        list.append("To-Do List\n");

        for (String task : tasks) {
            list.append("- ").append(task).append("\n");
        }

        System.out.println(list);
    }
}
