package com.sansanich.storygenerator;

import com.sansanich.storygenerator.entities.GameEvent;
import com.sansanich.storygenerator.entities.GameObject;

import java.util.Map;

public class Timeline {
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
}
