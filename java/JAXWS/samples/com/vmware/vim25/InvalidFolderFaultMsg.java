
package com.vmware.vim25;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.4-b01-
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "InvalidFolderFault", targetNamespace = "urn:vim25")
public class InvalidFolderFaultMsg
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private InvalidFolder faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public InvalidFolderFaultMsg(String message, InvalidFolder faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public InvalidFolderFaultMsg(String message, InvalidFolder faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.vmware.vim25.InvalidFolder
     */
    public InvalidFolder getFaultInfo() {
        return faultInfo;
    }

}