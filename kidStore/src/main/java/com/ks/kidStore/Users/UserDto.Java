package com.ks.kidStore.Users;

public class UserDto {
    private String pseudo;
    private String email;
    private Long id;

    public UserDto(String pseudo, String email, Long id) {
        this.pseudo = pseudo;
        this.email = email;
        this.id = id;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return password;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
