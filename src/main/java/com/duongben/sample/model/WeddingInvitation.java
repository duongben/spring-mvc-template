package com.duongben.sample.model;

/**
 * This object models an basic invitation to a wedding.
 * 
 * @author duongben
 */
public class WeddingInvitation {
  
    private final InvitationRecipient recipient;
    private final int seatsAllocated; // excludes children

    public WeddingInvitation(InvitationRecipient recipient, int seatsAllocated) {
        this.recipient = recipient;
        this.seatsAllocated = seatsAllocated;
    }

    public InvitationRecipient getRecipient() {
        return recipient;
    }

    public int getSeatsAllocated() {
        return seatsAllocated;
    }

}
