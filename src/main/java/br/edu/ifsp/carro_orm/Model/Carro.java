package main.java.br.edu.ifsp.carro_orm.Model;

@Entity // tabela no sql
public class Carro {

    @Id // chave primária
    @GeneratedValue(strategy = GenerationType.AUTO) // chave primária gerada automaticamente
    private Long id;
    private String nome;
    private String cor;

    public Carro() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Carro(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
