package com.duongben.sample.model;

/**
 * This object models a guest (a.k.a. a mouth to feed) at a guest table.
 * 
 * @see GuestTable
 * @author duongben
 */
public class HungryGuest {
  
    private final String guestName;
    private final MealChoice mealChoice;

    public HungryGuest(String guestName, MealChoice mealChoice) {
        this.guestName = guestName;
        this.mealChoice = mealChoice;
    }

    public String getGuestName() {
        return guestName;
    }

    public MealChoice getMealChoice() {
        return mealChoice;
    }
}
