
package sw;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sw package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Crear_QNAME = new QName("http://SW/", "crear");
    private final static QName _CrearResponse_QNAME = new QName("http://SW/", "crearResponse");
    private final static QName _EuroAdolar_QNAME = new QName("http://SW/", "euroAdolar");
    private final static QName _EuroAdolarResponse_QNAME = new QName("http://SW/", "euroAdolarResponse");
    private final static QName _Hello_QNAME = new QName("http://SW/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://SW/", "helloResponse");
    private final static QName _Validar_QNAME = new QName("http://SW/", "validar");
    private final static QName _ValidarResponse_QNAME = new QName("http://SW/", "validarResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sw
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Crear }
     * 
     */
    public Crear createCrear() {
        return new Crear();
    }

    /**
     * Create an instance of {@link CrearResponse }
     * 
     */
    public CrearResponse createCrearResponse() {
        return new CrearResponse();
    }

    /**
     * Create an instance of {@link EuroAdolar }
     * 
     */
    public EuroAdolar createEuroAdolar() {
        return new EuroAdolar();
    }

    /**
     * Create an instance of {@link EuroAdolarResponse }
     * 
     */
    public EuroAdolarResponse createEuroAdolarResponse() {
        return new EuroAdolarResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Validar }
     * 
     */
    public Validar createValidar() {
        return new Validar();
    }

    /**
     * Create an instance of {@link ValidarResponse }
     * 
     */
    public ValidarResponse createValidarResponse() {
        return new ValidarResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Crear }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SW/", name = "crear")
    public JAXBElement<Crear> createCrear(Crear value) {
        return new JAXBElement<Crear>(_Crear_QNAME, Crear.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SW/", name = "crearResponse")
    public JAXBElement<CrearResponse> createCrearResponse(CrearResponse value) {
        return new JAXBElement<CrearResponse>(_CrearResponse_QNAME, CrearResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EuroAdolar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SW/", name = "euroAdolar")
    public JAXBElement<EuroAdolar> createEuroAdolar(EuroAdolar value) {
        return new JAXBElement<EuroAdolar>(_EuroAdolar_QNAME, EuroAdolar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EuroAdolarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SW/", name = "euroAdolarResponse")
    public JAXBElement<EuroAdolarResponse> createEuroAdolarResponse(EuroAdolarResponse value) {
        return new JAXBElement<EuroAdolarResponse>(_EuroAdolarResponse_QNAME, EuroAdolarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SW/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SW/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Validar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SW/", name = "validar")
    public JAXBElement<Validar> createValidar(Validar value) {
        return new JAXBElement<Validar>(_Validar_QNAME, Validar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SW/", name = "validarResponse")
    public JAXBElement<ValidarResponse> createValidarResponse(ValidarResponse value) {
        return new JAXBElement<ValidarResponse>(_ValidarResponse_QNAME, ValidarResponse.class, null, value);
    }

}
