package ashraf.movieticket;

import java.util.HashMap;
import java.util.Map;

public class MovieService {

    Map<Long,Movie> movies= new HashMap<>();

    public void addMovie(long id, String name, int totalSeats) {
        if(movies.containsKey(id)){
            System.out.println("Movie Already Exists");
            return;
        }
        movies.put(id,new Movie(id,name,totalSeats));
    }

    public void bookSeat(long movieId,int seatNo){
        Movie movie=movies.get(movieId);
        if (movie == null) {
            System.out.println("Movie not found");
            return;
        }

        if(seatNo<1 || seatNo> movie.getTotalSeats()){
            System.out.println("Invalid Seat no");
            return;
        }

        if (movie.getBookedSeat().contains(seatNo)){
            System.out.println("Seat Alreadu Booled");
            return;
        }

        movie.getBookedSeat().add(seatNo);

    }

    public void cancellSeat(long movieId, int seatNo) {

        Movie movie=movies.get(movieId);

        if(movie==null){
            System.out.println("movie not found");
            return;
        }
        movie.getBookedSeat().remove(seatNo);
        System.out.println("Seat Cancelled");

    }


    public void availableSeats(long movieId){
        Movie movie=movies.get(movieId);
        if(movie==null){
            return;
        }
        System.out.println("Available Seats");

        for(int i=1;i<= movie.getTotalSeats();i++){

            if(!movie.getBookedSeat().contains(i)){
                System.out.println(i+" ");
            }
        }

        System.out.println();
    }


}
