public class MyClass
{
    public static void main(String[] args)
    {
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
}