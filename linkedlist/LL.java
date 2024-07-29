public class LL {
 
    
        private Node head;
        private Node tail;
        private int size;
    
        public LL() {
            this.size = 0;
        }
    
        public void insertAtFirstPosition(int val)
         {
            Node node = new Node(val);
            node.next = head;
            head = node;
    
            if (tail == null) {
                tail = head;
            }
    
            size = size + 1;
        }

        public void insertAtLastPosition(int val)
        {
            if(tail==null)
            {
                insertAtFirstPosition(val);
                return;
            }
            Node node = new Node(val);
            tail.next=node;
            tail=node;
            size++;

        }
        public void insertAtIndex(int val,int index)
        {
            if(index==0)
            {
                insertAtFirstPosition(val);
                return;
            }
            else if(index==size)
            {
                insertAtLastPosition(val);
                return;

            }
            Node temp=head;
            
            for(int i=1;i<index;i++)
            {
                temp=temp.next;
          
            }
            Node node=new Node(val,temp.next);
            temp.next=node;
            size++;
        }
        public int deleteAtFirst()
        {
            int deletedvalue=head.val;
            head=head.next;
            if(head.next==null)
            {
                tail.next=null;
            }
            size--;
            return deletedvalue;
        }
        public int deleteAtLast()
        {
            int delvalue;
            if(head.next==null)
            {
                tail=head;
                delvalue=tail.val;
                tail=head=null;
            }
             delvalue=tail.val;
            Node temp;
            temp=head;
            while ((temp.next!=tail)) {
                temp=temp.next;
            }
            tail=temp;
            tail.next=null;
            size--;
            return delvalue;
        }
        public int deleteAtIndex(int index) {
            int del;
          
            if (index == 0) {
                return deleteAtFirst();
            } else if (index == size - 1) {
                return deleteAtLast();
            }
        
            Node temp = head;
            
            for (int i = 1; i < index-1; i++) {
                temp = temp.next;
            }
            
            del = temp.next.val;
            temp.next = temp.next.next;
            size--;
            return del;
        }

        public int findElement(int element)
        {
           Node temp=head;
           int index=0;
           while (temp.val!=element) {
                temp=temp.next;
                index++;
           }
           return index;
        }
        
        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }
            System.out.println("End");
        }
    
        private class Node {
            private int val;
            private Node next;
    
            private Node(int val) {
                this.val = val;
            }
    
            private Node(int val, Node next) {
                this.val = val;
                this.next = next;
            }
        }
    }
    



