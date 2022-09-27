package chapter01;

public class Rcp {
    /*
    * 1 = 가위
    * 2 = 바위
    * 3 = 보
    *
    * */
    private int myhand;
    public Rcp(){

    }

    public int getMyhand() {
        return myhand;
    }

    public String rcp(int myhand){
        int computer = (int)(Math.random()*3+1);
        this.myhand = myhand;
        String judgement = "";
        if(myhand==computer){
            judgement = "무승부 입니다.";
        }else if(myhand==1 && computer==2){
            judgement ="졌습니다.";
        }else if(myhand==1 && computer==3){
            judgement ="이겼습니다.";
        }else if(myhand==2 && computer==1){
            judgement ="이겼습니다.";
        }else if(myhand==2 && computer==3){
            judgement ="졌습니다.";
        }else if(myhand==3 && computer==1){
            judgement ="졌습니다.";
        }else if(myhand==3 && computer==2){
            judgement ="이겼습니다.";
        }
        return judgement;
    }
}
