package Materia.models;

public class Persona {
    
    private String name;

    public Persona(String string) {
        this.name = string;
    }  

    @Override
    public String toString() {
        return name;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }
}
