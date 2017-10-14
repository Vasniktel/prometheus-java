package com.tasks3.linkedlist;


public class Main
{
	public static void main(String[] args)
	{
		LinkedList<Object> list = new LinkedList<Object>(1, 2, 3, 4, 5, "str", "hello");
		System.out.println(list);
		
		list.delete(list.size() - 1);
		System.out.println(list);
		
		list.delete(0);
		System.out.println(list);
		
		list.delete(2);
		System.out.println(list);
		
		list.add(22).add(23).add(24);
		System.out.println(list);
		
		System.out.println(list.get(list.size() - 1) + " " + list.get(0) + " " + list.get(3));
	}
}
