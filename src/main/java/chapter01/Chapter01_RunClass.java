package chapter01;

public class Chapter01_RunClass {
    public static void main(String[] args) {

//      BMI 만들기
        StringBuilder  sb = new StringBuilder();
        Bmi bmi = new Bmi();
        int aBmi = bmi.bmi(48,1.72);
        int bBmi = bmi.bmi(58,1.63);
        int cBmi = bmi.bmi(52,1.78);

        sb.append(aBmi).append("\n").append(bBmi).append("\n").append(cBmi).append("\n");

        System.out.println(sb);
//      가위바위보
        StringBuilder sb1 = new StringBuilder();
        Rcp rcp = new Rcp();
        sb1.append(rcp.rcp(1)).append("\n");
        sb1.append(rcp.rcp(2)).append("\n");
        sb1.append(rcp.rcp(3)).append("\n");

        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder();
        GCDanLCM gcdanlcm = new GCDanLCM();
        System.out.println(gcdanlcm.least_common_multiple(6,9));
        System.out.println(gcdanlcm.greatest_common_divisor(6,9));
    }
}
