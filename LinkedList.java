

public class LinkedList {

public static class Node{
    int data; 
    Node next;

    public Node(int data){
        this.data = data;
        this.next =null;
    }
}

public static Node head;
public static Node tail;
public static int size;

public  static void addFirst(int data){

    Node newNode = new Node(data);
    size++;

    if( head == null ){
        head = tail = newNode;
        return;
    }   

    newNode.next = head;
    head = newNode;
}

public static void addLast(int data)
{
    Node newNode = new Node(data);
    size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
}    

public static void print(){


    if(head == null){
        System.out.println("Emplty list");
        return;
    }

    Node temp = head;

    while(temp != null){
        System.out.println(temp.data + " ");
        temp = temp.next;

    }
    System.out.println();

}

public static void addBetn(int idx , int data){
    if ( idx == 0){
        addFirst(data);
        return;
    }
    

    Node newNode = new Node(data);
    size++;
    Node temp =head;
    int i = 0;

    while( i < idx-1){
        temp = temp.next;
        i++;

    }


    newNode.next = temp.next;
    temp.next = newNode;
}

public static int removeFirst(){

    if(size == 0){
        System.out.println("LL empty" );
        return Integer.MIN_VALUE;
    }else if(size ==1){
        int val = head.data;
       head = tail = null;
        size=0;
        return val;
    }

    int val = head.data;
    head = head.next;
    size--;
    return val;
}   



public static int removeLast(){
    if(size == 0){
        System.out.println("Empty");
        return Integer.MIN_VALUE;

    }
    else if(size ==1){
        int val =head.data;
        head=tail=null;
        size=0;
        return val;
    }

    Node prev = head;

    for ( int i=0; i<size-2; i++){
        prev = prev.next;
    }

    int val = prev.next.data;
    prev.next = null;
    tail=prev;
    size--;
    return val;

}

public static int itSearch(int key){

    Nde temp = head;
    int i =0;
     
    while (temp != null){

        if(temp.data == key){
            return 1;
        }
        temp = temp.next;
        i++;
        
    }
    return -1;
}

public static int helper(Node head, int key){

    if(head == null){
        return -1;
    }

    if(head.data == key)
{ return 0;}
   

int idx = helper (head.next, key);

if( idx == -1){
    return -1;
}
return idx + 1;

}
public static int recSearch(int key){
    return helper(head, key);
}


public static void reverse(){
    Node prev = null;
    Node curr = tail = head;
    Node next;

        while( curr != null){
            next = curr.next;
            curr.next = prev;
            prev= curr;
            curr = next; 
        }
        head = prev;
    
}

public static int(int n){  ///Reverse

    //Calculate Size
    int sz = 0;
    Node temp = tail= head;
    
    while(temp != null)   
{
    temp =temp.next;
    sz++;
}
     if(n == sz){
        head == head.next;
        return;
     }

     //sz-n

     int i =0;
     int toFind = sz-n;
     Node prev = head;

     while(i<toFind) {
        prev = prev.next;
        i++;
     }

     prev.nexr = prev.next.next;
     return;
}

public Node findMid(Node head){ ///For Palindrome function

    Node slow =head;
    Node fast = head;

    while(fast!=null && fast.next!=null){
        slow = slow.next;//+1
        fast = fast.next.next;//+2
    }
    return slow; //return mid
}

public boolean checkPalindrome(){
    //base case
    if(head == null || head.next = = null){
        return true;
    } 
       //step 1 find mid
    Ndoe midNode = findMid(head);

    //step 2 - reverse 2nd half
       Node prev = null;
       Node curr = midNode;
       Node next;

       while(curr != null){
        next = curr.next;
        curr.next = prev;
        prev =curr;
        curr =next;
       }

       Node right = prev;
       Node left = head;

    //step 3 - checck left == right
    while(right != null){
        if(left.data != right.next){
            return false;
        }
        left = left.next;
        right = right.next;
    }
    return true;
}
 public static void main(String args[]){

        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addBetn(4, 5 );

        ll.print();
        System.out.println(ll.size);
        ll.removeFirst();
        System.out.println("");
        ll.print();
      System.out.println(ll.size);
         
    //   System.out.println(recSearch(10));
    //   System.out.println(recSearch(3));
     ll.reverse();
     ll.print();

    }
}
