package org.example;

import org.example.dto.EnderecoDTO;
import org.example.servico.ApiServico;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        ApiServico apiServico = new ApiServico();



        try{
        //System.out.println(apiServico.getEndereco("03107040"));
            EnderecoDTO enderecoDTO = apiServico.getEndereco("78110420");
            System.out.println(enderecoDTO.getLogradouro());
        }catch (IOException | InterruptedException e){
           throw new RuntimeException(e);
       }
    }
}