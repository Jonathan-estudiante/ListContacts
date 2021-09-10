package com.example.listcontacts;

public class Contact {
    private String nombre;
    private String numero;
    private String ciudad;
    private String descripcion;
    private String foto;

    public Contact(String nombre, String numero, String ciudad, String descripcion, String foto) {
        this.nombre = nombre;
        this.numero = numero;
        this.ciudad = ciudad;
        this.descripcion = descripcion;
        this.foto = foto;
    }

    public Contact() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }


    @Override
    public String toString() {
        return "Contact{" +
                ", nombre='" + nombre + '\'' +
                ", numero='" + numero + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", foto=" + foto +
                '}';
    }
}

