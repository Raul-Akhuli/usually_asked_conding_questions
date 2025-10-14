import java.util.Scanner;

public class ra_11_number_fibonacci{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter how many fibonacci number to generate: ");
        int N = sc.nextInt();

        int [] arr = new int[N];
        arr[0] = 0;
        arr[1] = 1;
        System.out.print(arr[0] + " ");
        System.out.print(arr[1] + " ");
        for(int i = 2; i < N; i++){
                arr[i] = arr[i-1] + arr[i-2];
                System.out.print(arr[i] + " ");

        }

        System.out.print("\nchoose the index (0 - 10): ");
        int n = sc.nextInt();

        System.out.println(arr[n]);
    }
}

/*
to print only the last element of a fibonacci series or the only series.

System.out.print("enter how many fibonacci number to generate: ");
		int N = sc.nextInt();
		int a = 0, b = 1, c = 0;

		System.out.print(a + " ");
		System.out.print(b + " ");

		for(int i = 2; i < N; i++){
			c = a+b;
			System.out.print(c + " "); // print every element without help of an array
			a = b;
			b = c;
		}
		System.out.println("\n" + c);           // for printing the last element choose by user

 */