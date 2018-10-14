public class Test {
    public static void main(String[] args) {
        MyList list=new MyList<Object>();
        list.add(1,"phuc");
        list.add(5,"hoang" );
        list.add(0,3);
        list.add(3,"Hello");
        list.printList();
        list.add(43);
        list.add(44);
        list.printList();
        list.remove(3);
        list.remove(1);
        list.printList();
        if (list.contains("son")) {
            System.out.println(true);
        }else {
            System.out.println(false);
        }

        System.out.println(list.indexOf(44));


    }
}
