
package sw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para pitagoras complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="pitagoras"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ladoA" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ladoB" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pitagoras", propOrder = {
    "ladoA",
    "ladoB"
})
public class Pitagoras {

    protected int ladoA;
    protected int ladoB;

    /**
     * Obtiene el valor de la propiedad ladoA.
     * 
     */
    public int getLadoA() {
        return ladoA;
    }

    /**
     * Define el valor de la propiedad ladoA.
     * 
     */
    public void setLadoA(int value) {
        this.ladoA = value;
    }

    /**
     * Obtiene el valor de la propiedad ladoB.
     * 
     */
    public int getLadoB() {
        return ladoB;
    }

    /**
     * Define el valor de la propiedad ladoB.
     * 
     */
    public void setLadoB(int value) {
        this.ladoB = value;
    }

}
