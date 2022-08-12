package br.com.challenge.domain;

public abstract class Content {

    protected static final double DEFAULT_XP = 10d;

    private String tittle;
    private String description;

    public abstract double processXp();

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
