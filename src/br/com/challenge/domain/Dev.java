package br.com.challenge.domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String name;
    private Set<Content> subscribeContent = new LinkedHashSet<>();
    private Set<Content> finishedContent = new LinkedHashSet<>();

    public void subscribeBootcamp(Bootcamp bootcamp){
        this.subscribeContent.addAll(bootcamp.getContents());
        bootcamp.getDevsSubscribed().add(this);
    }

    public void incrementProgress(){
        Optional<Content> content = this.subscribeContent.stream().findFirst();

        if(content.isPresent()){
            this.finishedContent.add(content.get());
            this.subscribeContent.remove(content.get());
            return;
        }

        System.err.println("You isn't subscribed on any content!");
    }

    public double calcTotalXp(){
        return this.finishedContent.stream().mapToDouble(Content::processXp).sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getSubscribeContent() {
        return subscribeContent;
    }

    public void setSubscribeContent(Set<Content> subscribeContent) {
        this.subscribeContent = subscribeContent;
    }

    public Set<Content> getFinishedContent() {
        return finishedContent;
    }

    public void setFinishedContent(Set<Content> finishedContent) {
        this.finishedContent = finishedContent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(subscribeContent, dev.subscribeContent) && Objects.equals(finishedContent, dev.finishedContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subscribeContent, finishedContent);
    }
}
