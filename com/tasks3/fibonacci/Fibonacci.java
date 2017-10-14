package com.tasks3.fibonacci;

public class Fibonacci
{
    public long getNumber(int position){
    	/*
    	if (position <= 0)
    	
    		return -1;
    	
    	if (position == 1 || position == 2)
    		
    		return 1;
    	
    	return this.getNumber(position - 1) + this.getNumber(position - 2);
    	*/
    	if (position <= 0)
    	
    		return -1;
    	
    	if (position == 1 || position == 2)
    		
    		return 1;
    	
    	long[] nums = new long[position];
    	
    	nums[0] = nums[1] = 1;
    	
    	for (int i = 2; i < position; i++)
    		
    		nums[i] = nums[i - 1] + nums[i - 2];
    	
    	return nums[position - 1];
    }
}