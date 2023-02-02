class Result {
 /*
 * Complete the 'findMedian' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY arr as parameter.
 */
 public static int findMedian(List<Integer> arr) {
 Collections.sort(arr);
 int mid=(0+arr.size()-1)/2;
 return arr.get(mid);

 }
}
