package data_driven_movie;

import movie.Money;

import java.time.LocalDateTime;

public class Screening {

    private Movie movie;
    private int sequence;
    private LocalDateTime whenScreened;


    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setWhenScreened(LocalDateTime whenScreened) {
        this.whenScreened = whenScreened;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getSequence() {
        return sequence;
    }

    public LocalDateTime getWhenScreened() {
        return whenScreened;
    }

    public Money calculateFee(int audienceCount){
        switch (movie.getMovieType()){
            case AMOUNT_DISCOUNT:

                if( movie.isDiscountable(whenScreened,sequence)){

                    return movie.calculateAmountDiscountedFee().times(audienceCount);
                }

                break;

            case PERCENT_DISCOUNT:

                if( movie.isDiscountable(whenScreened,sequence)){
                    return movie.calculatePercentDiscountedFee().times(audienceCount);
                }

                break;

            case NONE_DISCOUNT:

                return movie.calculateNoneDiscountedFee().times(audienceCount);
        }

        return movie.calculateNoneDiscountedFee().times(audienceCount);
    }
}
