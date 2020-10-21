
public class SuperStack<T> 
{
	private T[] items;
	private int top;
	
	public SuperStack(int size) {
		items = (T[]) new Object();
	}
	
	boolean isEmpty() {
		return top == 0;
	}
	
	boolean isFull() {
		return top == items.length;
	}
	
	boolean push(T item) {
		if (isFull())
		{
			return false;
		}
		
		items[top] = item;
		return true;
	}
	
	public T pop() {
		if (isEmpty())
		{
			return null;
		}
		else
		{
			--top;
			return items[top];
		}
	}
}
