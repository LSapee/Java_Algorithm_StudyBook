package chapter03_BinarySearch;

public class Chapter03_RunClass {
    public static void main(String[] args) {
        int [] a = {39,41,53,55,68,72,84,88,92,97};
        BinarySearchA ba = new BinarySearchA();
        System.out.println("pos값이 -1 이면 해당 인수는 배열에 존재하지 않는 수이며, -1 이외의 수는 배열의 n번째 자리");
        System.out.printf("pos : %d\n", ba.bs(a,54));
        System.out.printf("pos : %d\n", ba.bs(a,55));
        System.out.printf("pos : %d\n", ba.bs(a,97));
    }
}
