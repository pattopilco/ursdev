package tech.espoch.plantilla.base.portal.bean;

import lombok.Data;

import javax.enterprise.context.Dependent;
import javax.faces.model.SelectItem;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Dependent
@Data
public class TransversalBean implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = -6282874275785394333L;

    private List<SelectItem> provincias = new ArrayList<SelectItem>();
    private List<SelectItem> cantones = new ArrayList<SelectItem>();
    private List<SelectItem> parroquias = new ArrayList<SelectItem>();
    private String provinciaSeleccionada;
    private String cantonSeleccionado;
    private String parroquiaSeleccionada;

    public TransversalBean() {
        super();
    }

}

