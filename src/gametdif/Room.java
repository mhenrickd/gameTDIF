package gametdif;

import java.util.ArrayList;
import java.util.Map;

public class Room {
    private String description;
    private boolean islocked;
    private ArrayList<Item> items;
    private Map<String,Room> exits;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isIslocked() {
        return islocked;
    }

    public void setIslocked(boolean islocked) {
        this.islocked = islocked;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public Map<String, Room> getExits() {
        return exits;
    }

    public void setExits(Map<String, Room> exits) {
        this.exits = exits;
    }
    
    public void openDoor(){
        setIslocked(false);
    }
    
    
}
