public class MyListTest {
    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.add("0", 0);
        myList.add("1", 1);
        myList.add("2", 2);
        myList.add("3", 3);
        myList.add("4", 4);
        myList.add("5", 5);

        System.out.println(myList);

        myList.remove(2);
        System.out.println(myList);
    }
}
