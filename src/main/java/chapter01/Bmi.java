package chapter01;

public class Bmi {

    private double height;
    private double weight;

    public Bmi(){

    }
    public Bmi(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public int bmi(double weight,double height){
        this.height = height;
        this.weight = weight;
//      소수점 없애기 인트형으로 리턴
        return (int)(weight/height/height);
    }
}
