package fit.PROJETOSPRING.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Rota mapeada
@RestController
//Path padrao
@RequestMapping("/imc")
public class ImcController {
   
    //Rota mapeada por GET
    @PostMapping("/calculaImc")   
    public DadosImc calculaIMC(@RequestBody DadosImc dados){
        var valorImc = dados.getPeso()/ Math.pow(dados.getAltura(),2);

        var descricao = "";
        if(valorImc< 18.5)  descricao = "magreza";
        if(valorImc< 24.9)  descricao = "normal";
        if(valorImc< 30)  descricao = "sobrepeso";
        if(valorImc>= 30)  descricao = "obeso";
        
        dados.setImc(valorImc);
        dados.setImcDescricao(descricao);
        
        
        return dados;  
    }       
   
}
