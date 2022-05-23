package cr.aao.customvalidator.controller;

public class Dato2Object {
    private String id;
    private String dato2Campo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDato2Campo() {
        return dato2Campo;
    }

    public void setDato2Campo(String dato2Campo) {
        this.dato2Campo = dato2Campo;
    }

    @Override
    public String toString() {
        return "Dato2Object{" +
                "id='" + id + '\'' +
                ", dato2Campo='" + dato2Campo + '\'' +
                '}';
    }
}
