package ashraf.movieticket;

public class MAin {
    public static void main(String[] args) {
                MovieService service=new MovieService();
        service.addMovie(101, "Gadar", 10);

        service.bookSeat(101, 1);
//        service.bookSeat(102, 2);
        service.bookSeat(101,5);

        service.availableSeats(101);

        service.cancellSeat(101,1);

        service.availableSeats(101);
    }
}
