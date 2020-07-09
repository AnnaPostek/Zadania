package Cabrio;

public class Cabrio {
    private String name;
    private String mark;
    private boolean moveIn;
    private boolean openRoof;

    public Cabrio(String name, String mark) {
        this.name = name;
        this.mark = mark;
    }


    public boolean isMoveIn() {
        return moveIn;
    }

    public void setMoveIn(boolean moveIn) {
        this.moveIn = moveIn;
    }

    public boolean isOpenRoof() {
        return openRoof;
    }

    public void setOpenRoof(boolean openRoof) {
        if(moveIn)
        {
            System.out.println("Nie mozesz otwierać ani składać dachu podczas jazdy!");
        } else {
            this.openRoof=openRoof;
        };
    }



}
