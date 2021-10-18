public class MyClass
{
    public static void main(String[] args)
    {
        MyListInt listInt1 = new MyListInt();
        MyListInt listInt2 = new MyListInt();

        listInt1.add_elem(1);
        listInt1.add_elem(5);
        listInt1.add_elem(6);
        listInt1.add_elem(15);
        listInt1.add_elem(25);
        listInt1.add_elem(30);

        listInt2.add_elem(3);
        listInt2.add_elem(12);
        listInt2.add_elem(13);
        listInt2.add_elem(100);

        MyListInt new_listInt = new MyListInt();
        try {
            new_listInt = merge(listInt1, listInt2);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        new_listInt.print();
        System.out.println("\n\n");





        MyMap map = new MyMap();

        map.put(1, "1th");
        map.put(4, "2th");
        map.put(3, "3th");
        map.put(8, "4th");
        map.put(15, "5th");
        map.put(7, "6th");
        map.put(20, "7th");
        map.put(25, "8th");
        map.put(7, "9th");
        map.print();
        System.out.println("\n\n");

        System.out.println(map.get(7));
        System.out.println(map.get(100));
        System.out.println(map.get(1, "bydefault"));
        System.out.println(map.get(7, "bydefault"));
        System.out.println(map.get(100, "bydefault"));
        map.print();
        System.out.println("\n\n");

        map.remove(100);
        map.remove(25);
        map.print();
        System.out.println("\n\n");

        System.out.println(map.keyContains((7)));
        System.out.println(map.keyContains((1000)));
        System.out.println("\n\n");

        MyList map_list = map.getKeys();
        System.out.println("Keys:");
        map_list.print();
        System.out.println("\n\n");

        map_list = map.getValues();
        System.out.println("Values:");
        map_list.print();
        System.out.println("\n\n");

        System.out.println("Size of map: " + map.size());
        System.out.println("Is map Empty: " + map.isEmpty());
        System.out.println("\n\n");

        map_list = map.getEntries();
        for (int i = 0; i < map_list.size(); i++) {
            System.out.println("Key: " + ((Pair)map_list.get(i)).first + ", ");
            System.out.println("Value: " + ((Pair)map_list.get(i)).second);
            System.out.println();
        }
    }

    public static MyListInt merge(MyListInt first_list, MyListInt second_list)
    {
        MyListInt new_list = new MyListInt();
        if(first_list.size() == 0 && second_list.size() == 0)
            return new_list;

        int i = 0, j = 0;
        while (true) {
            if (i == second_list.size()) {
                while (j != first_list.size()) {
                    new_list.add_elem(first_list.get(j));
                    j++;
                }
                break;
            }

            else if (j == first_list.size()) {
                while (i != second_list.size()) {
                    new_list.add_elem(second_list.get(i));
                    i++;
                }
                break;
            }

            else if (first_list.get(j) > second_list.get(i)) {
                new_list.add_elem(second_list.get(i));
                i++;
                continue;
            }

            else if (first_list.get(j) < second_list.get(i)) {
                new_list.add_elem(first_list.get(j));
                j++;
                continue;
            }
        }

        return new_list;
    }
}