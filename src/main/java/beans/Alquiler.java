package beans;

import java.sql.Date;

public class Alquiler {
    
    private int username, id;
    private Date fechaAlquiler;
    private boolean novedad;
    private String genero;

    public Alquiler(int username, int id, Date fechaAlquiler, boolean novedad, String genero) {
        this.username = username;
        this.id = id;
        this.fechaAlquiler = fechaAlquiler;
        this.novedad = novedad;
        this.genero = genero;
    }

    public int getUsername() {
        return username;
    }

    public void setUsername(int username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public boolean isNovedad() {
        return novedad;
    }

    public void setNovedad(boolean novedad) {
        this.novedad = novedad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "username=" + username + ", id=" + id + ", fechaAlquiler=" + fechaAlquiler + ", novedad=" + novedad + ", genero=" + genero + '}';
    }
    
    
}
