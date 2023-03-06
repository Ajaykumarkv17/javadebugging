
    import java.io.*;
    import java.util.*;
    import java.lang.*;
    
      class lrucache {
    
        public static void main(String[] args) throws IOException {
            
            Scanner sc=new Scanner(System.in);
            int cap=sc.nextInt(4);
            LRUCache lr=new LRUCache(cap);
            lr.set(3, 12);
            lr.set(4, 15);
            lr.set(5, 20);
            lr.set(8, 5);
            int a=lr.get(5);
            System.out.print(a);
            lr.set(2, 45);
            int b=lr.get(4);
            System.out.println(b);


            
        }
    }
    
  
    

    
     
    
    
    // design the class in the most optimal way
    
    
    class LRUCache {
        // Internal class for representing a node in the doubly linked list
        class Node {
            int key;
            int value;
            Node prev;
            Node next;
            Node(int key, int value) {
                this.key = key;
                this.value = value;
            }
        }
        
        int capacity;
        Map<Integer, Node> cache = new HashMap<>();
        Node head = null;
        Node tail = null;
        
        // Constructor for initializing the cache capacity with the given value.
        LRUCache(int capacity) {
            this.capacity = capacity;
        }
        
        // Function to return value corresponding to the key.
        public int get(int key) {
            if (cache.containsKey(key)) {
                Node node = cache.get(key);
                removeNode(node);
                addToHead(node);
                return node.value;
            } else {
                return -1;
            }
        }
        
        // Function for storing key-value pair.
        public void set(int key, int value) {
            if (cache.containsKey(key)) {
                Node node = cache.get(key);
                node.value = value;
                removeNode(node);
                addToHead(node);
            } else {
                if (cache.size() == capacity) {
                    cache.remove(tail.key);
                    removeNode(tail);
                }
                Node node = new Node(key, value);
                cache.put(key, node);
                addToHead(node);
            }
        }
        
        // Internal helper function for removing a node from the doubly linked list.
        private void removeNode(Node node) {
            if (node.prev == null) {
                head = node.next;
            } else {
                node.prev.next = node.next;
            }
            if (node.next == null) {
                tail = node.prev;
            } else {
                node.next.prev = node.prev;
            }
        }
        
        // Internal helper function for adding a node to the head of the doubly linked list.
        private void addToHead(Node node) {
            node.next = head;
            node.prev = null;
            if (head != null) {
                head.prev = node;
            }
            head = node;
            if (tail == null) {
                tail = node;
            }
        }
    }