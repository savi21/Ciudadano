package com.savi.controller;

import com.savi.ciudadano.fachada.impl.FachadaCiudadano;
import com.savi.ciudadano.modelo.entidades.Ciudadano;
import com.savi.controller.util.JsfUtil;
import com.savi.controller.util.JsfUtil.PersistAction;

import java.io.Serializable;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@Named("ciudadanoController")
@SessionScoped
public class CiudadanoController implements Serializable {

    @EJB
    private FachadaCiudadano ejbFacade;
    private List<Ciudadano> items = null;
    private Ciudadano selected;

    public CiudadanoController() {
    }

    public Ciudadano getSelected() {
        return selected;
    }

    public void setSelected(Ciudadano selected) {
        this.selected = selected;
    }

    protected void setEmbeddableKeys() {
    }

    protected void initializeEmbeddableKey() {
    }

    private FachadaCiudadano getFacade() {
        return ejbFacade;
    }

    public Ciudadano prepareCreate() {
        selected = new Ciudadano();
        initializeEmbeddableKey();
        return selected;
    }

    public void create() {
        persist(PersistAction.CREATE, ResourceBundle.getBundle("/Bundle").getString("CiudadanoCreated"));
        if (!JsfUtil.isValidationFailed()) {
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public void update() {
        persist(PersistAction.UPDATE, ResourceBundle.getBundle("/Bundle").getString("CiudadanoUpdated"));
    }

    public void destroy() {
        persist(PersistAction.DELETE, ResourceBundle.getBundle("/Bundle").getString("CiudadanoDeleted"));
        if (!JsfUtil.isValidationFailed()) {
            selected = null; // Remove selection
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public List<Ciudadano> getItems() {
        if (items == null) {
            items = getFacade().buscarTodos();
        }
        return items;
    }

    private void persist(PersistAction persistAction, String successMessage) {
        if (selected != null) {
            setEmbeddableKeys();
            try {
                if (persistAction != PersistAction.DELETE) {
                    getFacade().actualizar(selected);
                } else {
                    getFacade().borrar(selected);
                }
                JsfUtil.addSuccessMessage(successMessage);
            } catch (EJBException ex) {
                String msg = "";
                Throwable cause = ex.getCause();
                if (cause != null) {
                    msg = cause.getLocalizedMessage();
                }
                if (msg.length() > 0) {
                    JsfUtil.addErrorMessage(msg);
                } else {
                    JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
                }
            } catch (Exception ex) {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
                JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            }
        }
    }

    public Ciudadano getCiudadano(Integer id) {
        return getFacade().buscar(id);
    }

    public List<Ciudadano> getItemsAvailableSelectMany() {
        return getFacade().buscarTodos();
    }

    public List<Ciudadano> getItemsAvailableSelectOne() {
        return getFacade().buscarTodos();
    }

    @FacesConverter(forClass = Ciudadano.class)
    public static class CiudadanoControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            CiudadanoController controller = (CiudadanoController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "ciudadanoController");
            return controller.getCiudadano(getKey(value));
        }

        Integer getKey(String value) {
            Integer key;
            key = new Integer(value);
            return key;
        }

        String getStringKey(java.math.BigDecimal value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value);
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof Ciudadano) {
                Ciudadano o = (Ciudadano) object;
                return getStringKey(o.getCiudadanoId());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Ciudadano.class.getName()});
                return null;
            }
        }

    }

}
