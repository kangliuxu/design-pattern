package composite;

public class Leaf implements Component{
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("叶节点:"+this);
    }

    @Override
    public String toString() {
        return "Leaf{" +
                "name='" + name + '\'' +
                '}';
    }
}
