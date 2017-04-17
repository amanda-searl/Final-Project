package com.neu.jan17.data;

import java.util.*;

public class SortInventory {
    ArrayList<Vehicle> arr;

    public void sortVehiclesByYear(Inventory inventory) {
        arr = new ArrayList<Vehicle>(inventory.getVehicles());
        Collections.sort(arr, (o1, o2) -> (o1.getYear()).compareTo(o2.getYear()));
        inventory.setVehicles(arr);
    }

    public void sortVehiclesByModel(Inventory inventory){
        arr = new ArrayList<Vehicle>(inventory.getVehicles());
        Collections.sort(arr, (o1, o2) -> (o1.getModel()).compareTo(o2.getModel()));
        inventory.setVehicles(arr);
    }

    public void sortVehiclesByCategory(Inventory inventory){
        arr = new ArrayList<Vehicle>(inventory.getVehicles());
        Collections.sort(arr, (o1, o2) -> (o1.getCategory()).compareTo(o2.getCategory()));
        inventory.setVehicles(arr);
    }

    public void sortVehiclesByPrice(Inventory inventory){
        arr = new ArrayList<Vehicle>(inventory.getVehicles());
        Collections.sort(arr, (o1, o2) -> (o1.getPrice()).compareTo(o2.getPrice()));
        inventory.setVehicles(arr);
    }

    public void sortVehiclesByMake(Inventory inventory){
        arr = new ArrayList<Vehicle>(inventory.getVehicles());
        Collections.sort(arr, (o1, o2) -> (o1.getMake()).compareTo(o2.getMake()));
        inventory.setVehicles(arr);
    }

    public void sortVehiclesById(Inventory inventory){
        arr = new ArrayList<Vehicle>(inventory.getVehicles());
        Collections.sort(arr, (o1, o2) -> (o1.getId()).compareTo(o2.getId()));
        inventory.setVehicles(arr);
    }

    public void sortVehiclesByTrim(Inventory inventory){
        arr = new ArrayList<Vehicle>(inventory.getVehicles());
        Collections.sort(arr, (o1, o2) -> (o1.getTrim()).compareTo(o2.getTrim()));
        inventory.setVehicles(arr);
    }

    public void sortVehiclesByBodyType(Inventory inventory){
        arr = new ArrayList<Vehicle>(inventory.getVehicles());
        Collections.sort(arr, (o1, o2) -> (o1.getBodyType()).compareTo(o2.getBodyType()));
        inventory.setVehicles(arr);
    }

    public void sortVehiclesByWebId(Inventory inventory){
        arr = new ArrayList<Vehicle>(inventory.getVehicles());
        Collections.sort(arr, (o1, o2) -> (o1.getWebId()).compareTo(o2.getWebId()));
        inventory.setVehicles(arr);
    }
}
