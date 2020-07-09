package Cabrio;

public class Main {
    public static void main(String[] args) {
        Cabrio cabrio= new Cabrio("Seat", "Ibiza");
        cabrio.setOpenRoof(true);
        System.out.printf("Status samochodu w ruchu %s, Dach otwarty %s\n", cabrio.isMoveIn(), cabrio.isOpenRoof());
        cabrio.setMoveIn(true);
        cabrio.setOpenRoof(false);
        System.out.printf("Status samochodu w ruchu %s, Dach otwarty %s\n", cabrio.isMoveIn(), cabrio.isOpenRoof());
    }
}
