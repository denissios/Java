public class MyListInt {
    static class Elem {
        Elem next;
        int elem;
    }

    private Elem head;
    private Elem tail;
    private int size;

    public MyListInt()
    {
        head = null;
        tail = null;
        size = 0;
    }

    public void add_elem(int obj)
    {
        Elem new_elem = new Elem();
        new_elem.elem = obj;
        size++;
        if (tail == null) {
            head = new_elem;
            tail = new_elem;
        }
        else {
            tail.next = new_elem;
            tail = new_elem;
        }
    }

    public void add_elem(int obj, int location)
    {
        if (location == 0) {
            Elem new_elem = new Elem();
            new_elem.elem = obj;
            new_elem.next = head;
            head = new_elem;
            return;
        }
        if (location > size - 1 || location < 0) {
            add_elem(obj);
            return;
        }
        Elem temp = head, prev = head;
        for (int i = 0; i < location; i++) {
            prev = temp;
            temp = temp.next;
        }

        size++;
        Elem new_elem = new Elem();
        new_elem.elem = obj;
        prev.next = new_elem;
        new_elem.next = temp;
    }

    public int get(int index)
    {
        if (index >= size || size < 0)
            throw new NullPointerException("Exception: out of range!");
        Elem temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.elem;
    }

    public Object remove(int index)
    {
        if (index >= size || size < 0)
            return null;
        Elem temp = head, prev = head;
        for (int i = 0; i < index; i++) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
        size--;
        return temp.elem;
    }

    public Object set(int obj, int index)
    {
        if (index >= size || index < 0)
            return null;
        Elem temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        Object ret_val = temp.elem;
        temp.elem = obj;
        return ret_val;
    }

    public boolean contains(int obj)
    {
        Elem temp = head;
        while (temp != null) {
            if (temp.elem == obj)
                return true;
            temp = temp.next;
        }
        return false;
    }

    public int index_of(int obj)
    {
        Elem temp = head;
        int index = 0;
        while (temp != null) {
            System.out.println(temp.elem);
            if (temp.elem == obj)
                return index;
            index++;
            temp = temp.next;
        }
        return -1;
    }

    public int size() { return size; }

    public boolean is_empty() { return head == null ? true : false; }

    public void print()
    {
        Elem temp = head;
        while (temp != null) {
            System.out.println(temp.elem);
            temp = temp.next;
        }
    }
}
