package dio.configurationpropertieslesson.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

//Adicionamos @Configuration,
// e suas as propriedades que quer obter as infos com : @ConfigurationProperties
@Configuration
@ConfigurationProperties(prefix="remetente")
public class Remetente {
    @Value(value = "")
    private String name;
    private String email;
    private List<Long> phone;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public List<Long> getPhone() {
        return phone;
    }
    public void setPhone(List<Long> phone) {
        this.phone = phone;
    }
    
}
