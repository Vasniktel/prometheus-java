public class ShellSort {

    public static void main(String[] args) {
        int[] array = {30, 2, 10, 4, 6};
        int length = array.length;

        int step = length;
        
        for (int i = 0; i < length; i++)
        {
        	boolean ready = true;
        	step /= 2;
        	for (int k = step; k < length; k++)
        	{
        		if (array[k] < array[k - step])
        		{
        			int insert = array[k];
        			array[k] = array[k - step];
        			int gap = k - step;
        			for (int p = gap - step; p >= 0; p -= step)
        			{
        				if (insert < array[p])
        				{
        					array[gap] = array[p];
        					gap -= step;
        				}
        				
        				else break;
        			}
        			
        			array[gap] = insert;
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