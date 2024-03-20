package app.model;

import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {
    private final Animal dog;
    private final Animal cat;
    private final Timer timer;

    public AnimalsCage(Animal dog, Animal cat, Timer nanoTime) {
        this.dog = dog;
        this.cat = cat;
        this.timer = nanoTime;
    }


    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(dog.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());
        System.out.println("________________________");
        System.out.println("Say:");
        System.out.println(cat.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());
        System.out.println("________________________");

    }
        public Timer getTimer() {
        return timer;
    }
}
