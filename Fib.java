package ass1;

public class Fib {
	
	
		public static void main(String[] args) {
			int a=0,b=1;
			int c=a+b,i=0;
			float sum=0;
			System.out.print("The first 20 Fibonacci numbers are: \n"+0+" "+1+" ");
			while(i<18){
			    c=a+b;
			    sum+=c;
			    System.out.print(c+" ");
			    a=b;
			    b=c;
			    i++;
			}
			System.out.println("\nThe average is "+sum/20);
		}
	}

