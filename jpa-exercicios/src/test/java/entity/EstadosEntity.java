package entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "estados", schema = "wmcarol", catalog = "")
public class EstadosEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Object id;
    @Basic
    @Column(name = "nome")
    private String nome;
    @Basic
    @Column(name = "sigla")
    private String sigla;
    @Basic
    @Column(name = "regiao")
    private Object regiao;
    @Basic
    @Column(name = "populacao")
    private BigDecimal populacao;

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Object getRegiao() {
        return regiao;
    }

    public void setRegiao(Object regiao) {
        this.regiao = regiao;
    }

    public BigDecimal getPopulacao() {
        return populacao;
    }

    public void setPopulacao(BigDecimal populacao) {
        this.populacao = populacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EstadosEntity that = (EstadosEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (nome != null ? !nome.equals(that.nome) : that.nome != null) return false;
        if (sigla != null ? !sigla.equals(that.sigla) : that.sigla != null) return false;
        if (regiao != null ? !regiao.equals(that.regiao) : that.regiao != null) return false;
        if (populacao != null ? !populacao.equals(that.populacao) : that.populacao != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (sigla != null ? sigla.hashCode() : 0);
        result = 31 * result + (regiao != null ? regiao.hashCode() : 0);
        result = 31 * result + (populacao != null ? populacao.hashCode() : 0);
        return result;
    }
}
