package org.jinouts.ws;

import java.net.MalformedURLException;
import java.net.URL;
import org.jinouts.xml.namespace.QName;
import org.jinouts.xml.ws.WebEndpoint;
import org.jinouts.xml.ws.WebServiceClient;
import org.jinouts.xml.ws.WebServiceFeature;
import org.jinouts.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2012-06-19T17:07:52.467+06:00
 * Generated source version: 2.5.1
 * 
 */
@WebServiceClient(name = "LoginService", 
                  wsdlLocation = "http://116.68.194.105:9011/LoginService?WSDL",
                  targetNamespace = "http://ws.jinouts.org/") 
public class LoginService extends org.jinouts.ws.JinosService {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ws.jinouts.org/", "LoginService");
    public final static QName LoginPort = new QName("http://ws.jinouts.org/", "loginPort");
    static {
        URL url = null;
        try {
            url = new URL("http://116.68.194.105:9011/LoginService?WSDL");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(LoginService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://116.68.194.105:9011/LoginService?WSDL");
        }
        WSDL_LOCATION = url;
    }

    public LoginService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public LoginService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LoginService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns Login
     */
    @WebEndpoint(name = "loginPort")
    public Login getLoginPort() {
        return super.getPort(LoginPort, Login.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Login
     */
    @WebEndpoint(name = "loginPort")
    public Login getLoginPort(WebServiceFeature... features) {
        return super.getPort(LoginPort, Login.class, features);
    }

}
