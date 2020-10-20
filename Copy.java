package ass1;
import java.util.Arrays;
public class Copy {
	public static void main(String [] args)  {
			int a[] = { 1, 2, 3, 4, 5 };
			System.out.print("The original array is: ");
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println();
			int b[] = copyOf(a);
			System.out.print("The copy of original array is: ");
			for (int i = 0; i < b.length; i++) {
				System.out.print(b[i] + " ");
			}
		
}
		public static int[] copyOf(int[] array) {
			int b[] = Arrays.copyOf(array, array.length);
			return b;
		}
}


