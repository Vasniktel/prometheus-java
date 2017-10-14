public class BinarySearch {

    public static void main(String[] args) {

        int data[] = { 3, 6, 7, 10, 34, 56, 60 };
        int numberToFind = 10;

        int begin = 0, end = data.length - 1;
        
        while (true)
        {
        	int position = begin + (end - begin) / 2;
        	if (data[position] > numberToFind)
        	
        		end = position - 1;
        	
        	else if (data[position] < numberToFind)
        	
        		begin = position + 1;
        	
        	else
        	{
        		System.out.println(position);
        		break;
        	}
        	
        	if (end == begin)
        	{
        		if (data[end] == numberToFind)
        		
        			System.out.println(end);
        			
        		else
        		
        			System.out.println(-1);
        		
        		break;
        	}
        }
    }
}