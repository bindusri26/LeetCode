class MyLinkedList {
    class Node{
        int data;
        Node next;
        Node(int value){
            this.data=value;
        }
        

    }
    Node head;
        int size;

    public MyLinkedList() {
        head=null;
        size=0;

        
    }
    
    public int get(int index) {
        Node cur=head;
        if(index<0||index>=size) return -1;
        for(int i=0;i<index;i++){
           cur=cur.next;
        }
        return cur.data;

        
        
    }
    
    public void addAtHead(int val) {
        Node newNode=new Node(val);
        newNode.next=head;
        head=newNode;
        size++;
        
    }
    
    public void addAtTail(int val) {
        Node newNode=new Node(val);
        Node cur=head;
        if(head==null){
            head=newNode;
        }else{
            while(cur.next!=null){
                cur=cur.next;
            }
            cur.next=newNode;
        }
        
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        Node newNode=new Node(val);
        if(index<0||index>size) return;
        if(index==0){
            addAtHead(val);
            return;
        }
        if(index==size){
            addAtTail(val);
            return;
        }
        Node prev=head;
        for(int i=0;i<index-1;i++){
            prev=prev.next;
        }
        newNode.next=prev.next;
        prev.next=newNode;
        size++;

        
    }
    
    public void deleteAtIndex(int index) {
        Node prev=head;
        if(index<0||index>=size) return;
        if(index==0){
            head=head.next;
        }else{
            for(int i=0;i<index-1;i++){
                prev=prev.next;
            }
            Node delNode=prev.next;
            prev.next=delNode.next;
        
        }
        size--;

        

      
        
        
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */