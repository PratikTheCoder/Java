package Experiment13;
import java.io.*;

public class Exp13a {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("employee.txt");

            fw.write("Employee ID: 101\n");
            fw.write("Name: Pratik\n");
            fw.write("Salary: 50000");

            fw.close();

            FileReader fr = new FileReader("employee.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
            fr.close();

        } catch (IOException e) {
            System.out.println("File error");
        }
    }
}