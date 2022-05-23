package cr.aao.customvalidator.controller;

import cr.aao.customvalidator.validator.Dato2ObjectValid;

public class DataInputDTO {
    private String dato1;
    @Dato2ObjectValid
    private Dato2Object dato2;

    public String getDato1() {
        return dato1;
    }

    public void setDato1(String dato1) {
        this.dato1 = dato1;
    }

    public Dato2Object getDato2() {
        return dato2;
    }

    public void setDato2(Dato2Object dato2) {
        this.dato2 = dato2;
    }

    @Override
    public String toString() {
        return "DataInputDTO{" +
                "dato1='" + dato1 + '\'' +
                ", dato2=" + dato2 +
                '}';
    }
}
