/*Stack using linked list
operations push,pop,display */
/**
 * Innerstackusinglinkedlist
 */
class stack{
    private class StackNode{
        int data;
        StackNode next;
        StackNode(int d){
               data=d;
               next=null;
        }
    }
    StackNode top;
    int size;
    stack(){
        this.size=0;
        this.top=null;
    }
    public void stackPush(int x) {
        StackNode element = new StackNode(x);
        element.next = top;
        top = element;
        System.out.println("Element pushed");
        size++;
      }
      public int stackPop() {
        if (top == null) return -1;
        int topData = top.data;
        StackNode temp = top;
        top = top.next;
        return topData;
      }
      public int stackSize() {
        return size;
      }
      public boolean stackIsEmpty() {
        return top == null;
      }
      public void printStack() {
        StackNode current = top;
        while (current != null) {
          System.out.print(current.data + " ");
          current = current.next;
        }
        System.out.println();
      }

}



public class stackusinglinkedlist {
    public static void main(String[] args) {
        stack s=new stack();
        s.stackPush(30);
        s.stackPush(20);
        s.stackPop();
        s.stackPush(17);
        s.printStack();
        



    }
}
