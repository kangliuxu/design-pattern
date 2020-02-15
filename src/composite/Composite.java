package composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{
    private String name;

    private List<Component> components = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    public boolean add(Component component){
        return components.add(component);
    }

    public boolean remove(Component component){
        return components.remove(component);
    }

    public Component get(int index){
        return components.get(index);
    }

    @Override
    public void operation() {
        for(Component component: components){
            System.out.println("非叶节点:"+component);
        }
    }

    @Override
    public String toString() {
        return "Composite{" +
                "name='" + name + '\'' +
                '}';
    }
}
