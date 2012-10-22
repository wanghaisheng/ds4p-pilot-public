
package UtsSemNet;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "UtsWsSemanticNetworkControllerImplService", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", wsdlLocation = "https://uts.nlm.nih.gov/services/nwsSemanticNetwork?wsdl")
public class UtsWsSemanticNetworkControllerImplService
    extends Service
{

    private final static URL UTSWSSEMANTICNETWORKCONTROLLERIMPLSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(UtsSemNet.UtsWsSemanticNetworkControllerImplService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = UtsSemNet.UtsWsSemanticNetworkControllerImplService.class.getResource(".");
            url = new URL(baseUrl, "https://uts.nlm.nih.gov/services/nwsSemanticNetwork?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'https://uts.nlm.nih.gov/services/nwsSemanticNetwork?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        UTSWSSEMANTICNETWORKCONTROLLERIMPLSERVICE_WSDL_LOCATION = url;
    }

    public UtsWsSemanticNetworkControllerImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UtsWsSemanticNetworkControllerImplService() {
        super(UTSWSSEMANTICNETWORKCONTROLLERIMPLSERVICE_WSDL_LOCATION, new QName("http://webservice.uts.umls.nlm.nih.gov/", "UtsWsSemanticNetworkControllerImplService"));
    }

    /**
     * 
     * @return
     *     returns UtsWsSemanticNetworkController
     */
    @WebEndpoint(name = "UtsWsSemanticNetworkControllerImplPort")
    public UtsWsSemanticNetworkController getUtsWsSemanticNetworkControllerImplPort() {
        return super.getPort(new QName("http://webservice.uts.umls.nlm.nih.gov/", "UtsWsSemanticNetworkControllerImplPort"), UtsWsSemanticNetworkController.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UtsWsSemanticNetworkController
     */
    @WebEndpoint(name = "UtsWsSemanticNetworkControllerImplPort")
    public UtsWsSemanticNetworkController getUtsWsSemanticNetworkControllerImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservice.uts.umls.nlm.nih.gov/", "UtsWsSemanticNetworkControllerImplPort"), UtsWsSemanticNetworkController.class, features);
    }

}