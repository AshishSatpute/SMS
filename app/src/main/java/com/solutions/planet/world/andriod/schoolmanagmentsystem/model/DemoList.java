package com.solutions.planet.world.andriod.schoolmanagmentsystem.model;

public class DemoList {
    String name;

    public DemoList(String name, String imageurl) {
        this.name = name;
        this.imageurl = imageurl;
    }

    String imageurl;


    @Override
    public String toString() {
        return "DemoList{" +
                "name='" + name + '\'' +
                ", imageurl='" + imageurl + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }


}
