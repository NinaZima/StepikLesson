/**
 * Java 1. Home work 2. Webinar
 * @autor Ilyukhina Natalia
 * @version 20.09.21
 */
import java.util.Arrays;
class HomeWork1 {
    public static void main(String[]args){
		//int[] arr = new int[5]; 
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9}; //array -массив
		//for (int i = 0, j = 10; i < arr.length; i++, j +=10) {  // arr.length - длинна массива
		for (int a : arr) {    //foreach - для каждого
		    // System.out.println(i + " = " + arr [i] + ", " +j);	
			System.out.println(a);
		}
		System.out.println(Arrays.toString(arr));
		//arr[0] = 12;
		//System.out.println(arr[0] + ", " + arr[1]);
	}
}