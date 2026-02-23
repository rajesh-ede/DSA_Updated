package SlindingWindow;


/*Given N cards arranged in a row, each card has an associated score denoted by the cardScore array.
Choose exactly k cards. In each step, a card can be chosen either from the beginning or the end of the row.
The score is the sum of the scores of the chosen cards.

Input : cardScore = [1, 2, 3, 4, 5, 6] , k = 3
Output : 15
Explanation : Choosing the rightmost cards will maximize your total score.
So optimal cards chosen are the rightmost three cards 4 , 5 , 6.
The score is 4 + 5 + 6 => 15.
 */

public class MaximumPoints {
  static int Maximun(int []arr,int k){
      int maxSum = 0;
      int n = arr.length;
                                                                    //Time complexity : O(n^2)
      for (int i = 0; i <= k; i++) {
          int sum = 0;
          for (int j = 0; j < i; j++) {
              sum += arr[j];
          }

          for (int j = 0; j < (k - i); j++) {
              sum += arr[n - 1 - j];               //The loop ensures that after picking i elements from the front,
                                                  // we also pick the remaining (k - i) elements from the back,
                                                   // so that total = exactly k elements.
          }
          maxSum = Math.max(maxSum, sum);
      }
      return maxSum;
  }

    public static void main(String[] args) {
     int arr[] = {1, 2, 3, 4, 5, 6};
     int k = 3;
     int res = Maximun(arr,k);
     System.out.println(res);
    }
}
