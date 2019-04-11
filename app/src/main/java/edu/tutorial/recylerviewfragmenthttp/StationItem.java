package edu.tutorial.recylerviewfragmenthttp;

public class StationItem {
    private String title;
    private String urlimages;
    private String profiles;

    public StationItem(String title, String urlimages, String profiles) {
        this.title = title;
        this.urlimages = urlimages;
        this.profiles = profiles;

    }

    public String getTitle() {
        return title;
    }

    public String getUrlimages() {
        return urlimages;
    }

    public String getProfiles() {
        return profiles;
    }


}
