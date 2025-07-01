package LinkedListP1;


public class LinkedList {
 public  Node head;
 public  Node tail;
    class Node
    {
     int data;
     Node next;

     public Node(int data){
        this.data = data;
        this.next = null;
      }
   }



//Methods non static beacuse we will use object to call this methods
public  void addFirst(int data){// O(1) time complexity becuz no loop and recursion

    // step 1: Create a new node with the given data
           Node newNode = new Node(data);

        if(head == null){
            newNode.next = null;
            head =tail= newNode;
            return;
        }
    //step 2 : connect newNode with the head
           newNode.next = head;

    //step 3: Update the head to point to the new node
            head = newNode;
}

public void addlast(int data){
    Node newNode = new Node(data);
    if(head == null){
        newNode.next = null;
        head = tail = newNode;
        return;
    }

    tail.next = newNode;
    tail= newNode;
    tail.next = null;

}
public void Print()
{
    Node temp = head;
    if(head ==null){
        System.out.println("null");
    }
    while(temp != null){
        System.out.print(temp.data +"-> ");
        temp = temp.next;
    }
    System.out.println("null");
}   

public void addMiddle(int data, int index){//O(n)
    Node newNode = new Node(data);
    if (index ==0){
        addFirst(data);
            return;   
    }

    Node temp = head;
    int i=0;
    while(i < (index-1)){
        temp = temp.next;
        i++;

}
  newNode.next = temp.next;
  temp.next = newNode;

}

public int removeFirst(){
    if(head == null){
        System.out.println("empty");
    }
    
    int val = head.data;
    head = head.next;
    return val;
}

public void removeLast(){
    Node temp = head;
    while(temp.next.next != null){
        temp = temp.next;
    }
    temp.next = null;
}

public void reverse(){
    Node prev = null;
    Node curr = head;
    Node next ;

    while(curr != null ){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr= next;
    }
    head =prev;// new head is the previous tail
}
// remove nth node from end

public void deleteNthfromend(int n){
    // sizw of list
    int size = 0;
    Node temp = head;
    while(temp != null){
        temp = temp.next;
        size++;
    }
    System.out.println(size);

    if(n == size)
    {
        head = head.next;
        return;

    }

    // to geggt previous
     int i=1;
     int iTofind = size-n;
     Node prev = head;
     while(i< iTofind){
        prev = prev.next;
        i++;
     }
prev.next= prev.next.next;


}

//Slow Fast approach
public Node findMid(Node head){
    Node slow = head ;
    Node fast = head;

    while(fast != null && fast.next!= null){
        slow = slow.next ;
        fast = fast.next.next;
    }
    return slow;
}

public boolean checkPalindrome(){
    //1. find mid
    //2. reverse second half 
    // 3. check right half anf left half

    if (head == null || head.next == null){
        return true;
    }
    // 1
    Node midNode = findMid(head);

    //2
    Node prev = null;
    Node curr = midNode;
    Node next;

    while(curr != null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    Node right = prev;
    Node left = head;

    // 3
    while(right != null ){
        if(left.data != right.data){
            return false;
        }
        left = left.next;
         right= right.next;
    }
    return true;
}
public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
       l1.addFirst(10);
       l1.addFirst(20);

       l1.addlast(30);
       l1.addlast(40);
       l1.addMiddle(50,2);
       l1.Print();
       int ans = l1.removeFirst();
       System.out.println(ans);
       l1.Print();
       l1.removeLast();
       l1.Print();
       l1.reverse();
       l1.Print();
       l1.deleteNthfromend(2);
       l1.Print();
       System.out.println(l1.checkPalindrome());
    }
}
