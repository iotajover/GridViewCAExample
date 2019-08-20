package com.example.gridviewcaexample;

public class Item {
    String birdListName;
    int birdListImage;

    public Item(String birdName,int birdImage)
    {
        this.birdListImage=birdImage;
        this.birdListName=birdName;
    }

    public String getbirdName()
    {
        return this.birdListName;
    }

    public int getbirdImage()
    {
        return this.birdListImage;
    }
}
