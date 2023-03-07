package DDD;

import data_driven_movie.DiscountConditionType;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class DiscountCondition {


    private DiscountConditionType type;
    private int sequence;
    private DayOfWeek dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;
    public boolean isSatisfiedBy(Screening screening){

        switch (type){
            case PERIOD:
                return isSatisfiedByPeriod(screening);
            case SEQUENCE:
                return isSatisfiedBySequence(screening);
        }

        throw new IllegalStateException();
    }

    private boolean isSatisfiedByPeriod(Screening screening){

        //대충 조건 충족 검사 로직
        return true;
    }

    private boolean isSatisfiedBySequence(Screening screening){

        //대충 조건 충족 검사 로직
        return false;
    }
}
