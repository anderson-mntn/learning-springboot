package dio.firstproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component 
public class MyApp implements CommandLineRunner {
    @Autowired
    private Calculadora calculadora;
    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub
        System.out.println(calculadora.somar(2, 5));
    }
    
}
