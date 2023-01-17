package com.alex.dockerpostgresflywaydemo.domain;

import javax.persistence.*;

@Entity
@Table(name = "languages")
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "year_established")
    private Integer yearEstablished;

    @Column(name = "designer")
    private String designer;

    public Language() {}

    public Language(String name, Integer yearEstablished, String designer) {
        this.name = name;
        this.yearEstablished = yearEstablished;
        this.designer = designer;
    }

}
