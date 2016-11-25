package com.acoulson.grabilitytest.Entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by acoulson on 27/04/16.
 */
public class AppC {

    String name, summary, price, contentType, derechos, title, link, artist, category, daterelease;
    List<String> thumbnails;

    public AppC(String name, String summary, String price, String contentType, String derechos, String title, String link, String artist, String category, String daterelease, List<String> thumbnails) {
        this.name = name;
        this.summary = summary;
        this.price = price;
        this.contentType = contentType;
        this.derechos = derechos;
        this.title = title;
        this.link = link;
        this.artist = artist;
        this.category = category;
        this.daterelease = daterelease;
        this.thumbnails = thumbnails;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getDerechos() {
        return derechos;
    }

    public void setDerechos(String derechos) {
        this.derechos = derechos;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDaterelease() {
        return daterelease;
    }

    public void setDaterelease(String daterelease) {
        this.daterelease = daterelease;
    }

    public List<String> getThumbnails() {
        return thumbnails;
    }

    public void setThumbnails(List<String> thumbnails) {
        this.thumbnails = thumbnails;
    }
}
