/**
 * Copyright 2021 INSTITUTO ECUATORIANO DE SEGURIDAD SOCIAL - ECUADOR.
 * Todos los derechos reservados.
 */

package tech.espoch.plantilla.base.portal.servicio;

import tech.espoch.plantilla.base.portal.dao.DivisionPoliticaDao;
import tech.espoch.plantilla.base.portal.dto.DivisionPoliticaProvincias;
import tech.espoch.plantilla.base.portal.entidad.DivisionPoliticaEntidad;
import tech.espoch.plantilla.base.portal.servicio.excepcion.ServicioExcepcion;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.faces.model.SelectItem;

@Stateless
public class DivisionPoliticaServicio implements Serializable {

	private static final long serialVersionUID = -5705037487563349429L;

	@EJB
	private DivisionPoliticaDao divisionPoliticaDao;

	public List<DivisionPoliticaProvincias> obtenerProvincias() throws Exception {
		try {
			List<DivisionPoliticaEntidad> respuestaLista = divisionPoliticaDao.obtenerProvincias();

			if (respuestaLista != null && !respuestaLista.isEmpty()) {
				List<DivisionPoliticaProvincias> listaDivisionPoliticaProvincias = new ArrayList<>();
				for (DivisionPoliticaEntidad divisionPoliticaEntidad : respuestaLista) {
					listaDivisionPoliticaProvincias
							.add(new DivisionPoliticaProvincias(divisionPoliticaEntidad.getCodigoDivisionPolitica(),
									divisionPoliticaEntidad.getNombreDivisionPolitica(),
									divisionPoliticaEntidad.getCodigoDivisionPoliticaPadre()));
				}
				return listaDivisionPoliticaProvincias;
			} else {
				throw new Exception("no existe datos");
			}
		} catch (RuntimeException e) {
			throw new ServicioExcepcion("Error: no se logro obtener las provincias");
		}
	}


	public List<SelectItem> obtenerItemsProvincias() throws Exception {
		try {
			List<DivisionPoliticaEntidad> respuestaLista = divisionPoliticaDao.obtenerProvincias();
			if (respuestaLista != null && !respuestaLista.isEmpty()) {
				List<SelectItem> itemsPoliticaProvincias = new ArrayList<>();
				for (DivisionPoliticaEntidad divisionPoliticaEntidad : respuestaLista) {
					itemsPoliticaProvincias.add(new SelectItem(divisionPoliticaEntidad.getCodigoDivisionPolitica(),
							divisionPoliticaEntidad.getNombreDivisionPolitica()));
				}
				return itemsPoliticaProvincias;
			} else {
				throw new Exception("NO existe datos");
			}
		} catch (RuntimeException e) {
			throw new Exception("Error: no se logro obtener las provincias");
		}
	}

	public List<DivisionPoliticaProvincias> obtenerDivisionesPoliticas(String codigoPadreDivision)
			throws Exception {
		try {
			List<DivisionPoliticaEntidad> respuestaLista = divisionPoliticaDao
					.obtenerDivisionesPoliticas(codigoPadreDivision);

			if (respuestaLista != null && !respuestaLista.isEmpty()) {
				List<DivisionPoliticaProvincias> listaDivisionPolitica = new ArrayList<>();
				for (DivisionPoliticaEntidad divisionPoliticaEntidad : respuestaLista) {
					listaDivisionPolitica
							.add(new DivisionPoliticaProvincias(divisionPoliticaEntidad.getCodigoDivisionPolitica(),
									divisionPoliticaEntidad.getNombreDivisionPolitica(),
									divisionPoliticaEntidad.getCodigoDivisionPoliticaPadre()));
				}
				return listaDivisionPolitica;
			} else {
				throw new Exception("NO existen datos");
			}
		} catch (RuntimeException e) {
			throw new Exception("Error: no se logro obtener las divisiones politicas");
		}
	}

	public List<SelectItem> obtenerItemsDivisionesPoliticas(String codigoPadreDivision) throws Exception {
		try {
			List<DivisionPoliticaEntidad> respuestaLista = divisionPoliticaDao
					.obtenerDivisionesPoliticas(codigoPadreDivision);

			if (respuestaLista != null && !respuestaLista.isEmpty()) {
				List<SelectItem> itemsDivisionPolitica = new ArrayList<>();
				for (DivisionPoliticaEntidad divisionPoliticaEntidad : respuestaLista) {
					itemsDivisionPolitica.add(new SelectItem(divisionPoliticaEntidad.getCodigoDivisionPolitica(),
							divisionPoliticaEntidad.getNombreDivisionPolitica()));
				}
				return itemsDivisionPolitica;
			} else {
				throw new Exception("NO existen datos");
			}
		} catch (RuntimeException e) {
			throw new Exception("Error: no se logro obtener las divisiones politicas");
		}
	}

	public DivisionPoliticaProvincias obtenerDivisionesPorCodigo(String codigoDivisionPolitica)
			throws Exception {
		try {
			List<DivisionPoliticaEntidad> respuestaLista = divisionPoliticaDao
					.obtenerDivisionPorCodigo(codigoDivisionPolitica);
			if (respuestaLista != null && !respuestaLista.isEmpty()) {
				List<DivisionPoliticaProvincias> listaDivisionPoliticaProvincias = new ArrayList<>();
				for (DivisionPoliticaEntidad divisionPoliticaEntidad : respuestaLista) {
					listaDivisionPoliticaProvincias
							.add(new DivisionPoliticaProvincias(divisionPoliticaEntidad.getCodigoDivisionPolitica(),
									divisionPoliticaEntidad.getNombreDivisionPolitica(),
									divisionPoliticaEntidad.getCodigoDivisionPoliticaPadre()));
				}
				return listaDivisionPoliticaProvincias.get(0);
			} else {
				throw new Exception("NO existen datos");
			}
		} catch (RuntimeException e) {
			throw new Exception("Error: no se logro obtener las divisiones politicas por codigo");
		}
	}


}
