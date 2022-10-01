package chapter02;

public class ArraySearch {
    private int[] arr;
    private int x;

    public ArraySearch(){

    }
    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public int pos(int x,int[] arr){
        this.arr =arr;
        this.x = x;
        int a =-1;
        for(int i=0; i<arr.length&&a ==-1; ++i){
            if(arr[i]==x){
                a = i;
            }
        }
        return a;
    }
}
