package com.example.demo.Entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

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
@Table(name = "cliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c")
    , @NamedQuery(name = "Cliente.findByCifCliente", query = "SELECT c FROM Cliente c WHERE c.cifCliente = :cifCliente")
    , @NamedQuery(name = "Cliente.findByNombre", query = "SELECT c FROM Cliente c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "Cliente.findByApellido", query = "SELECT c FROM Cliente c WHERE c.apellido = :apellido")
    , @NamedQuery(name = "Cliente.findBySegundoApellido", query = "SELECT c FROM Cliente c WHERE c.segundoApellido = :segundoApellido")
    , @NamedQuery(name = "Cliente.findByNombreEmpresa", query = "SELECT c FROM Cliente c WHERE c.nombreEmpresa = :nombreEmpresa")
    , @NamedQuery(name = "Cliente.findByDireccion", query = "SELECT c FROM Cliente c WHERE c.direccion = :direccion")
    , @NamedQuery(name = "Cliente.findByCiudad", query = "SELECT c FROM Cliente c WHERE c.ciudad = :ciudad")
    , @NamedQuery(name = "Cliente.findByCp", query = "SELECT c FROM Cliente c WHERE c.cp = :cp")
    , @NamedQuery(name = "Cliente.findByProvincia", query = "SELECT c FROM Cliente c WHERE c.provincia = :provincia")
    , @NamedQuery(name = "Cliente.findByPais", query = "SELECT c FROM Cliente c WHERE c.pais = :pais")})
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cif_cliente")
    private Integer cifCliente;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "segundo_apellido")
    private String segundoApellido;
    @Column(name = "nombreEmpresa")
    private String nombreEmpresa;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "ciudad")
    private String ciudad;
    @Column(name = "cp")
    private Integer cp;
    @Column(name = "provincia")
    private String provincia;
    @Column(name = "pais")
    private String pais;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "clienteCifCliente")
    private Collection<Factura> facturaCollection;

    public Cliente() {
    }

    public Cliente(Integer cifCliente) {
        this.cifCliente = cifCliente;
    }

    public Integer getCifCliente() {
        return cifCliente;
    }

    public void setCifCliente(Integer cifCliente) {
        this.cifCliente = cifCliente;
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

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
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

    public void setFacturaCollection(List<Factura> facturaList) {
        this.facturaCollection = facturaCollection;
    }

    @Override
    public String toString() {
        return "entities.Cliente[ cifCliente=" + cifCliente + " ]";
    }

}
