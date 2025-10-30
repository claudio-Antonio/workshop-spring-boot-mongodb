package com.claudioantonio.workshopmongo.dto;

import com.claudioantonio.workshopmongo.domain.User;

import java.io.Serializable;

/*DTO é um objeto que tem o papel de carregar dados das entidades de forma simples, podendo inclusive "projetar" apenas alguns dados
* da entidade original. Otimiza o trafego porque trafega poucos dados.*/
public class UserDTO implements Serializable {
    private String id;
    private String name;
    private String email;

    public UserDTO() {}

    public UserDTO(User obj) {
        this.id = obj.getId();
        this.name = obj.getName();
        this.email = obj.getEmail();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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
}
