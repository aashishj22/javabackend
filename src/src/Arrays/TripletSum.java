package Arrays;
 import java.util.Scanner;
   public class TripletSum {
	static int tripletsum(int[] arr, int target) {
		int ans = 0;
		int n = arr.length;
		
		for(int i=0; i<n; i++) { //first number
			for(int j=i+1; j<n; j++) { //second number
				for(int k=j+1; k<n; k++) { //third number
					if(arr[i] + arr[j] + arr[k] == target) {
						ans++;
					}
				}
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter" + n + "elemnets: ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();	
		}
		System.out.println("Enter target sum: ");
		int target = sc.nextInt();
		
		System.out.println(tripletsum(arr, target));
	    }
   }

