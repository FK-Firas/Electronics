import java.util.EmptyStackException;

public class ListStack implements DStack{

private static class Node {
double item;
Node next;
}

private Node top; 
public void push( double N ) {
Node newTop; 
newTop = new Node();
newTop.item = N; 
newTop.next = top; 
top = newTop; 
}


public double pop() {
if ( top == null )
throw new EmptyStackException();
double topItem = top.item; 
top = top.next; 
return topItem;
}

public boolean isEmpty() {
return (top == null);
}

@Override
public double peek() {
if ( top == null )
throw new EmptyStackException();
double topItem = top.item;
return topItem;
}

} 