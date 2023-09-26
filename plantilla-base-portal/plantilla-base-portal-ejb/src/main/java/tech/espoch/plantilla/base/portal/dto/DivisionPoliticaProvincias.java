package tech.espoch.plantilla.base.portal.dto;


import lombok.Data;
@Data
public class DivisionPoliticaProvincias {

    private String codigoDivision;
    private String nombreDivision;
    private String codigoPadreDivision;

    public DivisionPoliticaProvincias(String codigoDivision, String nombreDivision, String codigoPadreDivision) {
        super();
        this.codigoDivision = codigoDivision;
        this.nombreDivision = nombreDivision;
        this.codigoPadreDivision = codigoPadreDivision;
    }

    public DivisionPoliticaProvincias() {
        super();
        // TODO Auto-generated constructor stub
    }

}

