public class main1
{
	// Returns number of times x occurs in arr[0..n-1]
	static int Occurrences(int arr[], int n, int x)
	{
		int res = 0;
		for (int i=0; i<n; i++)
			if (x == arr[i])
				res++;
		return res;

	}


	public static void main(String args[])
	{
		int arr[] = {2, 2, 3, 3, 4, 4, 4, 8, 8, 8, 8, 8, 9, 9, 10, 12, 15};
		int n = arr.length;
		int x = 4;
		System.out.println(Occurrences(arr, n, x));
		System.out.println(Occurrences(arr, n, 3));
		System.out.println(Occurrences(arr, n, 8));

	}
}