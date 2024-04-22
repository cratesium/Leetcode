class MyLinkedList {
    static class Node {
        int val;
        Node next;
        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
 
    public static Node head;
    public static Node tail;
    
    public MyLinkedList() {
        head = null;
        tail = null;
    }
    
    public int get(int index) {
        int r = -1;
        try {
            int i = 0;
            Node temp = head;
            while (index != 0 && temp != null) {
                index--;
                temp = temp.next;
            }
            if (temp != null) {
                r = temp.val;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return r; 
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        tail = newNode;
    }
    
    public void addAtIndex(int index, int val) {
        try {
            Node newNode = new Node(val);
            if (index == 0) {
                newNode.next = head;
                head = newNode;
                return;
            }
            Node temp = head;
            int i = 0;
            while (i < index - 1 && temp != null) {
                temp = temp.next;
                i++;
            }
            if (temp != null) {
                newNode.next = temp.next;
                temp.next = newNode;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void deleteAtIndex(int index) {
        try {
            if (index == 0) {
                head = head.next;
                return;
            }
            int i = 0;
            Node temp = head;
            while (i < index - 1 && temp != null) {
                temp = temp.next;
                i++;
            }
            if (temp != null && temp.next != null) {
                temp.next = temp.next.next;
            }
        } catch (Exception e) {
            System.out.println();
            e.printStackTrace();
        }
    }
}
