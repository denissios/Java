public class MyMap {
    static class Node {
        Node next;
        Object value;
        Object key;
    }

    private final int HT_SIZE = 16;
    private MyList list = new MyList();
    private int size;

    public MyMap()
    {
        size = 0;
        for (int i = 0; i < HT_SIZE; i++) {
            list.add_elem(null);
        }
    }

    private int getHash(Object key) { return key.hashCode() % HT_SIZE; }

    public void put(Object key, Object value)
    {
        int ht_index = getHash(key);
        Node head = (Node)list.get(ht_index);

        while (head != null)
        {
            if (head.key.equals(key))
            {
                head.value = value;
                return;
            }
            head = head.next;
        }

        size++;
        head = (Node)list.get(ht_index);
        Node newNode = new Node();
        newNode.key = key;
        newNode.value = value;
        newNode.next = head;

        list.set(newNode, ht_index);
    }

    public Object get(Object key)
    {
        int ht_index = getHash(key);
        Node head = (Node)list.get(ht_index);

        while (head != null)
        {
            if (head.key.equals(key))
                return head.value;

            head = head.next;
        }

        return null;
    }

    public Object get(Object key, Object bydefault)
    {
        int ht_index = getHash(key);
        Node head = (Node)list.get(ht_index);

        while (head != null)
        {
            if (head.key.equals(key))
                return head.value;

            head = head.next;
        }

        put(key, bydefault);
        return bydefault;
    }

    public Object remove(Object key)
    {
        int ht_index = getHash(key);
        Node head = (Node)list.get(ht_index);
        Node prev = null;

        while (head != null)
        {
            if (head.key.equals(key))
                break;
            prev = head;
            head = head.next;
        }

        if (head == null)
            return null;

        size--;
        if (prev != null)
            prev.next = head.next;
        else
            list.set(head.next, ht_index);

        return head.value;
    }

    public boolean keyContains(Object key)
    {
        int ht_index = getHash(key);
        Node head = (Node)list.get(ht_index);

        while (head != null)
        {
            if (head.key.equals(key))
                return true;
            head = head.next;
        }

        return false;
    }

    public MyList getKeys()
    {
        MyList new_list = new MyList();
        for (int i = 0; i < HT_SIZE; i++) {
            Node head = (Node)list.get(i);
            while(head != null) {
                new_list.add_elem(head.key);
                head = head.next;
            }
        }

        return new_list;
    }

    public MyList getValues()
    {
        MyList new_list = new MyList();
        for (int i = 0; i < HT_SIZE; i++) {
            Node head = (Node)list.get(i);
            while(head != null) {
                new_list.add_elem(head.value);
                head = head.next;
            }
        }

        return new_list;
    }

    public MyList getEntries()
    {
        MyList new_list = new MyList();
        for (int i = 0; i < HT_SIZE; i++) {
            Node head = (Node)list.get(i);
            while(head != null) {
                Pair pair = new Pair();
                pair.first = head.key;
                pair.second = head.value;
                new_list.add_elem(pair);
                head = head.next;
            }
        }

        return new_list;
    }

    public int size() { return size; }

    public boolean isEmpty() { return size == 0 ? true : false; }

    public void print()
    {
        MyList new_list = new MyList();
        for (int i = 0; i < HT_SIZE; i++) {
            Node head = (Node)list.get(i);
            while(head != null) {
                System.out.println("Key: " + head.key + ", ");
                System.out.println("Value: " + head.value);
                head = head.next;
            }
        }
    }
}
