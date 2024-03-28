package br.com.tgabriel.domain;
import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "TB_MATRICULA")
public class Matricula {

@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "matri_seq")
@SequenceGenerator(name = "matri_seq", sequenceName = "sq_matri", initialValue = 1, allocationSize = 1)
private Long id;
    @Column(name = "CODIGO", length = 10, nullable = false, unique = true)
    private String codigo;

    @Column(name = "DATA_MATRICULA")
    private Instant dataMatricula;

    @Column(name = "VALOR")
    private Double valor;

    @Column(name = "STATUS")
    private String ststus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Instant getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Instant dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getStstus() {
        return ststus;
    }

    public void setStstus(String ststus) {
        this.ststus = ststus;
    }
}
