package sapcy.jvmmemory.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Burger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String name;
    int patty;
    int onions;
    int sauce;
    int bacon;

    public Burger(String name, int patty, int onions, int sauce, int bacon) {
        this.name = name;
        this.patty = patty;
        this.onions = onions;
        this.sauce = sauce;
        this.bacon = bacon;
    }

    public Burger() {

    }
}
