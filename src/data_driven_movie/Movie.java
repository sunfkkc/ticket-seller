package data_driven_movie;

import movie.Money;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

public class Movie {
    private String title;
    private Duration runningTime;
    private Money fee;
    private List<DiscountCondition> discountConditions;
    private MovieType movieType;
    private Money discountAmount;
    private double discountPercent;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setRunningTime(Duration runningTime) {
        this.runningTime = runningTime;
    }

    public void setFee(Money fee) {
        this.fee = fee;
    }

    public void setDiscountConditions(List<DiscountCondition> discountConditions) {
        this.discountConditions = discountConditions;
    }

    public void setMovieType(MovieType movieType) {
        this.movieType = movieType;
    }

    public void setDiscountAmount(Money discountAmount) {
        this.discountAmount = discountAmount;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public String getTitle() {
        return title;
    }

    public Duration getRunningTime() {
        return runningTime;
    }

    public Money getFee() {
        return fee;
    }

    public List<DiscountCondition> getDiscountConditions() {
        return discountConditions;
    }

    public MovieType getMovieType() {
        return movieType;
    }

    public Money getDiscountAmount() {
        return discountAmount;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }


    public Money calculateAmountDiscountedFee(){
        if( movieType != MovieType.AMOUNT_DISCOUNT){
            throw new IllegalArgumentException();
        }

        return  fee.minus(discountAmount);
    }

    public Money calculatePercentDiscountedFee(){
        if( movieType != MovieType.PERCENT_DISCOUNT){
            throw new IllegalArgumentException();
        }

        return fee.minus(fee.times(discountPercent));
    }

    public Money calculateNoneDiscountedFee(){
        if( movieType != MovieType.NONE_DISCOUNT){
            throw new IllegalArgumentException();
        }

        return fee;
    }

    public boolean isDiscountable(LocalDateTime whenScreened, int sequence){
        for( DiscountCondition condition : discountConditions){
            if( condition.getType() == DiscountConditionType.PERIOD){

                if( condition.isDiscountable(whenScreened.getDayOfWeek(), whenScreened.toLocalTime())) return true;


            }else{
                if( condition.isDiscountable(sequence)) return true;
            }
        }

        return false;
    }
}
