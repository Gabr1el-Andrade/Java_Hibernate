package br.com.tgabriel.atividade;

import javax.persistence.*;

@Entity
@Table(name = "TB_PRODUTO")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prod_seq")
    @SequenceGenerator(name = "prod_seq", sequenceName = "sq_prod", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "CODIGO", length = 5, nullable = false, unique = true)
    private String codigo;

    @Column(name = "nome", length = 20, nullable = false)
    private String nome;

    @Column(name = "VALOR", length = 100, nullable = false)
    private String valor;

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
