
package sw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para multiplicacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="multiplicacion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="number1" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="number2" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "multiplicacion", propOrder = {
    "number1",
    "number2"
})
public class Multiplicacion {

    protected int number1;
    protected int number2;

    /**
     * Obtiene el valor de la propiedad number1.
     * 
     */
    public int getNumber1() {
        return number1;
    }

    /**
     * Define el valor de la propiedad number1.
     * 
     */
    public void setNumber1(int value) {
        this.number1 = value;
    }

    /**
     * Obtiene el valor de la propiedad number2.
     * 
     */
    public int getNumber2() {
        return number2;
    }

    /**
     * Define el valor de la propiedad number2.
     * 
     */
    public void setNumber2(int value) {
        this.number2 = value;
    }

}
