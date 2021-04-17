package model.Reservation;

import java.util.Date;

import model.client.Client;
import model.room.Room;

public class ReservationImpl implements Reservation {

    private Client client;
    private Room room;
    private Date dateIn;
    private Date dateOut;

    public ReservationImpl(final Client client, final Date dateIn, final Date dateOut, final Room room) {
        this.client = client;
        this.room = room;
        this.dateIn = dateIn;
        this.dateOut = dateOut;
    }


    @Override
    public Client getClient() {
        return this.client;
    }

    @Override
    public Room getRoom() {
        return this.room;
    }

    @Override
    public Date getDateIn() {
       return this.dateIn;
    }

    @Override
    public Date getDateOut() {
       return this.dateOut;
    }

    @Override
    public void setRoom(final Room room) {
        this.room = room;
    }

    @Override
    public void setDateIn(final Date dateIn) {
        this.dateIn = dateIn;
    }

    @Override
    public void setDateOut(final Date dateOut) {
        this.dateOut = dateOut;
    }

    @Override
    public void setClient(final Client client) {
       this.client = client;
    }
}