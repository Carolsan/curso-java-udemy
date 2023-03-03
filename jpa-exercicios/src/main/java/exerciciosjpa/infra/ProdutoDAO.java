package exerciciosjpa.infra;


import exerciciosjpa.basico.Produto;

public class ProdutoDAO extends DAO<Produto>{

    public ProdutoDAO() {
        super(Produto.class);
    }

}
