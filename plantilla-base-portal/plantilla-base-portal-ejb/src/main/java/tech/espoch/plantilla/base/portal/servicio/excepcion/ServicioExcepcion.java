/*
 * Copyright 2021 INSTITUTO ECUATORIANO DE SEGURIDAD SOCIAL - ECUADOR 
 * Todos los derechos reservados
 */

package tech.espoch.plantilla.base.portal.servicio.excepcion;

import javax.ejb.ApplicationException;

/**
 * 
 * <b>
 * Incluir aqui la descripcion de la clase.
 * </b>
 *  
 * @author PatricioPilco
 * @version $Revision: 1.0 $ <p>[$Author: PatricioPilco $, $Date: 9 jun. 2021 $]</p>
 */
@ApplicationException(rollback = true)
public class ServicioExcepcion extends Exception {

    private static final long serialVersionUID = -5401498301486094378L;

    /**
     * 
    * @param message
     */
    public ServicioExcepcion(String message) {
        super(message);
    }

    /**
     * 
    * @param cause
     */
    public ServicioExcepcion(Throwable cause) {
        super(cause);
    }

    /**
     * 
    * @param message
    * @param cause
     */
    public ServicioExcepcion(String message, Throwable cause) {
        super(message, cause);
    }

}
