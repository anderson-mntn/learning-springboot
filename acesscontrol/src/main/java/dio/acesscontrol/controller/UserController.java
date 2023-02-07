package dio.acesscontrol.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.acesscontrol.model.Usuario;
import dio.acesscontrol.repository.UserRepository;

@RestController
@RequestMapping("/users") //centralização do prefixo
public class UserController {
    @Autowired
    private UserRepository repository;
    @GetMapping()
    public List<Usuario> getUsers(){
       return repository.listAll();
    }

    @GetMapping("/{username}") //parametro para achar username do usuario, colocar PathVariable  
    public Usuario getOne(@PathVariable("username") String username) {
        return repository.findByUsername(username);

    }
    
    @DeleteMapping("/{id}") // Agora podemos passar id como parametro para retornar o id do usuario, usar insomnia request delete
    public void delete(@PathVariable("id") Integer id){
        repository.deleteById(id);
    }    

    @PostMapping()
    public void postUser(@RequestBody Usuario usuario){ // add @RequestBody user insomnia
        repository.save(usuario);
    }

}
