import java.util.Scanner;

/**
 * ArrayCopying
 * Program to copy all elements of one array into another array.
 * ARRAY 1  
 * 1   2  3  4  5  
 * ARRAY 2  
*  1   2  3  4  5  
*/
public class ArrayUtility {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the element in the array.");
        int l = input.nextInt();
        int[] arr = inputArray(l, input);
        // traverseArr(arr, l);
        // int[] cpArr = copyArray(arr, l);
        // System.out.println("your copied arr is ");
        // traverseArr(cpArr, l);
        // System.out.println("the occurence of particular number in the array ");
        // occOfNum(cpArr, l);
        // int[] rotatedArr = reverseArr(arr, l);
        // traverseArr(rotatedArr, l);
        // duplicateEle(arr, l);
        int sec = print2largest(arr, l);
        System.out.println(sec);
    }

// all the funtionality of the array.


//  function to input the array or make the array 
    public static int[] inputArray(int l, Scanner input){
        int[] arr = new int[l];
        for(int i = 0; i < l; i++){
            System.out.printf("Enter the element number %d : ", i); 
            arr[i] = input.nextInt();
        }
        return arr;
    }


// function to  travere the array
    public static void traverseArr(int[] arr, int l){
        for(int i = 0 ; i < l ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }



// function to copy the array
    public static int[] copyArray(int[] arr, int l){
        int[] copyArr = new int[l];
        for (int i = 0 ; i < l ; i++){
            copyArr[i] = arr[i];
        }
        return copyArr;
    }


// function to find the number of occurence in the array of particular element in the arrray 
    public static void occOfNum(int[] arr, int l){
        int[] fr = new int[l];
        int visited = -1;
        for(int i = 0 ; i < l; i++){
            int count = 1 ;
            for( int j = i+1 ; j < l ; j++){
                if (arr[i] == arr[j]){
                    count++;
                    fr[j] = visited;
                }
            }
            if(fr[i] != visited){
                fr[i] = count;
            }
        }

        for(int i = 0 ; i < l ; i++){
            if (fr[i] != visited){
                System.out.println(arr[i] + " times " + fr[i]);
            }
        }
    }

// Program to reverse an array
    public static int[] reverseArr(int[] arr, int l){
        int[] rotLArr = new int[l];
        int count = l-1 ;
        for(int i = 0 ; i < l/2 ; i++){
            rotLArr[i] = arr[count];
            rotLArr[count] = arr[i];
            count = i == 0 ? count - 1 : count - i ;
        }
        return rotLArr; 
    }

// program to print the if the element is more the one time in the array then return the array of the duplicate element
    public static void duplicateEle(int[] arr,int l){
        int[] fr = new int[l];
        int visited = -1;
        for(int i = 0 ; i < l; i++){
            int count = 1 ;
            for( int j = i+1 ; j < l ; j++){
                if (arr[i] == arr[j]){
                    count++;
                    fr[j] = visited;
                }
            }
            if(fr[i] != visited){
                fr[i] = count;
            }
        }

        for(int i = 0 ; i < l ; i++){
            if (fr[i] != visited && fr[i] > 1){
                System.out.println(arr[i]);
            }
        }


    }
    // program to find the second largest number in the array (brute force solution)
    public static int print2largest(int arr[], int n) {
        int secLargest = -1 ;
        for(int pass = n - 1 ; pass > 0 ; pass--){
            for(int i = 0; i < pass  ; i++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        for(int i = n-2 ; i >= 0 ; i--){
            if(arr[i] != arr[n-1]){
                secLargest = arr[i];
                break;
            }
        }
        return secLargest;
    }
}