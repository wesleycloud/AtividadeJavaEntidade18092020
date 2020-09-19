package entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Entrega {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEntrega;
	private String DataPrevista;
	
	@OneToOne
	private Compra compra;

	public Entrega(int idEntrega, String dataPrevista,Compra compra) {
		super();
		this.idEntrega = idEntrega;
		DataPrevista = dataPrevista;
		compra = compra;
	}

	public int getIdEntrega() {
		return idEntrega;
	}

	public String getDataPrevista() {
		return DataPrevista;
	}

	public Compra getCompra() {
		return compra;
	}

}
