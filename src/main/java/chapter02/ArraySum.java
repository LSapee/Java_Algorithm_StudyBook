package chapter02;

public class ArraySum {
    private int[] arr;

    public ArraySum(){

    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }
    public int sum(int[] arr){
        int sum =0;
//        실행전
        System.out.printf("실행 전 sum의 값 : %d\n",sum);
        for(int i=0; i<arr.length; ++i){
            sum+=arr[i];
//            실행중
            System.out.printf("실행 중 sum의 값 : %d\n",sum);
        }
//        실행후
        System.out.printf("실행 후 sum의 값 : %d\n",sum);
        return sum;
    }
}
