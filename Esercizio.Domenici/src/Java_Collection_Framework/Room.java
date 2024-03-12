package Java_Collection_Framework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Room {
    private List<Reservation> reservations;

    public Room() {
        reservations = new ArrayList<>();
    }

    public Reservation reserve(String name, int startDate, int endDate) throws Exception {
        for (Reservation reservation : reservations) {
            if (startDate < reservation.getEndDate() && endDate > reservation.getStartDate()) {
                throw new Exception("Camera già prenotata");
            }
        }

        Reservation newReservation = new Reservation(name, startDate, endDate);
        reservations.add(newReservation);
        return newReservation;
    }

    class ReservationComparator implements Comparator<Reservation> {
        public int compare(Reservation r1, Reservation r2) {
            if (r1.getStartDate() < r2.getStartDate()) {
                return -1;
            } else if (r1.getStartDate() > r2.getStartDate()) {
                return 1;
            } else {
                return 0;
            }
        }
    }
    
    public List<Reservation> reservations() {
        reservations.sort(new ReservationComparator());
        return reservations;
    }
    
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Room r = new Room();
        try {
            Reservation p1 = r.reserve("Pasquale Cafiero", 105, 120);
            Reservation p2 = r.reserve("Carlo Martello", 5, 20);
            Reservation p3 = r.reserve("Piero", 20, 22);
            Reservation p4 = r.reserve("Marinella", 200, 222);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        for (Reservation p : r.reservations()) {
            System.out.println(p.getName());
        }
    }
}