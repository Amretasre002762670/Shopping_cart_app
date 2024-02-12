/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.webtools.assignment3_8;

import java.util.ArrayList;

/**
 *
 * @author amretasrerengarajan
 */
public class Item {
    
//    private String item;
//
//    public Item(String item) {
//        this.item = item;
//    }
//    
//
//    public String getItem() {
//        return item;
//    }
//
//    public void setItem(String item) {
//        this.item = item;
//    }
    
    private ArrayList<String> itemList;

    public Item() {
        itemList = new ArrayList<String>();
    }
    
    

    public ArrayList<String> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<String> itemList) {
        this.itemList = itemList;
    }
    
    
    public void addItem (String item) {
        itemList.add(item);
    }
    
    public void removeItem (String item) {
        itemList.remove(item);
    }
    
    public int cartSize() {
        return itemList.size();
    }
    
}
