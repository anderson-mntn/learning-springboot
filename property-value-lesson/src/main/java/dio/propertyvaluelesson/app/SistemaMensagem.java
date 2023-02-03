package dio.propertyvaluelesson.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class SistemaMensagem implements CommandLineRunner{
    //Obtendo de forma interativa com meu container:
    //Iremos em resources > application.properties e colocaremos as informações lá.
    @Value("${name:Default-Name-Value}") //Se estiver errado/não existir name retorna o conteudo após os 2 pontos.
    private String name;
    @Value("${email}") 
    private String email;
    @Value("${phone}")
    private List<Long>phone;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("SistemaMensagem [name=" + name + 
        ", email=" + email +
         ", phone=" + phone + "]");
         System.out.println("Registration Successful!");
    }

    
    
}
