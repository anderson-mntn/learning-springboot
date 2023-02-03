package dio.configurationpropertieslesson.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem implements CommandLineRunner {
    @Autowired
    private Remetente remetente;

    @Override
    public void run(String... args) throws Exception {
        
        System.out.println("\n Mensagem Enviada por: " + remetente.getName() + 
        "\n Email: " + remetente.getEmail() + 
        "\n Telefone de contato: " + remetente.getPhone());
    }
    
}
