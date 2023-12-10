package programToLearn;

public class FindTheLargestSumOfConsecutiveIntegersFromArray {

	public void method1(int[] NumArray) {

		int sum = 0;
		int largestSum = 0;

		for (int i = 0; i < NumArray.length - 1; i++) {

			int currentNum = NumArray[i];

			int nextNum = NumArray[i + 1];

			if (nextNum - currentNum == 1) {
				if (sum == 0) {
					sum = currentNum + nextNum;
				} else {
					sum = sum + nextNum;
				}
			} else {
				sum = 0;
			}

			if (largestSum < sum) {
				largestSum = sum;
			}
		}

		System.out.println(largestSum);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FindTheLargestSumOfConsecutiveIntegersFromArray flsocifa = new FindTheLargestSumOfConsecutiveIntegersFromArray();
		int a[] = {0, 1, 2, 9, 3,5,6,7 };

		flsocifa.method1(a);
	}

}
