package entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Compra {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCompra;
	private int totalValores = 0;
	
	@OneToMany
	private List<Carrinho> carrinhos = new ArrayList();

	public Compra(int idCompra) {
		this.idCompra = idCompra;
	}

	public int getIdCompra() {
		return idCompra;
	}

	public int getTotalValores() {
		return totalValores;
	}

	public List<Carrinho> getCarrinhos() {
		return carrinhos;
	}

	public void addCarrinho(Carrinho p) {
		carrinhos.add(p);
		totalValores += p.getValortotal();
	}
}