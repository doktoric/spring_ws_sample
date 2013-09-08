package com.acme.doktoric.ws;

import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created with IntelliJ IDEA.
 * User: Ricsi
 * Date: 2013.08.05.
 * Time: 20:21
 * To change this template use File | Settings | File Templates.
 */
@Component
@WebService
public class MessageWebSericeImpl implements MessageWebSericeInterface{

    @Override
    @WebMethod(operationName = "sendMessageToChannel")
    public boolean sendMessageToChannel(String messageText, String messageFromPerson) {
        return true;
    }
}
