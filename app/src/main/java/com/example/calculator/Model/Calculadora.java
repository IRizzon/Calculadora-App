package com.example.calculator.Model;

public class Calculadora {

    private String Visor;

    public Calculadora(){}

    public String getVisor() { return Visor; }

    public void setVisor(String visor) { this.Visor = visor; }

    @Override
    public String toString() {
        return "Calculadora{" +
                "Visor='" + Visor + '\'' +
                '}';
    }
}
