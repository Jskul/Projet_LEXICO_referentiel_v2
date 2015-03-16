package service;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import clientServer.service.ServiceFacadeI;

/**
 * A facade for services.
 * 
 * Session Bean implementation class ServiceFacadeBean
 */
@Stateless
@Remote(ServiceFacadeI.class)
public class ServiceFacadeBean {

    /**
     * Default constructor. 
     */
    public ServiceFacadeBean() {
        // TODO Auto-generated constructor stub
    }

}
