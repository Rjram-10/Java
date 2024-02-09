// Binary Search on sorted 2D array
import java.util.Arrays;

public class practise2 {

	static int[] findAns(int[][] arr, int target)
	{
		int row = arr.length;
		int col = arr[0].length;
		int l = 0, h = row * col - 1;

		while (l <= h) {
			int mid = l + (h - l) / 2;

			int tC = mid % col;
			int tR = mid / col;
			int val = arr[tR][tC];
			if (val == target)
				return new int[] { tR, tC };

			if (val < target)
				l = mid + 1;
			else
				h = mid - 1;
		}

		return new int[] { -1, -1 };
	}

	public static void main(String[] args)
	{

		// Binary search in sorted matrix
		int arr[][] = { { 1, 2, 3, 4 },
						{ 5, 6, 7, 8 },
						{ 9, 10, 11, 12 } };
		int[] ans = findAns(arr, 12);
		System.out.println("Element found at index: "
						+ Arrays.toString(ans));
	}
}
