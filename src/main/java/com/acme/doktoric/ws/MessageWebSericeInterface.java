package com.acme.doktoric.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created with IntelliJ IDEA.
 * User: Ricsi
 * Date: 2013.08.05.
 * Time: 20:19
 * To change this template use File | Settings | File Templates.
 */
@WebService
public interface MessageWebSericeInterface {

    @WebMethod(operationName = "sendMessageToChannel")
    boolean sendMessageToChannel(@WebParam(name = "messageText") String messageText, @WebParam(name = "messageFromPerson") String messageFromPerson);

}
