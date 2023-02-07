package dio.acesscontrol.repository;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Repository;

import dio.acesscontrol.model.Usuario;

@Repository //Estudar os outros
public class UserRepository {
    public void save (Usuario usuario){
        if (usuario.getId()==null)
        System.out.println("SAVE - recebendo o usuário na camada de repositório");
        else
        System.out.println("UPDATE - Recebendo usuario na camada de reposiótiro");

        System.out.println(usuario);
    }
    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }
    public List<Usuario> listAll(){
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("gleyson", "password1", 0));
        usuarios.add(new Usuario("anderson", "masterpass2", 1));
        usuarios.add(new Usuario("maria", "quadrado123", 2));
        return usuarios;
    }
    public Usuario findById(Integer id){
        System.out.println(String.format("GET/id - Recebendo o id: %d para localizar um usuário", id));
        return new Usuario("gleys", "senha do findById", null);
    }
    public Usuario findByUsername(String username){
        System.out.println(String.format("FIND/username - Recebendo o username: %s para localizar um usuário", username));
        return new Usuario(username, "password", null ); 
    }
}
