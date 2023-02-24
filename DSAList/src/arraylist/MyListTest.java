package arraylist;

public class MyListTest {
   public static void main(String[] args) {
        MyList<Worker> myList = new MyList<Worker>();

//        Integer[] numbers = new Integer[]{1, 2, 3, 4};

//        myList.setElements(numbers);

        Worker worker1 = new Worker(1, "A1", "B1");
        Worker worker2 = new Worker(2, "A2", "B2");
        Worker worker3 = new Worker(3, "A3", "B3");
        Worker worker4 = new Worker(4, "A4", "B4");
        Worker worker5 = new Worker(5, "A5", "B5");

        myList.add(0,worker1);
        myList.add(1,worker2);
        myList.add(2,worker3);
        myList.add(3,worker4);
        System.out.println(myList.add(worker5));

        System.out.println("Phan tu bi xoa: " + myList.remove(2));

        System.out.println("Do lon cua mang hien tai: " + myList.size());

        System.out.println("Mang hien tai la: " + myList);

        System.out.println("Mang theo method getElements(): " + Arrays.toString(myList.getElements()));

        System.out.println("Mang duoc copy la: " +Arrays.toString(myList.clone()));

        System.out.println(myList.contains(worker1));

        System.out.println(myList.contains(worker3));

        System.out.println("Index của worker 1 là: " + myList.indexOf(worker2));

        System.out.println("Index của worker 3 là: " + myList.indexOf(worker3));

        System.out.println("Index của worker 3 là: " + myList.indexOf(worker3));

        System.out.println("Phần tử thứ 2 là: " + myList.get(0));

        myList.clear();
        System.out.println("Mảng sau khi xóa là: " + Arrays.toString(myList.getElements()));


//=======================================================================================

        System.out.println("================================");

        ArrayList<Worker> arr = new ArrayList<Worker>();
        Worker w1 = new Worker(1, "A", "B");
        Worker w2 = new Worker(2, "C", "D");
        Worker w3 = new Worker(3, "E", "F");

        arr.add(0, w1);
        arr.add(1, w2);

        for (Worker w : arr) {
            System.out.println(w);
        }

        arr.add(w3);

        System.out.println(arr.contains(w1));

        System.out.println(arr.contains(w3));

        System.out.println(arr.clone());

        arr.remove(0);

        System.out.println(arr);

        System.out.println(arr.get(1));
    }
}
