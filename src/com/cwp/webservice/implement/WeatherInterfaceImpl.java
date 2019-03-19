
package com.cwp.webservice.implement;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WeatherInterfaceImpl", targetNamespace = "http://implement.webservice.cwp.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WeatherInterfaceImpl {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "queryWeather", targetNamespace = "http://implement.webservice.cwp.com/", className = "com.cwp.webservice.implement.QueryWeather")
    @ResponseWrapper(localName = "queryWeatherResponse", targetNamespace = "http://implement.webservice.cwp.com/", className = "com.cwp.webservice.implement.QueryWeatherResponse")
    @Action(input = "http://implement.webservice.cwp.com/WeatherInterfaceImpl/queryWeatherRequest", output = "http://implement.webservice.cwp.com/WeatherInterfaceImpl/queryWeatherResponse")
    public String queryWeather(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
