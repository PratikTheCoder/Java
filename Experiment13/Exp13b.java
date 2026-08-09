package Experiment13;
import java.io.*;

public class Exp13b {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("patient.txt");

            fw.write("Patient ID: 101\n");
            fw.write("Name: Rahul\n");
            fw.write("Age: 25\n");
            fw.write("Diagnosis: Fever");

            fw.close();

            FileReader fr = new FileReader("patient.txt");
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