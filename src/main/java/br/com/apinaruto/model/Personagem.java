package br.com.apinaruto.model;

import jakarta.persistence.*;

@Entity
@Table(name = "personagem")
public class Personagem {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cla;
    private String estilo;
    private String patente;
    private String avatar;

    private Integer idade;

    public Personagem(DadosCadastroPersonagem dados) {
        this.nome = dados.nome();
        this.cla = dados.cla();
        this.estilo = dados.estilo();
        this.patente = dados.patente();
        this.avatar = dados.avatar();
        this.idade = dados.idade();
    }

    public Personagem() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCla() {
        return cla;
    }

    public void setCla(String cla) {
        this.cla = cla;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cla='" + cla + '\'' +
                ", estilo='" + estilo + '\'' +
                ", patente='" + patente + '\'' +
                ", avatar='" + avatar + '\'' +
                '}';
    }

    public Integer getIdade() {
        return idade;
    }
}
