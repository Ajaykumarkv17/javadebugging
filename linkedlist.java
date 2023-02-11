class Node{
     int val;
     Node next;
     Node(int data){
         val=data;
         next=null;
     }
}
public class linkedlist {
    public static void main(String[] args) {
        int arr[]={3,6,7,1,2};
        Node ans=constructll(arr);
        while(ans!=null){
            System.out.print(ans.val+" ");
            ans=ans.next;
        }
    }
    public static Node constructll(int arr[]){
        Node head=new Node(arr[0]);
        Node temp=head;
        for(int i=1;i<arr.length;i++){

            Node newNode=new Node(arr[i]);
            temp.next=newNode;
            temp=temp.next;
        }
        return head;
    }

}
