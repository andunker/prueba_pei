//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.04.23 a las 09:52:46 AM COT 
//


package com.bolsadeideas.pruebafabio.app.models.schemas;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bolsadeideas.pruebafabio.app.models.schemas package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bolsadeideas.pruebafabio.app.models.schemas
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UserLoginRequest }
     * 
     */
    public UserLoginRequest createUserLoginRequest() {
        return new UserLoginRequest();
    }

    /**
     * Create an instance of {@link UserLoginResponse }
     * 
     */
    public UserLoginResponse createUserLoginResponse() {
        return new UserLoginResponse();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link CreditCardGetByUserCodeRequest }
     * 
     */
    public CreditCardGetByUserCodeRequest createCreditCardGetByUserCodeRequest() {
        return new CreditCardGetByUserCodeRequest();
    }

    /**
     * Create an instance of {@link CreditCardGetByUserCodeResponse }
     * 
     */
    public CreditCardGetByUserCodeResponse createCreditCardGetByUserCodeResponse() {
        return new CreditCardGetByUserCodeResponse();
    }

    /**
     * Create an instance of {@link CreditCard }
     * 
     */
    public CreditCard createCreditCard() {
        return new CreditCard();
    }

    /**
     * Create an instance of {@link MovementGetByUserCodeRequest }
     * 
     */
    public MovementGetByUserCodeRequest createMovementGetByUserCodeRequest() {
        return new MovementGetByUserCodeRequest();
    }

    /**
     * Create an instance of {@link MovementGetByUserCodeResponse }
     * 
     */
    public MovementGetByUserCodeResponse createMovementGetByUserCodeResponse() {
        return new MovementGetByUserCodeResponse();
    }

    /**
     * Create an instance of {@link CreditCardWithMovements }
     * 
     */
    public CreditCardWithMovements createCreditCardWithMovements() {
        return new CreditCardWithMovements();
    }

    /**
     * Create an instance of {@link MovementGetByCreditCardTokenRequest }
     * 
     */
    public MovementGetByCreditCardTokenRequest createMovementGetByCreditCardTokenRequest() {
        return new MovementGetByCreditCardTokenRequest();
    }

    /**
     * Create an instance of {@link MovementGetByCreditCardTokenResponse }
     * 
     */
    public MovementGetByCreditCardTokenResponse createMovementGetByCreditCardTokenResponse() {
        return new MovementGetByCreditCardTokenResponse();
    }

    /**
     * Create an instance of {@link Movement }
     * 
     */
    public Movement createMovement() {
        return new Movement();
    }

}
