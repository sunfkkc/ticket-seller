package data_driven_movie;


import movie.Money;

public class ReservationAgency {

    public Reservation reserve(Screening screening, Customer customer, int audienceCount){

        Money fee = screening.calculateFee(audienceCount);

        return new Reservation(customer,screening,fee,audienceCount);
    }


}
