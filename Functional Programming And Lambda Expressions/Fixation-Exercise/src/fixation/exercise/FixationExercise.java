package fixation.exercise;

import entities.Employee;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FixationExercise {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        try ( BufferedReader br = new BufferedReader(new FileReader(path))) {

            List <Employee> list = new ArrayList<>();
            
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }
            
            Comparator <String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
            
            
            List <String> names = list.stream()
                    .filter(e -> e.getSalary() > salary)
                    .map(e -> e.getEmail())
                    .sorted(comp)
                    .collect(Collectors.toList());
            
            System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary));
            names.forEach(System.out :: println);
            
            
            Double letter = list.stream()
                    .filter(x -> x.getName().charAt(0) == 'M')
                    .map(x -> x.getSalary())
                    .reduce(0.0, (x, y) -> x + y);
 
            
            System.out.println("Sum of salary from people whose name starts with 'M': " + String.format("%.2f", letter));
                    
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }

}
