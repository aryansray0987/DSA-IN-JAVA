package practicesectionjava;
//class car{
//    String name;
//    float price;
//
//    car(String name, int price){//constructor
//        this.name=name;
//        this.price=price;
//    }
//
//}
//
// public class practice1 {
//    float discountPrice(float price){
//        float dis=price*0.1f;
//        price=price-dis;
//        return price;
//    }
//
//    public static void main(String[] args) {
//        car maruti=new car("sedan",2300000);
//        System.out.println(maruti.discountPrice(maruti.price));
//
//
//
//
//
//
//
//
//}
//}


import java.util.Arrays;
public class practice1
{
        public static void selectionSort(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
        public static void printArray(int[] arr) {
            for (int j : arr) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        public static void main(String[] args) {
            int[] arr = {64, 25, 12, 22, 11};
            System.out.println("Given Array:");
            printArray(arr);
            selectionSort(arr);
            System.out.println("\nSorted Array:");
            printArray(arr);
        }
    }















