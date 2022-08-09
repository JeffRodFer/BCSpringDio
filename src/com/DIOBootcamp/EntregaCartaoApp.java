package com.DIOBootcamp;

import java.util.ArrayList;
import com.DIOBootcamp.Cliente;
import com.DIOBootcamp.Endereco;

public class EntregaCartaoApp {

    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.cep = "";
        // Dados do endereco

        Cliente cliente = new Cliente();
        //Dados do cliente

        try{
            cliente.adicionaEndereco(endereco);
            System.out.println("Endereco adicionado com sucesso!");
        } catch (Exception e){
            System.err.println("Houve erro ao add o endereco: " + e.getMessage());
        }
    }
}
