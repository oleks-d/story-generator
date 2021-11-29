package com.sansanich.storygenerator;

import com.sansanich.storygenerator.flow.GameEvent;

import java.util.Map;

public class Timeline {
    static Integer TURNS_PER_DAY = 8;
    Integer curTurn;

    Map<Integer, GameEvent> events;

    GameEvent nextTurn(){
        curTurn++;
        if(events.keySet().contains(curTurn))
            return events.get(curTurn);
        return null;
    };

    void setEvent(Integer turn, GameEvent event){
        int actualTurn = turn;
        while(events.keySet().contains(actualTurn)){
            actualTurn++;
        }
        events.put(actualTurn, event);
    }

    boolean isDay(){
        return curTurn % TURNS_PER_DAY >= TURNS_PER_DAY/2;
    }

    boolean isNight(){
        return curTurn % TURNS_PER_DAY > TURNS_PER_DAY/2;
    }
}
