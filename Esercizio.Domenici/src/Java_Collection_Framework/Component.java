package Java_Collection_Framework;

import java.util.ArrayList;
import java.util.List;

enum Type {CPU, BOARD, RAM;}

public class Component {
    private Type type;
    private String description;
    private List <Component> incompatibleComponents;
    
    public Component(Type type, String description){
        this.type = type;
        this.description = description;
        this.incompatibleComponents = new ArrayList<>();
    }

    public void setIncompatible(Component othercComponent){
        incompatibleComponents.add(othercComponent);
    }

    public boolean isCompatiblewith(Component otherComponent){
        return !incompatibleComponents.contains(otherComponent) && this.type != otherComponent.type;
    }

    public Type getType(){
        return type;
    }

    public String getDescription(){
        return description;
    }
}
