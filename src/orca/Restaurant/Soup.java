package orca.Restaurant;

public abstract class Soup extends Restaurant {

    Soup soup;

    public Soup(Soup soup) {
        this.soup = soup;
    }

    @Override
    public void order() {
        super.order();
        soup.order();
    }
}
