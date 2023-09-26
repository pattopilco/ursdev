package tech.espoch.plantilla.base.portal.entidad;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name = "KSPCOTDIVPOL")
@NamedQuery(name = DivisionPoliticaEntidad.BUSCAR_PROVINCIAS, query = "SELECT p FROM DivisionPoliticaEntidad p WHERE p.codigoDivisionPoliticaPadre is null")
@NamedQuery(name = DivisionPoliticaEntidad.BUSCAR_DIVISIONES_POR_CODIGOPADRE, query = "SELECT p FROM DivisionPoliticaEntidad p "
        + "WHERE p.codigoDivisionPoliticaPadre =:pCodigoDivisionPoliticaPadre")
@NamedQuery(name = DivisionPoliticaEntidad.BUSCAR_DIVISIONES_POR_CODIGO, query = "SELECT p FROM DivisionPoliticaEntidad p "
        + "WHERE p.codigoDivisionPolitica =:pCodigoDivisionPolitica")
@Data
public class DivisionPoliticaEntidad implements Serializable {

    public static final String BUSCAR_PROVINCIAS = "DivisionPoliticaEntidad.buscarProvincias";
    public static final String BUSCAR_DIVISIONES_POR_CODIGOPADRE = "DivisionPoliticaEntidad.buscarDivisiones";
    public static final String BUSCAR_DIVISIONES_POR_CODIGO = "DivisionPoliticaEntidad.buscarDivisionesPorCodigo";
    private static final long serialVersionUID = 1398638925604142519L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODDIVPOL")
    private String codigoDivisionPolitica;

    @Column(name = "CODOFIIES")
    private String codigoOficinaIess;

    @Column(name = "NOMDIVPOL")
    private String nombreDivisionPolitica;

    @Column(name = "TIPDIVPOL")
    private String tipoDivisionPolitica;

    @Column(name = "CODDIVPOLPAD")
    private String codigoDivisionPoliticaPadre;

    @Column(name = "CODUBI")
    private String codigoUbicacion;

    @Column(name = "CODREGADM")
    private BigDecimal codigoRegionAdministrativa;

    @Column(name = "FECHAVIGENCIA")
    @Temporal(TemporalType.DATE)
    private Date fechaVigencia;

    public DivisionPoliticaEntidad() {
        super();
    }

}
