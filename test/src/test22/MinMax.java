package test22;

public class MinMax {

	public static void main(String[] args) {
		/*
		 * int a = 2; int b = 10; int c = 4; int d = 20; int min = a, max = a;
		 * 
		 * if(min>b) { min = b; } if(min>c) { min = c; } if(min>d) { min = d; }
		 * if(max<b) { max = b; } if(min<c) { max = c; } if(min<d) { max = d; }
		 * System.out.println("최대값 : "+max+", 최소값 : "+min);
		 */

		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 2;
		arr[2] = 8;
		arr[3] = 30;
		arr[4] = 20;
		int min = 0;
		int max = 0;

		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				max = arr[0];
				min = arr[0];
			} else {
				if (min > arr[i]) {
					min = arr[i];
				}
				if (max < arr[i]) {
					max = arr[i];
				}
			}
		}
		System.out.println("최대값 : " + max + ", 최소값 : " + min);
	}
}
