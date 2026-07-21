package ashraf.movieticket;

import java.util.HashSet;
import java.util.Set;

public class Movie {

    private long movieId;
    private String movieName;
    private int totalSeats;
    private Set<Integer>bookedSeat;



     public Movie(long movieId,String movieName, int totalSeats){
         this. movieId=movieId;
         this.movieName=movieName;
         this.totalSeats=totalSeats;
         this.bookedSeat=new HashSet<>();

     }

     public long getMovieId(){
         return movieId;
     }


     public String getMovieName(){

         return movieName;
     }

     public int getTotalSeats(){
         return totalSeats;
     }

     public Set<Integer> getBookedSeat(){
         return bookedSeat;
     }

     public void setBookedSeat(Set<Integer> bookedSeat){
         this.bookedSeat=bookedSeat;
     }


}
