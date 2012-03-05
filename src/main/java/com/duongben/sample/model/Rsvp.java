package com.duongben.sample.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This object models a response to a wedding invitation.
 * 
 * @see WeddingInvitation
 * @author duongben
 */
public class Rsvp {

    private final WeddingInvitation inReplyTo;
    private final List<HungryGuest> guests;

    public Rsvp(WeddingInvitation inReplyTo) {
        this.inReplyTo = inReplyTo;
        this.guests = new ArrayList<HungryGuest>(inReplyTo.getSeatsAllocated());
    }

    public WeddingInvitation getInvitation() {
        return inReplyTo;
    }

    public Rsvp addGuest(HungryGuest guest) {
        guests.add(guest);
        return this;
    }

    public List<HungryGuest> getGuestList() {
        return Collections.unmodifiableList(guests);
    }

}
