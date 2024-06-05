/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dragonball;

/**
 *
 * @author Amanda Cardoso
 */
public class Principal {

    public static void main(String[] args) {

}

abstract class Principal {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected String temporada;
    protected int ki;
    protected String poderEspecial;

    public abstract int calcularPoder();

    @Override
    public String toString() {
        return "PersonagemDragonBall{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                ", temporada='" + temporada + '\'' +
                ", ki=" + ki +
                ", poderEspecial='" + poderEspecial + '\'' +
                '}';
    }
}
}

