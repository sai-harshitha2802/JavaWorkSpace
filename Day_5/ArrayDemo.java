public class ArrayDemo {


    public static void main(String[] args) {
        int arr[] = {36, 72, 48, 92, 67};
        
        int max = arr[0];
        int min = arr[0];
        int secondMax = arr[0];
        int sum=arr[0];
        int passCount = 0;
        int failCount = 0;
        
        if (arr[0] > 50) {
            passCount++;
        } else {
            failCount++;
        }


        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            sum=sum+arr[i];
            if (arr[i] > 50) {
                passCount++;
            } else {
                failCount++;
            }
        }
        
        System.out.println("The maximum value in the array is: " + max);
        System.out.println("The minimum value in the array is: " + min);
        System.out.println("The second highest value in the array is: " + secondMax);
        System.out.println("The sum value in the array is: " + sum);
        System.out.println("The pass count (values > 50) is: " + passCount);
        System.out.println("The fail count (values <= 50) is: " + failCount);
    }
}
