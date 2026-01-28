import java.util.*;
class Wipro6 {
	public static void main(String args[]){
		Scanner obj =  new Scanner(System.in);
		System.out.println("enter the size");
		int size = obj.nextInt();
		
		int arr[] = new int[size];
		for(int i =0; i < size; i++){
			System.out.println("enter the values of array");
			arr[i] = obj.nextInt();
		}
		for(int i = 0; i < arr.length - 1;i++){
			for(int j = i + 1; j < arr.length; j++){
				if(arr[i] == arr[j]){
					System.out.println( "duplicat value is" + arr[i]);
				}
			}
		}
			
	}
}