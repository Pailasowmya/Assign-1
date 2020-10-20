package ass1;
import java.util.Scanner;
public class Grade {

	public static void main(String[] args) {
				int i = 1, grade;
				double sum = 0;
				Scanner obj = new Scanner(System.in);
				System.out.print("Enter the number of students: ");
				int num = obj.nextInt();
				while (i <= num) {
					System.out.print("Enter grade for student " + i + ":");
					grade = obj.nextInt();
					if (grade > 0 && grade < 100) {
						sum += grade;
						i++;
					} else
						System.out.println("Invalid grade,try again...");
				}
				System.out.println("The average is: " + sum / num);
				obj.close();
			}
		}

	


