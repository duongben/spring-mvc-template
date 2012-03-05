package com.duongben.sample.model;

/**
 * This object models addressing needed to deliver an Invitation.
 * 
 * @see WeddingInvitation
 * @author duongben
 */
public class InvitationRecipient {

    private final String nameOfParty; // could be a family name or an individual.
    private final StreetAddress smail;
    private final ElectronicAddress email;

    public InvitationRecipient(String nameOfParty, StreetAddress smail, ElectronicAddress email) {
        this.nameOfParty = nameOfParty;
        this.smail = smail;
        this.email = email;
    }

    public InvitationRecipient(String nameOfParty, StreetAddress smail) {
        this(nameOfParty, smail, null);
    }

    public InvitationRecipient(String nameOfParty, ElectronicAddress email) {
        this(nameOfParty, null, email);
    }

    public String getRecipientName() {
        return nameOfParty;
    }

    public StreetAddress getPostalAddress() {
        return smail;
    }

    public ElectronicAddress getElectronicAddress() {
        return email;
    }
}
