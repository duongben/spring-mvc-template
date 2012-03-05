package com.duongben.sample.model;

/**
 * This object models an electronic address which currently is
 * just a wrapper around a simple string. This might be a good 
 * place to add entity validation, but as-is arguably offers a
 * more fluent API.
 * 
 * @author duongben
 */
public class ElectronicAddress {
    
    private final String email;

    public ElectronicAddress(String email) {
        this.email = email;
    }

    @Override public String toString() {
        return email;
    }
    
}
