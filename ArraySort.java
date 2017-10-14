public class ArraySort {

    public static void main(String[] args) {
        int[] array = {30, 2, 10, 4, 6};
        int length = array.length;

        for (int i = 0, end = length; i < length; i++, end--)
        {
        	boolean ready = true;
        	for (int k = 1; k < end; k++)
        	{
        		if (array[k] < array[k - 1])
        		{
        			int tmp = array[k];
        			array[k] = array[k - 1];
        			array[k - 1] = tmp;
        			ready = false;
        		}
        	}
        	
        	if (ready) break;
        }
        	

        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}