package com.acoulson.grabilitytest.Entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by acoulson on 11/01/17.
 */

public class AppEntity {

    @SerializedName("im:name")
    Name name;
    @SerializedName("summary")
    Summary summary;
    @SerializedName("rights")
    Rights rights;
    @SerializedName("title")
    Title title;
    @SerializedName("im:image")
    List<Image> images;
    @SerializedName("im:contentType")
    ContentType contentType;
    @SerializedName("link")
    Link link;
    @SerializedName("id")
    Id id;
    @SerializedName("im:artist")
    Artist artist;
    @SerializedName("category")
    Category category;
    @SerializedName("im:releaseDate")
    ReleaseDate releaseDate;
    @SerializedName("im:price")
    Price price;

    public Price getPrice() {
        return price;
    }

    public Name getName() {
        return name;
    }

    public Summary getSummary() {
        return summary;
    }

    public Rights getRights() {
        return rights;
    }

    public Title getTitle() {
        return title;
    }

    public List<Image> getImages() {
        return images;
    }

    public ContentType getContentType() {
        return contentType;
    }

    public Link getLink() {
        return link;
    }

    public Id getId() {
        return id;
    }

    public Artist getArtist() {
        return artist;
    }

    public Category getCategory() {
        return category;
    }

    public ReleaseDate getReleaseDate() {
        return releaseDate;
    }
}

