/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SW;

import dao.Usuario;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Estudiante
 */
@WebService(serviceName = "ConversionSW")
public class ConversionSW implements Serializable {

    @PersistenceContext
    private EntityManager em;

    @EJB

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "euroAdolar")
    public Double euroAdolar(@WebParam(name = "EUROS") double EUROS) {
        //TODO write your implementation code here:
        return EUROS * 1.25;
    }

  

    /**
     * Web service operation
     *
     * @param usuario
     * @param password
     */
    @WebMethod(operationName = "validar")
    public String validar(@WebParam(name = "usuario") String usuario, @WebParam(name = "password") String password) {
        //TODO write your implementation code here:

        Usuario u = null;

        try {
            Query q1 = em.createNamedQuery("Usuario.findUsuario", Usuario.class);
            q1.setParameter("usuario", usuario);
            q1.setParameter("password", password);
            u = (Usuario) q1.getSingleResult();

        } catch (NullPointerException | NoResultException e) {

            u = null;
            System.out.println(e.getMessage());

        }

        return u.getIdPersona().toString();

    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "crear")
    public String crear() {
        //TODO write your implementation code here:
        return null;
    }

}
