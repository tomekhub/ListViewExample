package pl.devant.myapplication.model;

/**
 * Created by thomas on 03.03.18.
 */

public class Data{
    public Data(String name, String description, String label, String rating, String distance, String image) {
        this.name = name;
        this.description = description;
        this.label = label;
        this.rating = rating;
        this.distance = distance;
        this.image = image;
    }

    String name;
    String description = null;
    String label = null;
    String rating = null;
    String distance = null;
    String image = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
