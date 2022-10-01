package chapter02;

public class Chapter02_RunClass {
    public static void main(String[] args) {
        ArraySum arraySum = new ArraySum();
        ArraySearch arraySearch = new ArraySearch();
        int arr[] ={72,68,92,88,41,53,97,84,39,55};
        System.out.println(arraySum.sum(arr));
        System.out.println(arraySearch.pos(53,arr));

//      최소값 && 최대값 구하기
        int max,min;
        max = min =arr[0];
        for(int i=0; i<arr.length; ++i){
            if(arr[i]>max) max = arr[i];
            if(arr[i]<min) min = arr[i];
        }
        System.out.printf("min : %d\n",min);
        System.out.printf("max : %d\n",max);
    }
}
