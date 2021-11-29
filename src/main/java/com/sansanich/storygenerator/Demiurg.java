package com.sansanich.storygenerator;

import com.sansanich.storygenerator.entities.Action;
import com.sansanich.storygenerator.entities.Condition;
import com.sansanich.storygenerator.entities.enums.ConditionTypes;

public class Demiurg {

    boolean checkCondition(Condition condition){
        switch (condition.type){
            case HAS_ATTRIBUTE:
                System.out.println();
                break;
            case HAS_ITEM: break;
            case HAS_SKILL: break;
            case HAS_MONEY: break;
            case HAS_REPUTATION_MORE: break;
            case HAS_EFFECT: break;
            case IS_CHAR_ON_LOCATION: break;
            case IS_CHAR_ALIVE: break;
            case IS_TURN: break;
            case IS_TRIGGER: break;
            default:
                // unexpected type
        }
        return false;
    }

    boolean applyAction(Action action){
        switch (action.type){
            case ADD_ITEM:
                break;
            case REMOVE_ITEM:
                break;
            case ADD_SKILL:
                break;
            case REMOVE_SKILL:
                break;
            case ADD_MONEY:
                break;
            case REMOVE_MONEY:
                break;
            case ADD_EFFECT:
                break;
            case REMOVE_EFFECT:
                break;
            case ADD_ATTRIBUTE:
                break;
            case REMOVE_ATTRIBUTE:
                break;
            case ADD_TRAIT:
                break;
            case REMOVE_TRAIT:
                break;
            case ADD_REPUTATION:
                break;
            case REMOVE_REPUTATION:
                break;
            case ADD_CHAR_TO_LOCATION:
                break;
            case REMOVE_CHAR_TO_LOCATION:
                break;
            case KILL_CHAR:
                break;
            case CREATE_CHAR:
                break;
            case SKIP_TURNS:
                break;
            case SET_TRIGGER:
                break;
            default:
                //
        }
        return false;
    }

}
