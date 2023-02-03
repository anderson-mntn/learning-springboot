package dio;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import dio.app.SistemaMensagem;

//import no sis men

@SpringBootApplication
public class RemetenteApplication {
	public static void main(String[] args) { SpringApplication.run(RemetenteApplication.class, args);}
	@Bean
	public CommandLineRunner run(SistemaMensagem sistema) throws Exception{
		return args -> {
			sistema.enviarConfirmacaoCadastro();
			sistema.enviarMensagemBoasVindas();
            sistema.enviarConfirmacaoCadastro();
		};
	}

}