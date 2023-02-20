class QueueNode{
    int data;
    QueueNode next;
    QueueNode(int d){
        data=d;
        next=null;
    }

}
class Queue{
    QueueNode front=null,rear=null;
    int size=0;
    public void Enqueue(int d){
        QueueNode q=new QueueNode(d);
        q.next=rear;
        if (q == null)  //When heap exhausted 
        System.out.println("Queue is Full");
        else{
            if(front==null){
                front=q;
                rear=q;
                front.next=null;
                rear.next=null;

            }
            else{
                rear.next=q;
                rear=q;
                rear.next=null;
               
            }
            System.out.println(d+" Inserted into Queue ");
            size++;
        }
    }
    public void dequeue(){
        if (front == null) 
        System.out.println("Queue is Empty");
        else{
            QueueNode deletedvalue=front;
            System.out.println(deletedvalue.data+" deleted successfully");
            front =front.next;
            size--;

        }

    }
    boolean Empty()
{
    return front == null;
}  
int Peek()
{
    if(Empty())  
     {  System.out.println("Queue is Empty");
        return -1;
     } 
    else 
      return front.data;
}   
public void display(){
    QueueNode temp=front;
    while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
    System.out.println(" ");
}
}



public class queueusinglinkedlist {
    public static void main(String[] args) {
        Queue q=new Queue();
        q.Enqueue(17);
        q.Enqueue(10);
        q.Enqueue(3);
        q.dequeue();
        q.display();

    }
}
