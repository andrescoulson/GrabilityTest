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


    public String getName() {
        return name.getName();
    }

    public String getSummary() {
        return summary.getSummary();
    }

    public String getRights() {
        return rights.getRights();
    }

    public String getTitle() {
        return title.getTitle();
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

    class Name {
    @SerializedName("label")
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Summary {
    @SerializedName("label")
    String summary;

    public String getSummary() {
        return summary;
    }
}

class Rights {
    @SerializedName("label")
    String rights;

    public String getRights() {
        return rights;
    }
}

class Title {
    @SerializedName("label")
    String title;

    public String getTitle() {
        return title;
    }

}

class Price {
    @SerializedName("label")
    String price;
    @SerializedName("attributes")
    PriceAtributos priceAtributos;

    public String getPrice() {
        return price;
    }

    public PriceAtributos getPriceAtributos() {
        return priceAtributos;
    }
}

class PriceAtributos {
    @SerializedName("amount")
    String amount;
    @SerializedName("currency")
    String currency;

    public String getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }
}

class ContentType {
    @SerializedName("attributes")
    AttributContentType attributContentType;

    public AttributContentType getAttributContentType() {
        return attributContentType;
    }
}

class AttributContentType {
    @SerializedName("term")
    String term;
    @SerializedName("label")
    String nameAtributo;

    public String getTerm() {
        return term;
    }

    public String getNameAtributo() {
        return nameAtributo;
    }
}

class Link {
    @SerializedName("attributes")
    AtributesLink atributesLink;

    public AtributesLink getAtributesLink() {
        return atributesLink;
    }
}

class AtributesLink {
    @SerializedName("rel")
    String rel;
    @SerializedName("type")
    String tipe;
    @SerializedName("href")
    String href;

    public String getRel() {
        return rel;
    }

    public String getTipe() {
        return tipe;
    }

    public String getHref() {
        return href;
    }
}

class Id {
    @SerializedName("label")
    String label;
    @SerializedName("attributes")
    AtributesId atributesId;

    public String getLabel() {
        return label;
    }

    public AtributesId getAtributesId() {
        return atributesId;
    }
}

class AtributesId {
    @SerializedName("im:id")
    String id;
    @SerializedName("im:bundleId")
    String bundleId;

    public String getId() {
        return id;
    }

    public String getBundleId() {
        return bundleId;
    }
}

class Artist {
    @SerializedName("label")
    String label;
    @SerializedName("attributes")
    AtributesArtist atributesArtist;

    public String getLabel() {
        return label;
    }

    public AtributesArtist getAtributesArtist() {
        return atributesArtist;
    }
}

class AtributesArtist {
    @SerializedName("href")
    String href;

    public String getHref() {
        return href;
    }
}

class Category {
    @SerializedName("attributes")
    AtributesCategory atributesCategory;

    public AtributesCategory getAtributesCategory() {
        return atributesCategory;
    }
}

class AtributesCategory {

    @SerializedName("im:id")
    String id;
    @SerializedName("term")
    String term;
    @SerializedName("scheme")
    String scheme;
    @SerializedName("label")
    String label;

    public String getId() {
        return id;
    }

    public String getTerm() {
        return term;
    }

    public String getScheme() {
        return scheme;
    }

    public String getLabel() {
        return label;
    }
}

class ReleaseDate {
    @SerializedName("label")
    String label;
    @SerializedName("attributes")
    AtributesReleaseDate date;

    public String getLabel() {
        return label;
    }

    public AtributesReleaseDate getDate() {
        return date;
    }
}

class AtributesReleaseDate {
    @SerializedName("label")
    String label;

    public String getLabel() {
        return label;
    }
}

class Image {
    @SerializedName("label")
    String url;
    @SerializedName("attributes")
    AtributesImage atributesImage;

    public String getUrl() {
        return url;
    }

    public AtributesImage getAtributesImage() {
        return atributesImage;
    }
}

class AtributesImage {
    @SerializedName("height")
    String height;

    public String getHeight() {
        return height;
    }
}