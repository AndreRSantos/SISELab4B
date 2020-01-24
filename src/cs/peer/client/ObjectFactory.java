
package cs.peer.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cs.peer.client package. 
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

    private final static QName _Check_QNAME = new QName("http://server.calc.cs/", "check");
    private final static QName _CheckResponse_QNAME = new QName("http://server.calc.cs/", "checkResponse");
    private final static QName _ToPeer_QNAME = new QName("http://server.calc.cs/", "toPeer");
    private final static QName _ToPeerResponse_QNAME = new QName("http://server.calc.cs/", "toPeerResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cs.peer.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Check }
     * 
     */
    public Check createCheck() {
        return new Check();
    }

    /**
     * Create an instance of {@link CheckResponse }
     * 
     */
    public CheckResponse createCheckResponse() {
        return new CheckResponse();
    }

    /**
     * Create an instance of {@link ToPeer }
     * 
     */
    public ToPeer createToPeer() {
        return new ToPeer();
    }

    /**
     * Create an instance of {@link ToPeerResponse }
     * 
     */
    public ToPeerResponse createToPeerResponse() {
        return new ToPeerResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Check }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Check }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.calc.cs/", name = "check")
    public JAXBElement<Check> createCheck(Check value) {
        return new JAXBElement<Check>(_Check_QNAME, Check.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.calc.cs/", name = "checkResponse")
    public JAXBElement<CheckResponse> createCheckResponse(CheckResponse value) {
        return new JAXBElement<CheckResponse>(_CheckResponse_QNAME, CheckResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ToPeer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ToPeer }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.calc.cs/", name = "toPeer")
    public JAXBElement<ToPeer> createToPeer(ToPeer value) {
        return new JAXBElement<ToPeer>(_ToPeer_QNAME, ToPeer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ToPeerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ToPeerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.calc.cs/", name = "toPeerResponse")
    public JAXBElement<ToPeerResponse> createToPeerResponse(ToPeerResponse value) {
        return new JAXBElement<ToPeerResponse>(_ToPeerResponse_QNAME, ToPeerResponse.class, null, value);
    }

}
