
package UtsMetathesaurusMetaData;

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
@WebServiceClient(name = "UtsWsMetadataControllerImplService", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", wsdlLocation = "https://uts.nlm.nih.gov/services/nwsMetadata?wsdl")
public class UtsWsMetadataControllerImplService
    extends Service
{

    private final static URL UTSWSMETADATACONTROLLERIMPLSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(UtsMetathesaurusMetaData.UtsWsMetadataControllerImplService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = UtsMetathesaurusMetaData.UtsWsMetadataControllerImplService.class.getResource(".");
            url = new URL(baseUrl, "https://uts.nlm.nih.gov/services/nwsMetadata?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'https://uts.nlm.nih.gov/services/nwsMetadata?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        UTSWSMETADATACONTROLLERIMPLSERVICE_WSDL_LOCATION = url;
    }

    public UtsWsMetadataControllerImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UtsWsMetadataControllerImplService() {
        super(UTSWSMETADATACONTROLLERIMPLSERVICE_WSDL_LOCATION, new QName("http://webservice.uts.umls.nlm.nih.gov/", "UtsWsMetadataControllerImplService"));
    }

    /**
     * 
     * @return
     *     returns UtsWsMetadataController
     */
    @WebEndpoint(name = "UtsWsMetadataControllerImplPort")
    public UtsWsMetadataController getUtsWsMetadataControllerImplPort() {
        return super.getPort(new QName("http://webservice.uts.umls.nlm.nih.gov/", "UtsWsMetadataControllerImplPort"), UtsWsMetadataController.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UtsWsMetadataController
     */
    @WebEndpoint(name = "UtsWsMetadataControllerImplPort")
    public UtsWsMetadataController getUtsWsMetadataControllerImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservice.uts.umls.nlm.nih.gov/", "UtsWsMetadataControllerImplPort"), UtsWsMetadataController.class, features);
    }

}