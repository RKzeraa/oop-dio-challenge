package br.com.dio.challenge.domain;


public class Course extends Contents {

    private int hourlyLoad;

    public Course() {
    }

    @Override
    public double calculateXp() {
        return XP_DEFAULT * hourlyLoad;
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
               "title=" + getTitle() + '\'' +
               ", description='" + getDescription() + '\'' +
               ", hourlyLoad=" + hourlyLoad +
               '}';
    }
}
