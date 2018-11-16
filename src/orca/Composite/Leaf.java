package orca.Composite;

public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        System.out.println("Leaf cant add component");
    }

    @Override
    public void remove(Component component) {

        System.out.println("Leaf cant remove component");
    }

    @Override
    public void display(int depth) {
        super.display(depth);
    }
}
