package com.example.demo.Entity;


import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "Cliente")
@XmlRootElement

public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CIF_Cliente")
    private Integer cIFCliente;
    
    @Column(name = "Nombre")
    private String nombre;
    
    @Column(name = "Apellido")
    private String apellido;
    
    @Column(name = "Apellido2")
    private String apellido2;
    
    @Column(name = "NombreEmpresa")
    private String nombreEmpresa;
    
    @Column(name = "Direccion")
    private String direccion;
    
    @Column(name = "Ciudad")
    private String ciudad;
    
    @Column(name = "CP")
    private Integer cp;
    
    @Column(name = "Provincia")
    private String provincia;
    
    @Column(name = "Pais")
    private String pais;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "clienteCIFCliente")
    private Collection<Factura> facturaCollection;

    public Cliente() {
    }

    public Cliente(Integer cIFCliente) {
        this.cIFCliente = cIFCliente;
    }

    public Integer getCIFCliente() {
        return cIFCliente;
    }

    public void setCIFCliente(Integer cIFCliente) {
        this.cIFCliente = cIFCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getCp() {
        return cp;
    }

    public void setCp(Integer cp) {
        this.cp = cp;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @XmlTransient
    public Collection<Factura> getFacturaCollection() {
        return facturaCollection;
    }

    public void setFacturaCollection(Collection<Factura> facturaCollection) {
        this.facturaCollection = facturaCollection;
    }

    @Override
    public String toString() {
        return "entities.Cliente[ cIFCliente=" + cIFCliente + " ]";
    }

}

