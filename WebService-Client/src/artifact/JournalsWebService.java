
package artifact;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "JournalsWebService", targetNamespace = "http://ws/", wsdlLocation = "http://localhost:8080/Journals-WS/JournalsWeb?wsdl")
public class JournalsWebService
    extends Service
{

    private final static URL JOURNALSWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException JOURNALSWEBSERVICE_EXCEPTION;
    private final static QName JOURNALSWEBSERVICE_QNAME = new QName("http://ws/", "JournalsWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Journals-WS/JournalsWeb?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        JOURNALSWEBSERVICE_WSDL_LOCATION = url;
        JOURNALSWEBSERVICE_EXCEPTION = e;
    }

    public JournalsWebService() {
        super(__getWsdlLocation(), JOURNALSWEBSERVICE_QNAME);
    }

    public JournalsWebService(WebServiceFeature... features) {
        super(__getWsdlLocation(), JOURNALSWEBSERVICE_QNAME, features);
    }

    public JournalsWebService(URL wsdlLocation) {
        super(wsdlLocation, JOURNALSWEBSERVICE_QNAME);
    }

    public JournalsWebService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, JOURNALSWEBSERVICE_QNAME, features);
    }

    public JournalsWebService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public JournalsWebService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns JournalsWeb
     */
    @WebEndpoint(name = "JournalsWebPort")
    public JournalsWeb getJournalsWebPort() {
        return super.getPort(new QName("http://ws/", "JournalsWebPort"), JournalsWeb.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns JournalsWeb
     */
    @WebEndpoint(name = "JournalsWebPort")
    public JournalsWeb getJournalsWebPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws/", "JournalsWebPort"), JournalsWeb.class, features);
    }

    private static URL __getWsdlLocation() {
        if (JOURNALSWEBSERVICE_EXCEPTION!= null) {
            throw JOURNALSWEBSERVICE_EXCEPTION;
        }
        return JOURNALSWEBSERVICE_WSDL_LOCATION;
    }

}
