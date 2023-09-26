package tech.espoch.plantilla.base.portal.controlador;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import tech.espoch.plantilla.base.portal.bean.TransversalBean;
import tech.espoch.plantilla.base.portal.servicio.DivisionPoliticaServicio;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@ViewScoped
@Named
@Slf4j
public class TransversalControlador implements Serializable {

    private static final long serialVersionUID = 7096482906971241194L;

    @Inject
    @Getter
    private TransversalBean transversalBean;

    @EJB
    DivisionPoliticaServicio divisionPoliticaServicio;

    @PostConstruct
    public void inicializar() {
        obtenerProvinciaDemo();
    }

    public void obtenerProvinciaDemo() {
        try {
            transversalBean.setProvincias(divisionPoliticaServicio.obtenerItemsProvincias());
        } catch (Exception e) {
            log.info(e.getMessage());
        }
    }
    public void obtenerCantonDemo() {
        try {
            transversalBean.setCantones(divisionPoliticaServicio.obtenerItemsDivisionesPoliticas(transversalBean.getProvinciaSeleccionada()));
        } catch (Exception e) {
            log.info(e.getMessage());
        }
    }

    public void obtenerParroquiaDemo() {
        try {
            transversalBean.setParroquias(divisionPoliticaServicio.obtenerItemsDivisionesPoliticas(transversalBean.getCantonSeleccionado()));
        } catch (Exception e) {
            log.info(e.getMessage());
        }
    }
}

