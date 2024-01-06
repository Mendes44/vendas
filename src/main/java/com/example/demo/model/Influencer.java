package com.example.demo.model;


import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

//Entidade Banco de Dados
@Entity

public class Influencer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    @ElementCollection(targetClass = CategoriaEnum.class, fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "influencer_categories", joinColumns = @JoinColumn(name = "influencer_id"))
    private Set<CategoriaEnum> categories;
    private String userName;
    private Long followers;
    private Long following;
    private Date birthDate;
    private String plataform;

    //Anotação necessaria para gravar mais de 256 bits
    //A melhor forma de gravar arquivos seria utilizando um S3 da AWS por exemplo.
    @Lob
    @Column(columnDefinition = "CLOB") //Referencia a minha coluna no Banco de Dados
    private String profilePicture;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Set<CategoriaEnum> getCategories() {
        return categories;
    }

    public void setCategories(Set<CategoriaEnum> categories) {
        this.categories = categories;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getFollowers() {
        return followers;
    }

    public void setFollowers(Long followers) {
        this.followers = followers;
    }

    public Long getFollowing() {
        return following;
    }

    public void setFollowing(Long following) {
        this.following = following;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getPlataform() {
        return plataform;
    }

    public void setPlataform(String plataform) {
        this.plataform = plataform;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }
}
