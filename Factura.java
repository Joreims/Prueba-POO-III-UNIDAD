package Factura;


/**
 * @author jegar
 * @version 1.0
 * @created 22-nov.-2022 15:47:23
 */
public class Factura {

	private int codigo;
	private String fecha;
	private Producto m_Producto;
	private Vendedor m_Vendedor;
	private Cliente m_Cliente;

	public Factura(){

	}

	public void finalize(){

	}

	public Vendedor(){

	}

	/**
	 * 
	 * @param Producto
	 */
	public double calcTotal(List<Producto> Producto){
		return 0;
	}

	/**
	 * 
	 * @param double
	 */
	public double aplicarIVA(double, double double){
		return 0;
	}

	/**
	 * 
	 * @param double
	 */
	public double calcMonto(double, double double){
		return 0;
	}
}//end Factura