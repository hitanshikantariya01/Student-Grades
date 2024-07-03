import java.util.ArrayList;
import java.util.Scanner;

public class studentGrades 
{
    public static double calculateAverage(ArrayList<Double> grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
    
    public static double findHighest(ArrayList<Double> grades) {
        double highest = grades.get(0);
        for (double grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }
    
    public static double findLowest(ArrayList<Double> grades) {
        double lowest = grades.get(0);
        for (double grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();
        
        System.out.println("Enter student grades. Type '-1' when you are done:");
        
        while (true) {
            System.out.print("Enter a grade: ");
            double grade = scanner.nextDouble();
            
            if (grade == -1) {
                break;
            }
            
            if (grade >= 0 && grade <= 100) {
                grades.add(grade);
            } else {
                System.out.println("Please enter a grade between 0 and 100.");
            }
        }
        
        if (grades.isEmpty()) 
        {
            System.out.println("No grades were entered.");
        } 
        else 
        {            
            System.out.println("Average grade: " +  calculateAverage(grades));
            System.out.println("Highest grade: " + findHighest(grades));
            System.out.println("Lowest grade: " + findLowest(grades));
        }        
    }
    
}
