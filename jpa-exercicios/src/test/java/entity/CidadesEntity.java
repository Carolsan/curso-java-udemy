package entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "cidades", schema = "wmcarol", catalog = "")
public class CidadesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Object id;
    @Basic
    @Column(name = "nome")
    private String nome;
    @Basic
    @Column(name = "estado_id")
    private Object estadoId;
    @Basic
    @Column(name = "area")
    private BigDecimal area;

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

    public Object getEstadoId() {
        return estadoId;
    }

    public void setEstadoId(Object estadoId) {
        this.estadoId = estadoId;
    }

    public BigDecimal getArea() {
        return area;
    }

    public void setArea(BigDecimal area) {
        this.area = area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CidadesEntity that = (CidadesEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (nome != null ? !nome.equals(that.nome) : that.nome != null) return false;
        if (estadoId != null ? !estadoId.equals(that.estadoId) : that.estadoId != null) return false;
        if (area != null ? !area.equals(that.area) : that.area != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (estadoId != null ? estadoId.hashCode() : 0);
        result = 31 * result + (area != null ? area.hashCode() : 0);
        return result;
    }
}
