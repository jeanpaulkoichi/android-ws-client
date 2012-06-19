package org.jinouts.ws;

import org.jinouts.jws.WebMethod;
import org.jinouts.jws.WebParam;
import org.jinouts.jws.WebResult;
import org.jinouts.jws.WebService;
import org.jinouts.xml.bind.annotation.XmlSeeAlso;
import org.jinouts.xml.ws.RequestWrapper;
import org.jinouts.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2012-05-23T20:13:43.776+06:00
 * Generated source version: 2.5.1
 * 
 */
@WebService(targetNamespace = "http://ws.jinouts.org/", name = "AndProxyClientReqTestWS")
@XmlSeeAlso({ObjectFactory.class})
public interface AndProxyClientReqTestWS {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "testComplexRequestObject", targetNamespace = "http://ws.jinouts.org/", className = "org.jinouts.ws.TestComplexRequestObject")
    @WebMethod
    @ResponseWrapper(localName = "testComplexRequestObjectResponse", targetNamespace = "http://ws.jinouts.org/", className = "org.jinouts.ws.TestComplexRequestObjectResponse")
    public java.lang.String testComplexRequestObject(
        @WebParam(name = "request", targetNamespace = "")
        org.jinouts.ws.TestComplexRequest request
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "testListDateArrayRequest", targetNamespace = "http://ws.jinouts.org/", className = "org.jinouts.ws.TestListDateArrayRequest")
    @WebMethod
    @ResponseWrapper(localName = "testListDateArrayRequestResponse", targetNamespace = "http://ws.jinouts.org/", className = "org.jinouts.ws.TestListDateArrayRequestResponse")
    public java.lang.String testListDateArrayRequest(
        @WebParam(name = "date", targetNamespace = "")
        javax.xml.datatype.XMLGregorianCalendar date,
        @WebParam(name = "list", targetNamespace = "")
        java.util.List<java.lang.String> list,
        @WebParam(name = "array", targetNamespace = "")
        java.util.List<java.lang.String> array
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "testListOfObjRequest", targetNamespace = "http://ws.jinouts.org/", className = "org.jinouts.ws.TestListOfObjRequest")
    @WebMethod
    @ResponseWrapper(localName = "testListOfObjRequestResponse", targetNamespace = "http://ws.jinouts.org/", className = "org.jinouts.ws.TestListOfObjRequestResponse")
    public java.lang.String testListOfObjRequest(
        @WebParam(name = "mbrList", targetNamespace = "")
        java.util.List<org.jinouts.ws.MbrDetail> mbrList
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "testObjectRequest", targetNamespace = "http://ws.jinouts.org/", className = "org.jinouts.ws.TestObjectRequest")
    @WebMethod
    @ResponseWrapper(localName = "testObjectRequestResponse", targetNamespace = "http://ws.jinouts.org/", className = "org.jinouts.ws.TestObjectRequestResponse")
    public java.lang.String testObjectRequest(
        @WebParam(name = "request", targetNamespace = "")
        org.jinouts.ws.Request request
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "testPrimitiveRequest", targetNamespace = "http://ws.jinouts.org/", className = "org.jinouts.ws.TestPrimitiveRequest")
    @WebMethod
    @ResponseWrapper(localName = "testPrimitiveRequestResponse", targetNamespace = "http://ws.jinouts.org/", className = "org.jinouts.ws.TestPrimitiveRequestResponse")
    public java.lang.String testPrimitiveRequest(
        @WebParam(name = "user", targetNamespace = "")
        java.lang.String user,
        @WebParam(name = "pass", targetNamespace = "")
        java.lang.String pass
    );
}
