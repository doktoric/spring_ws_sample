package com.acme.doktoric.ws;

import javax.jws.WebService;

/**
 * Created with IntelliJ IDEA.
 * User: Ricsi
 * Date: 2013.09.08.
 * Time: 20:40
 * To change this template use File | Settings | File Templates.
 */
@WebService(endpointInterface = "com.acme.doktoric.ws.HelloWorldService")
public class HelloWorldServiceBean implements HelloWorldService {

    @Override
    public void sayHello() {
        System.out.println("Hello World!!!");
    }

}
