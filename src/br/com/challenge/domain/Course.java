package br.com.challenge.domain;

public class Course {

    private String tittle;
    private String description;
    private int workload;

    public Course() {
    }

    public Course(String tittle, String description, int workload) {
        this.tittle = tittle;
        this.description = description;
        this.workload = workload;
    }

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

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "tittle='" + tittle + '\'' +
                ", description='" + description + '\'' +
                ", workload=" + workload +
                '}';
    }
}
