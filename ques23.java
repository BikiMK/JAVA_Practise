////        Maximum Points You Can Obtain from Cards
////                Hints
////        Company
////        Given N cards arranged in a row, each card has an associated score denoted by the cardScore array. Choose exactly k cards. In each step, a card can be chosen either from the beginning or the end of the row. The score is the sum of the scores of the chosen cards.
//// Return the maximum score that can be obtained.
////
////        Example 1
////        Input : cardScore = [1, 2, 3, 4, 5, 6] , k = 3        Output : 15
////
////        Explanation : Choosing the rightmost cards will maximize your total score. So optimal cards chosen are the rightmost three cards 4 , 5 , 6.
////
////        Th score is 4 + 5 + 6 => 15.
////
////        Example 2
////
////        Input : cardScore = [5, 4, 1, 8, 7, 1, 3 ] , k = 3
////
////        Output : 12
////
////        Explanation : In first step we will choose card from beginning with score of 5.
////
////        In second step we will choose the card from beginning again with score of 4.
////
////        In third step we will choose the card from end with score of 3.
////
////        The total score is 5 + 4 + 3 => 12
//package basics2;
//
//public class ques23 {
//    public static void main(String[] args) {
//
//    }
//
//    public int maxScore(int[] cardPoints, int k) {
//        int lSum = 0;
//        int rSum =0;
//        int sum =0;
//        for (int i =0; i<k-1; i++);
//    }
//}
