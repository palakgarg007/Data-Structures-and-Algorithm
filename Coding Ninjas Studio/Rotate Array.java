import java.util.* ;

class Solution {
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++)
			arr[i] = s.nextInt();
		
		int k = s.nextInt();
		k = k%n;

		int i=0, j=k-1;
		while(i<j){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}

		i = k;
		j = n-1;
		while(i<j){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}

		i=0;
		j=n-1;
		while(i<j){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}

		for(i=0; i<n; i++)
			System.out.print(arr[i]+" ");
	}
}
