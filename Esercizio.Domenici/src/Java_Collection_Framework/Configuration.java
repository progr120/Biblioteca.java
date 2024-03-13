package Java_Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Configuration {
    private List<Component> components;

    public Configuration() {
        this.components = new ArrayList<>();
    }

    public boolean add(Component component) {
        for (Component existingComponent : components) {
            if (!component.isCompatiblewith(existingComponent) || component.getType() == existingComponent.getType()) {
                return false;
            }
        }
        components.add(component);
        return true;
    }
}

class Main {
    public static void main(String[] args) {
        Component cpu1 = new Component(Type.CPU, "Ryzen 5 2600"),
                cpu2 = new Component(Type.CPU, "Core i5 7500"),
                board1 = new Component(Type.BOARD, "Prime X470"),
                board2 = new Component(Type.BOARD, "Prime Z370"),
                ram = new Component(Type.RAM, "DDR4 8GB");

        board2.setIncompatible(cpu1);
        board1.setIncompatible(cpu2);

        Configuration pc = new Configuration();
        System.out.println(pc.add(cpu1)); // true
        System.out.println(pc.add(cpu2)); // false
        System.out.println(pc.add(board2)); // false
        System.out.println(pc.add(board1)); // true
        System.out.println(pc.add(ram)); // true
    }
}