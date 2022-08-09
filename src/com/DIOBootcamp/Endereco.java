package com.DIOBootcamp;

public class Endereco {

    public enum TipoEndereco {
        RESIDENCIAL,
        ENTREGA,
        TRABALHO
    }

    public String endereco;
    public String nuero;
    public String complemento;
    public String bairro;
    public String estado;
    public String cep;
}
