package com.tasks3.linkedlist;


public class Main
{
	public static void main(String[] args)
	{
		System.out.println("new LinkedList<Object>() = " + new LinkedList<Object>());
		
		LinkedList<Object> list = new LinkedList<Object>(1, 2, 3, 4, 5, "str", "hello");
		System.out.println("list = " + list);
		
		list.delete(list.size() - 1);
		System.out.println("list.delete(list.size() - 1) = " + list);
		
		list.delete(0);
		System.out.println("list.delete(0) = " + list);
		
		list.delete(2);
		System.out.println("list.delete(2) = " + list);
		
		list.delete(list.indexOf("Not a member")); // Nothing is expected to happen
		System.out.println("list.delete(list.indexOf(\"Not a member\")) = " + list);
		
		list.delete(list.indexOf("str"));
		System.out.println("list.delete(list.indexOf(\"str\") = " + list);
		
		list.delete(list.indexOf(5));
		System.out.println("list.delete(list.indexOf(5)) = " + list);
		
		list.add(22).add(23).add(24).add("String").add(Math.PI);
		System.out.println("list.add(22).add(23).add(24).add(\"String\").add(Math.PI) = " + list);
		
		String str = list.get(list.size() - 1) + " " + list.get(0) + " " + list.get(list.indexOf("String")) + " " + list.get(-1);
		System.out.println(str);
	}
}
