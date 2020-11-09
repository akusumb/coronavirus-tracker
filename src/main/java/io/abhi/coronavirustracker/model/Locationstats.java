package io.abhi.coronavirustracker.model;

public class Locationstats {

    private String state;
    private String country;
    private int latestTotalCases;
    private int diffFromprevDay;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLatestTotalCases() {
        return latestTotalCases;
    }

    public void setLatestTotalCases(int latestTotalCases) {
        this.latestTotalCases = latestTotalCases;
    }

    public int getDiffFromprevDay() {
        return diffFromprevDay;
    }

    public void setDiffFromprevDay(int diffFromprevDay) {
        this.diffFromprevDay = diffFromprevDay;
    }

    @Override
    public String toString() {
        return "Locationstats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", latestTotalCases=" + latestTotalCases +
                '}';
    }
}
