package tech.espoch.plantilla.base.portal.dao;

import tech.espoch.plantilla.base.portal.entidad.DivisionPoliticaEntidad;
import tech.espoch.plantilla.base.portal.repositorio.RepositorioJPA;
import tech.espoch.repositorio.jpa.excepcion.RepositorioExcepcion;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.Stateless;

@Stateless
public class DivisionPoliticaDao extends RepositorioJPA<DivisionPoliticaEntidad> {

    private static final long serialVersionUID = -2218006201095856764L;

    public List<DivisionPoliticaEntidad> obtenerProvincias() throws RepositorioExcepcion {
        return getDao().listarPorConsultaJpaNombrada(DivisionPoliticaEntidad.BUSCAR_PROVINCIAS, null);
    }

   public List<DivisionPoliticaEntidad> obtenerDivisionesPoliticas(String codigoDivisionPoliticaPadre)
            throws RepositorioExcepcion {
        Map<String, Object> parametros = new HashMap<>();
        parametros.put("pCodigoDivisionPoliticaPadre", codigoDivisionPoliticaPadre);
        return getDao().listarPorConsultaJpaNombrada(DivisionPoliticaEntidad.BUSCAR_DIVISIONES_POR_CODIGOPADRE,
                parametros);
    }
    public List<DivisionPoliticaEntidad> obtenerDivisionPorCodigo(String codigoDivisionPolitica) throws RepositorioExcepcion {
        Map<String, Object> parametros = new HashMap<>();
        parametros.put("pCodigoDivisionPolitica", codigoDivisionPolitica);
        return getDao().listarPorConsultaJpaNombrada(DivisionPoliticaEntidad.BUSCAR_DIVISIONES_POR_CODIGO, parametros);
    }
}

