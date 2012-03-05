package com.duongben.sample.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * This object very loosely models a street address; it
 * provides just enough structure to print address labels.
 * 
 * @author duongben
 */
public class StreetAddress {

    private final List<String> lines;

    public StreetAddress() {
        this.lines = new ArrayList<String>();
    }
    
    public StreetAddress addLine(String line){
        lines.add(line);
        return this;
    }
    
    public Iterator<String> getLineIterator(){
        return lines.iterator();
    }
    
    @Override public String toString() {
        StringBuilder builder = new StringBuilder();
        for(String line : lines){
            builder.append(line).append("\n");
        }
        return builder.toString();
    }
}
