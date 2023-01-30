import java.util.EmptyStackException;

public class ArrayStack implements DStack { 

private double[] items = new double[10]; 

private int top = 0; // The number of items currently on the stack.

public void push( double N ) {
if (top == items.length) {

double[] b=new double[2*items.length];

for(int i=0;i<items.length;i++)
{
b[i]=items[i];
}

items=b;
}
items[top] = N; 
top++; 
}


public double pop() {
if ( top == 0 )
throw new EmptyStackException();
double topItem = items[top - 1]; 
top--; 
return topItem;
}


public boolean isEmpty() {
return (top == 0);
}


@Override
public double peek() {
// TODO Auto-generated method stub
if ( top == 0 )
throw new EmptyStackException();
double topItem = items[top - 1]; 
return topItem;
}

}