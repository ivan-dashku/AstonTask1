public class Main {
    public static void main(String[] args) {
        MyArrayList <Integer> MyArrayList = new MyArrayList<>();

        MyArrayList.add(1, 1);
        MyArrayList.add(2,2);
        MyArrayList.add(3,3);
        MyArrayList.add(4,15);
        MyArrayList.add(19);
        MyArrayList.add(17);

        MyArrayList.add(8, 44);


        for (int i = 0; i < MyArrayList.size(); i++) {
            System.out.print(MyArrayList.get(i)+" ");
        }
        System.out.println();
        System.out.println(MyArrayList.get(3));
        System.out.println(MyArrayList.set(3, 4));
        System.out.println(MyArrayList.size());
    }
}
