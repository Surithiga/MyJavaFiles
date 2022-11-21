package com.Abstract1;

public class Cricket1 extends Cricket{
    Cricket1(String playerName,int score){
       this.playerName=playerName;
       this.score=score;
    }

    @Override
    void create(){
        System.out.println("the match was postponed due to rain");
    }

}
