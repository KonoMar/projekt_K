package pl.dmcs.projektkompetencyjny.domain;



public class Quest {

    private String description;

    public Quest() {
        this.description = "Uratuj księżniczkę!";
    }

    @Override
    public String toString() {
        return description;
    }
}
