import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Q1
// String [] words={ "cat", "dog", "red", "is", "am" };
//longest(words);


//        Q2
////        int[] array = {1, 1, 1, 3, 3, 5};
////        occ(array);

//        q3
//        Scanner scanner = new Scanner(System.in);
//        Integer arr[] = new Integer[]{1, 4, 17, 7, 25, 3, 100};
//
//        System.out.println("Original Array: ");
//        System.out.println(Arrays.toString(arr));
//
//        System.out.print("Enter the value of k: ");
//        int k = scanner.nextInt();
//
//        System.out.println(k + " largest elements of the said array are:");
//
//        Arrays.sort(arr, Collections.reverseOrder());
//
//        for (int i = 0; i < k; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        Q4
////        int[] num = {5, 4, 3, 2, 1};
////        rev(num);
//Q5
//                Scanner scanner = new Scanner(System.in);
//
//                int[] arr = null;
//                int size = 0;
//                boolean continueMenu = true;
//
//                while (continueMenu) {
//                    System.out.println("\nMenu:");
//                    System.out.println("1. Accept elements of an array");
//                    System.out.println("2. Display elements of an array");
//                    System.out.println("3. Search for an element within the array");
//                    System.out.println("4. Sort the array");
//                    System.out.println("5. Stop");
//                    System.out.print("Enter your choice: ");
//
//                    int choice = scanner.nextInt();
//
//                    switch (choice) {
//                        case 1:
//                            System.out.print("Enter the size of the array: ");
//                            size = scanner.nextInt();
//                            arr = new int[size];
//
//                            System.out.println("Enter elements of the array:");
//                            for (int i = 0; i < size; i++) {
//                                System.out.print("Element " + (i + 1) + ": ");
//                                arr[i] = scanner.nextInt();
//                            }
//                            System.out.println("Array elements have been accepted.");
//                            break;
//
//                        case 2:
//                            if (arr != null) {
//                                System.out.println("Array elements:");
//                                for (int i = 0; i < size; i++) {
//                                    System.out.print(arr[i] + " ");
//                                }
//                                System.out.println();
//                            } else {
//                                System.out.println("Array is empty. Please enter elements first.");
//                            }
//                            break;
//
//                        case 3:
//                            if (arr != null) {
//                                System.out.print("Enter the element to search: ");
//                                int searchElement = scanner.nextInt();
//                                boolean found = false;
//
//                                for (int i = 0; i < size; i++) {
//                                    if (arr[i] == searchElement) {
//                                        System.out.println(searchElement + " found at index " + i);
//                                        found = true;
//                                        break;
//                                    }
//                                }
//
//                                if (!found) {
//                                    System.out.println(searchElement + " not found in the array.");
//                                }
//                            } else {
//                                System.out.println("Array is empty. Please enter elements first.");
//                            }
//                            break;
//
//                        case 4:
//                            if (arr != null) {
//                                Arrays.sort(arr);
//                                System.out.println(Arrays.toString(arr));
//                                System.out.println("Array has been sorted.");
//                            } else {
//                                System.out.println("Array is empty. Please enter elements first.");
//                            }
//                            break;
//
//                        case 5:
//                            continueMenu = false;
//                            System.out.println("Exiting the program. Thank you!");
//                            break;
//
//                        default:
//                            System.out.println("Invalid choice. Please enter a valid option.");
//                    }
//                }
//        Q6
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the minim value of the range: ");
//        int min = scanner.nextInt();
//
//        System.out.print("Enter the maximum value of the range: ");
//        int max = scanner.nextInt();
//
//        System.out.print("Enter the number of random numbers to generate: ");
//        int count = scanner.nextInt();
//
//        generateRand(min, max, count);
//Q8
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
//        int n = scanner.nextInt();
//
//        System.out.println("Fibonacci Sequence with " +n +" trems:");
//        for (int i = 0; i < n; i++) {
//            System.out.print(fibonacci(i) + " ");
//        }


            }
    //Q1
//public static String [] longest(String [] words){
//    String max=words[0];
//    for (int i = 0; i < words.length; i++) {
//        if(words[i].length()>max.length()){
//           max=words[i];
//        }
//    }
//    for (int i = 0; i < words.length; i++) {
//        if(words[i].length()==max.length()){
//            max=words[i];
//            System.out.println(max);
//        }
//    }
//    return words;
//}

//     //Q2
//     public static int[] occ (int[]array) {
//
//         Scanner s2 = new Scanner(System.in);
//         System.out.print("enter the number");
//         int num = s2.nextInt();
//         int count = 0;
//         for (int i = 0; i < array.length; i++) {
//
//
//             if (array[i] == num) {
//                 count++;
//             }
//         }
//         System.out.println(num + " occurs" + count + "times");
//         return array;
//     }



        //Q4
//        public static int []rev ( int[] num){
//            for (int i = num.length - 1; i >= 0; i--) {
//                System.out.print(num[i]);
//
//            }
//            return num;
//        }
//    Q6
//    public static void generateRand(int min, int max, int count) {
//        Random rand = new Random();
//        System.out.println("Random numbers within the specified range[" + min + ", " + max + "]:");
//
//        for (int i = 0; i < count; i++) {
//            int randomNum = rand.nextInt((max - min) + 1) + min;
//            System.out.print(randomNum+"-");
//        }
//    }
//    Q8
//        public static int fibonacci(int n) {
//            if (n <= 1) {
//                return n;
//            } else {
//                return fibonacci(n - 1) + fibonacci(n - 2);
//            }
//        }



    }


