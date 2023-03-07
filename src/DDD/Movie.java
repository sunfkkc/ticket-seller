package DDD;

import data_driven_movie.MovieType;
import movie.Money;

import java.time.Duration;
import java.util.List;

public class Movie {

    private String title;
    private Duration runningTime;
    private Money fee;
    private List<DiscountCondition> discountConditions;

    private MovieType movieType;
    private Money discountAmount;
    private double discountPercent;

    public Money calculateMovieFee(Screening screening){

        if( isDiscountable( screening)){

            return fee.minus( calculateDiscountAmount());
        }

        return fee;

    }

    private boolean isDiscountable( Screening screening){

        return discountConditions.stream().anyMatch( discountCondition -> discountCondition.isSatisfiedBy( screening));
    }


}
