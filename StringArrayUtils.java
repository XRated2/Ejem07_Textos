import java.util.*;

/**
 * Clase con m�todos de utilidad sobre Arrays de cadenas de caracteres
 * 
 * @author Carlos Garc�a. Autentia Real Business Solutions.
 * @see http://www.mobiletest.es
 */
public class StringArrayUtils {
	// Atributos de la clase
	private ArrayList<String> elements;

	/**
	 * Constructor
	 */
	public StringArrayUtils(String[] data) {
		// Verificamos que la lista tenga valores
		if ((data == null) || (data.length == 0))
			throw new IllegalArgumentException();
		this.elements = new ArrayList<String>();
		for (String element : data) {
			elements.add(element);
		}
	}

	/**
	 * @return Devuelve la cadena que tiene m�s caracteres
	 */
	public String getMaxLength() {
		String max = "";
		for (String element : elements) {
			if (element.length() > max.length()) {
				max = element;
			}
		}
		return max;
	}

	/**
	 * @return Devuelve la suma de la longitud de todas las cadenas
	 */
	public int getTotalLength() {
		int total = 0;
		for (String d : elements) {
			total += d.length();
		}
		return total;
	}

	/**
	 * @param searched
	 *            Cadena buscada
	 * @return Devuelve la posici�n de un elemento dentro del array
	 * @throws java.util.NoSuchElementException
	 *             Si el elemento no existe en la lista
	 */
	public int getIndexOf(String searched)
			throws java.util.NoSuchElementException {
		int pos = 0;
		// Comprobamos que el argumento sea v�lido
		if (searched == null) {
			throw new IllegalArgumentException();
		}
		// Recorremos la informaci�n hasta encontrar el elemento
		for (String d : elements) {
			if (d.equals(searched)) {
				return pos;
			}
			pos++;
		}
		// El elemento no existia, lanzamos la excepci�n
		throw new java.util.NoSuchElementException(searched);
	}
	
	
	public static void main(String args[])
	{
		StringArrayUtils pruebas=new StringArrayUtils(new String[] {"casa","perro","cocina"});
		System.out.println("perro est� en :"+pruebas.getIndexOf("perro"));
		System.out.println("la palabra m�s larga es:"+pruebas.getMaxLength());
		System.out.println("el n�mero de caracteres totales es:"+pruebas.getTotalLength());
		
	}
	
	
	
	
	
	
	
	
	
	
}