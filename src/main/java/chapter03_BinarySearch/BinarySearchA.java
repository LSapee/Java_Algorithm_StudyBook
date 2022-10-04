package chapter03_BinarySearch;

import java.util.Arrays;

public class BinarySearchA {

    private int[] a;
    int x;
    public BinarySearchA(){

    }

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int bs(int[] a, int x){
        this.a = a;
        this.x = x;
        int pos = -1;
        int left =0;
        int right =a.length;
        int mid =0;
        while(pos==-1&&left<=right){
            mid = (right+left)/2;
            if(a[mid]==x){
                pos = mid;
            }else if(a[mid]>x){
                right = mid-1;
            }else if(a[mid]<x){
                left=mid+1;
            }
            System.out.printf("반복 실행 중\npos = %d\n left = %d\n right = %d\n mid = %d\n",pos,left,right,mid);
        }
        System.out.println("반복 끝!!");
        return pos;
    }
}
