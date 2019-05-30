
package artifact;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the artifact package. 
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

    private final static QName _GetInfoFromJournalResponse_QNAME = new QName("http://ws/", "getInfoFromJournalResponse");
    private final static QName _GetAllJournals_QNAME = new QName("http://ws/", "getAllJournals");
    private final static QName _GetInfoFromJournal_QNAME = new QName("http://ws/", "getInfoFromJournal");
    private final static QName _GetOrderedJournals_QNAME = new QName("http://ws/", "getOrderedJournals");
    private final static QName _GetTitles_QNAME = new QName("http://ws/", "getTitles");
    private final static QName _GetAllJournalsResponse_QNAME = new QName("http://ws/", "getAllJournalsResponse");
    private final static QName _GetTitlesResponse_QNAME = new QName("http://ws/", "getTitlesResponse");
    private final static QName _GetOrderedJournalsResponse_QNAME = new QName("http://ws/", "getOrderedJournalsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: artifact
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetInfoFromJournalResponse }
     * 
     */
    public GetInfoFromJournalResponse createGetInfoFromJournalResponse() {
        return new GetInfoFromJournalResponse();
    }

    /**
     * Create an instance of {@link GetAllJournals }
     * 
     */
    public GetAllJournals createGetAllJournals() {
        return new GetAllJournals();
    }

    /**
     * Create an instance of {@link GetInfoFromJournal }
     * 
     */
    public GetInfoFromJournal createGetInfoFromJournal() {
        return new GetInfoFromJournal();
    }

    /**
     * Create an instance of {@link GetOrderedJournals }
     * 
     */
    public GetOrderedJournals createGetOrderedJournals() {
        return new GetOrderedJournals();
    }

    /**
     * Create an instance of {@link GetTitles }
     * 
     */
    public GetTitles createGetTitles() {
        return new GetTitles();
    }

    /**
     * Create an instance of {@link GetAllJournalsResponse }
     * 
     */
    public GetAllJournalsResponse createGetAllJournalsResponse() {
        return new GetAllJournalsResponse();
    }

    /**
     * Create an instance of {@link GetTitlesResponse }
     * 
     */
    public GetTitlesResponse createGetTitlesResponse() {
        return new GetTitlesResponse();
    }

    /**
     * Create an instance of {@link GetOrderedJournalsResponse }
     * 
     */
    public GetOrderedJournalsResponse createGetOrderedJournalsResponse() {
        return new GetOrderedJournalsResponse();
    }

    /**
     * Create an instance of {@link JournalDAO }
     * 
     */
    public JournalDAO createJournalDAO() {
        return new JournalDAO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInfoFromJournalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getInfoFromJournalResponse")
    public JAXBElement<GetInfoFromJournalResponse> createGetInfoFromJournalResponse(GetInfoFromJournalResponse value) {
        return new JAXBElement<GetInfoFromJournalResponse>(_GetInfoFromJournalResponse_QNAME, GetInfoFromJournalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllJournals }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAllJournals")
    public JAXBElement<GetAllJournals> createGetAllJournals(GetAllJournals value) {
        return new JAXBElement<GetAllJournals>(_GetAllJournals_QNAME, GetAllJournals.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInfoFromJournal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getInfoFromJournal")
    public JAXBElement<GetInfoFromJournal> createGetInfoFromJournal(GetInfoFromJournal value) {
        return new JAXBElement<GetInfoFromJournal>(_GetInfoFromJournal_QNAME, GetInfoFromJournal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrderedJournals }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getOrderedJournals")
    public JAXBElement<GetOrderedJournals> createGetOrderedJournals(GetOrderedJournals value) {
        return new JAXBElement<GetOrderedJournals>(_GetOrderedJournals_QNAME, GetOrderedJournals.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTitles }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getTitles")
    public JAXBElement<GetTitles> createGetTitles(GetTitles value) {
        return new JAXBElement<GetTitles>(_GetTitles_QNAME, GetTitles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllJournalsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAllJournalsResponse")
    public JAXBElement<GetAllJournalsResponse> createGetAllJournalsResponse(GetAllJournalsResponse value) {
        return new JAXBElement<GetAllJournalsResponse>(_GetAllJournalsResponse_QNAME, GetAllJournalsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTitlesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getTitlesResponse")
    public JAXBElement<GetTitlesResponse> createGetTitlesResponse(GetTitlesResponse value) {
        return new JAXBElement<GetTitlesResponse>(_GetTitlesResponse_QNAME, GetTitlesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrderedJournalsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getOrderedJournalsResponse")
    public JAXBElement<GetOrderedJournalsResponse> createGetOrderedJournalsResponse(GetOrderedJournalsResponse value) {
        return new JAXBElement<GetOrderedJournalsResponse>(_GetOrderedJournalsResponse_QNAME, GetOrderedJournalsResponse.class, null, value);
    }

}
