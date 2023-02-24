package linked_list;

public class MyLinkedListTest {
  public static void main(String[] args) {
        MyLinkedList<Integer> numbers = new MyLinkedList<>();

        numbers.addFirst(1);
        numbers.addFirst(2);
        numbers.addFirst(3);
        numbers.addFirst(4);

        numbers.addLast(10);

        numbers.add(1,100);

        numbers.remove(3);

        System.out.println("Độ lớn của mảng: " + numbers.size());

        System.out.println(numbers);

    //=============================================================
        System.out.println("=========================================================");

        List<Integer> nums = new LinkedList<>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        nums.add(2,4);
        nums.add(1,0);

        nums.get(1);

        System.out.println(nums.remove(2));

        System.out.println(nums);

        System.out.println(nums.size());
    }

}
