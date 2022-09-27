package chapter01;

public class GCDanLCM {
    private int a;
    private int b;

    public GCDanLCM(){

    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
//최소공배수
    public int greatest_common_divisor(int a,int b){
        this.a =a;
        this.b =b;
        int lcm = least_common_multiple(a,b);
        int gcd = (a/lcm)*(b/lcm)*lcm;

        return gcd;
    }
//    최대공약수
    public int least_common_multiple(int a,int b){
        this.a =a;
        this.b =b;
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        while(max%min!=0){
            a = max%min;
            b = min;
            max= Math.max(a,b);
            min =Math.min(a,b);
        }
        return min;
    }
}
