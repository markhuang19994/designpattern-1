package orca.ObserverPodcast;

public class Test {
    @org.junit.jupiter.api.Test
    public void test(){
        IObserverable podcast = new PodcastA();
        IObserver student = new Student(podcast);
        podcast.add(student);

        podcast.notifyObservers();

        ((PodcastA) podcast).name = "今年流行歌";

        podcast.notifyObservers();
    }
}
