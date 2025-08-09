//Construction of the Stack

import java.util.EmptyStackException;
class StackArray
	
{
	private int [] stackArray;
	private int top;
	
	StackArray()
	{
		stackArray= new int[10];
		top=-1;
		System.out.println("Array ready for 10 elements");
	}
	StackArray(int maxSize)
	{
		stackArray= new int[maxSize];
		top=-1;
		System.out.println("Array is ready Even Number of elements");
	}
	
//Operation on Stack Checking on Condition and Size
	public int size()
	{
		return top+1; // as array is o index based
	}
	public boolean isFull()//OverFlow in Stack...
	{
		return (top==stackArray.length-1);
	}
	public boolean isEmpty()//UnderFlow in Stack..
	{
		return (top==-1);
	}
	
//Operation on Stack...
   //Push an Element
   
    public void push(int x)
   {
	   if(isFull ())
	   {
		   System.out.println("Stack OverFlow!!!!!");
		   return;
	   }
	   top=top+1;
	   stackArray[top]=x;
   }
    public int pop()
	{
		int x;
		if(isEmpty())
		{		   
	        System.out.println("Stack UnderFlow!!!!!");
			throw new EmptyStackException();	
		}
		x=stackArray[top];
        top=top+1;
        return x;		
}
    //peek
    public int peek()
	{
		if(isEmpty())
		{		   
	        System.out.println("Stack UnderFlow!!!!!");
			throw new EmptyStackException();	
		}
        return stackArray[top];
	}
	
	//Display 
	
	public void display()
	{
		if(isEmpty())
		{		   
	        System.out.println("Stack UnderFlow!!!!!");
			return;
		}
		System.out.println("-------Array is--------");
        for(int i=top;i>=0;i--)
			System.out.println(stackArray[i]+"");
		System.out.println("-----------");
			
		
	}
	 public String search(int target) {
        for (int i = 0; i <= top; i++) {
            if (stackArray[i] == target) {
                return "Target Found";
            }
        }
        return "Target NotFound";
    }
		 
		 
}