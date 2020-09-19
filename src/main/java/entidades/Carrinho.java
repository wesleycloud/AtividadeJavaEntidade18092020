package entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Carrinho {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCarrinho;
	
	private double valortotal = 0;
	
	@OneToMany
	private List<Produto> produtos = new ArrayList();
	
	@OneToOne
	private Cliente cliente;

	public Carrinho(int idCarrinho, Cliente cliente) {
		this.idCarrinho = idCarrinho;
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public int getIdCarrinho() {
		return idCarrinho;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public double getValortotal() {
		return valortotal;
	}

	public void addProduto(Produto p) {
		produtos.add(p);
		valortotal += p.getValorProduto();

	}
}