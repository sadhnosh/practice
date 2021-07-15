package beginners;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1,2,3,4,4,5,5,6,7,7};
		int [] temp = new int[arr.length];
        System.out.println("Bfore ->  " + Arrays.toString(arr));
		int length = arr.length;
		int j =0;
		for(int i = 0; i<length-1; i++){
			if(arr[i]!=arr[i+1]) {
				temp[j++]=arr[i];
			}
		}
		
		temp[j++]=arr[length-1];
		///  if we use same array.. then last values will be remain...
		// if we use temp array then last values after removing duplicates will be containing zeros...
		
		System.out.println("After ->  " + Arrays.toString(temp));
		
		int [] nonduplicate = new int[j];
		for (int i = 0; i < j; i++) {
			nonduplicate[i]=temp[i];
		}

		System.out.println("After ->  " + Arrays.toString(nonduplicate));
		
		System.out.println(Arrays.toString(Arrays.stream(arr).distinct().toArray()));
	}

}
