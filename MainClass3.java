package core.java.genericsAssignment;

import java.util.ArrayList;

class Exchange<T>
{
	private T[]arr;

	public Exchange(T[] arr) {
		super();
		this.arr = arr;
	}

	public T[] getArr() {
		return arr;
	}

	public <E> void print(E[]arr)
	{
		for(E e:arr)
		{
			System.out.println(e);
		}
	}
	
	
	//method for swapping two elements
	
	public static<T> void swap(T[]array,int a,int b)
	{
		T c=array[a];
		array[a]=array[b];
		array[b]=c;
	}
}
public class MainClass3 {

	public static void main(String[] args)
	{
		int p=0;
		int q=2;
		Integer[]arr={100,90,80,70};
	
		Exchange<Integer> x=new Exchange<>(arr);
		
		Integer[]array2=x.getArr();
		x.print(arr);
		System.out.println("After Swapping the numbers at index "+p + "and "+q);
		x.swap(arr, p, q);
		x.print(arr);

		
	}

}
