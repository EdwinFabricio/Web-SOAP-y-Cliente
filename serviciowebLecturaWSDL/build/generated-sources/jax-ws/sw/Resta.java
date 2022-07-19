
package sw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numer1" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="numer2" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resta", propOrder = {
    "numer1",
    "numer2"
})
public class Resta {

    protected int numer1;
    protected int numer2;

    /**
     * Obtiene el valor de la propiedad numer1.
     * 
     */
    public int getNumer1() {
        return numer1;
    }

    /**
     * Define el valor de la propiedad numer1.
     * 
     */
    public void setNumer1(int value) {
        this.numer1 = value;
    }

    /**
     * Obtiene el valor de la propiedad numer2.
     * 
     */
    public int getNumer2() {
        return numer2;
    }

    /**
     * Define el valor de la propiedad numer2.
     * 
     */
    public void setNumer2(int value) {
        this.numer2 = value;
    }

}
