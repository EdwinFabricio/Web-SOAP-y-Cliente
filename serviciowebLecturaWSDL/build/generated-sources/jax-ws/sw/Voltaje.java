
package sw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para voltaje complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="voltaje"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resit" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="intens" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "voltaje", propOrder = {
    "resit",
    "intens"
})
public class Voltaje {

    protected double resit;
    protected double intens;

    /**
     * Obtiene el valor de la propiedad resit.
     * 
     */
    public double getResit() {
        return resit;
    }

    /**
     * Define el valor de la propiedad resit.
     * 
     */
    public void setResit(double value) {
        this.resit = value;
    }

    /**
     * Obtiene el valor de la propiedad intens.
     * 
     */
    public double getIntens() {
        return intens;
    }

    /**
     * Define el valor de la propiedad intens.
     * 
     */
    public void setIntens(double value) {
        this.intens = value;
    }

}
