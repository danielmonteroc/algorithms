package algorithms;

public class ReverseArray {

    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 9};
        printArray(array);
        reverse(array);
        printArray(array);
    }

    public static void reverse(int[] array) {
    	int i=0;
    	int j=array.length-1;
    	//i=0, j=4,yes
    	//i=1, j=3,yes
    	//i=2, j=2,no
    	//i=3, j=1,no
    	
    	while(i<j) {
    		int aux=array[i];
    		array[i]=array[j];
    		array[j]=aux;
    		i++;
    		j--;
    	}
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
