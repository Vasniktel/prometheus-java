package com.tasks3.linkedlist;


class Node<T>
{
	private Node<T> next;
	private Node<T> prev;
	private T data;
	
	public Node(T data, Node<T> prev, Node<T> next)
	{
		this.data = data;
		this.prev = prev;
		this.next = next;
	}

	public Node<T> getPrev()
	{
		return this.prev;
	}
	
	public void setPrev(Node<T> prev)
	{
		this.prev = prev;
	}
	
	public Node<T> getNext()
	{
		return this.next;
	}
	
	public void setNext(Node<T> next)
	{
		this.next = next;
	}
	
	public T getData()
	{
		return this.data;
	}
	
	public void setData(T data)
	{
		this.data = data;
	}
}


public class LinkedList<T>
{
	private Node<T> first;
	private Node<T> last;
	private int size = 0;
	
	@SafeVarargs
	public LinkedList(T ... args)
	{
		if (args.length > 0)
		{
			for (T arg: args)
			{
				this.add(arg);
			}
		}
	}

	public LinkedList<T> add(T data)
	{
		Node<T> insert = new Node<T>(data, this.last, null);
		
		if (this.first == null && this.last == null)
		{
			this.first = insert;
			this.last = insert;
		}
		else
		{
			this.last.setNext(insert);
			this.last = insert;
		}
		
		this.size++;
		
		return this;
	}
 
	public T get(int index)
	{
		if (index < 0 || index >= this.size)
		{
			return null;
		}
		
		Node<T> elem;
		
		if (index > this.size / 2)
		{
			elem = this.last;
			
			for (int i = index + 1; i < this.size; i++)
			{
				elem = elem.getPrev();
			}
		}
		else
		{
			elem = this.first;
			
			for (int i = 0; i < index; i++)
			{
				elem = elem.getNext();
			}
		}
		
		return elem.getData();
	}

	public boolean delete(int index)
	{
		if (index < 0 || index >= this.size)
		{
			return false;
		}
		
		if (index == 0)
		{
			this.first.getNext().setPrev(null);
			this.first = this.first.getNext();
		}
		else if (index == this.size - 1)
		{
			this.last.getPrev().setNext(null);
			this.last = this.last.getPrev();
		}
		else
		{
			Node<T> elem, prevElem;
			
			if (index > this.size / 2)
			{
				elem = this.last;
				prevElem = this.last.getPrev();
				
				for (int i = index + 1; i < this.size; i++)
				{
					elem = prevElem;
					prevElem = prevElem.getPrev();
				}
			}
			else
			{
				elem = this.first;
				
				for (int i = 0; i < index; i++)
				{
					prevElem = elem;
					elem = elem.getNext();
				}
			}
			
			elem.getNext().setPrev(elem.getPrev());
			elem.getPrev().setNext(elem.getNext());
		}
		
		this.size--;
		
		return true;
	}

	public int size()
	{
		return this.size;
	}
	
	public int indexOf(T value)
	{
		int index = -1;
		Node<T> elem = this.first;
		
		for (int i = 0; i < this.size; i++)
		{
			if (elem.getData().equals(value))
			{
				index = i;
				break;
			}
			
			elem = elem.getNext();
		}
		
		return index;
	}
	
	@Override
	public String toString()
	{
		if (this.first != null)
		{
			StringBuilder str = new StringBuilder("[ " + this.first.getData());
			
			Node<T> elem = this.first.getNext();
			for (int i = 1; i < this.size; i++)
			{
				str.append(", " + elem.getData());
				elem = elem.getNext();
			}
			
			str.append(" ]");
			
			return str.toString();
		}
		
		return "[ ]";
	}
}
