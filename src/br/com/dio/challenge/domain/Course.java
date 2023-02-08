package br.com.dio.challenge.domain;


public class Course {
    private String title;
    private String description;
    private int hourlyLoad;

    public Course() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHourlyLoad() {
        return hourlyLoad;
    }

    public void setHourlyLoad(int hourlyLoad) {
        this.hourlyLoad = hourlyLoad;
    }

    @Override
    public String toString() {
       return "Course{" +
               "title=" + title + '\'' +
               ", description='" + description + '\'' +
               ", hourlyLoad=" + hourlyLoad +
               '}';
    }
}