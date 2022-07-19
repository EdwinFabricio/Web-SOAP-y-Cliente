
package sw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para intensidad complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="intensidad"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="potencia" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="voltaje" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "intensidad", propOrder = {
    "potencia",
    "voltaje"
})
public class Intensidad {

    protected double potencia;
    protected double voltaje;

    /**
     * Obtiene el valor de la propiedad potencia.
     * 
     */
    public double getPotencia() {
        return potencia;
    }

    /**
     * Define el valor de la propiedad potencia.
     * 
     */
    public void setPotencia(double value) {
        this.potencia = value;
    }

    /**
     * Obtiene el valor de la propiedad voltaje.
     * 
     */
    public double getVoltaje() {
        return voltaje;
    }

    /**
     * Define el valor de la propiedad voltaje.
     * 
     */
    public void setVoltaje(double value) {
        this.voltaje = value;
    }

}
