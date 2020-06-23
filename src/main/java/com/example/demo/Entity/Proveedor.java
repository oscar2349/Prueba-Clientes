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

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
@Entity
@Table(name = "Proveedor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proveedor.findAll", query = "SELECT p FROM Proveedor p")
    , @NamedQuery(name = "Proveedor.findByCifProveedor", query = "SELECT p FROM Proveedor p WHERE p.cifProveedor = :cifProveedor")
    , @NamedQuery(name = "Proveedor.findByNombre", query = "SELECT p FROM Proveedor p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "Proveedor.findByApellido", query = "SELECT p FROM Proveedor p WHERE p.apellido = :apellido")
    , @NamedQuery(name = "Proveedor.findByNombreEmpresa", query = "SELECT p FROM Proveedor p WHERE p.nombreEmpresa = :nombreEmpresa")
    , @NamedQuery(name = "Proveedor.findByDirrecion", query = "SELECT p FROM Proveedor p WHERE p.dirrecion = :dirrecion")
    , @NamedQuery(name = "Proveedor.findByCiudad", query = "SELECT p FROM Proveedor p WHERE p.ciudad = :ciudad")
    , @NamedQuery(name = "Proveedor.findByCp", query = "SELECT p FROM Proveedor p WHERE p.cp = :cp")
    , @NamedQuery(name = "Proveedor.findByProvincia", query = "SELECT p FROM Proveedor p WHERE p.provincia = :provincia")
    , @NamedQuery(name = "Proveedor.findByPais", query = "SELECT p FROM Proveedor p WHERE p.pais = :pais")})
public class Proveedor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cif_Proveedor")
    private Integer cifProveedor;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "nombre_Empresa")
    private String nombreEmpresa;
    @Column(name = "dirrecion")
    private String dirrecion;
    @Column(name = "ciudad")
    private String ciudad;
    @Column(name = "cp")
    private Integer cp;
    @Column(name = "provincia")
    private String provincia;
    @Column(name = "pais")
    private String pais;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "proveedorcifProveedor")
    private Collection<Articulo> articuloCollection;

    public Proveedor() {
    }

    public Proveedor(Integer cifProveedor) {
        this.cifProveedor = cifProveedor;
    }

    public Integer getCifProveedor() {
        return cifProveedor;
    }

    public void setCifProveedor(Integer cifProveedor) {
        this.cifProveedor = cifProveedor;
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

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDirrecion() {
        return dirrecion;
    }

    public void setDirrecion(String dirrecion) {
        this.dirrecion = dirrecion;
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
    public Collection<Articulo> getArticuloCollection() {
        return articuloCollection;
    }

    public void setArticuloCollection(List<Articulo> articuloCollection) {
        this.articuloCollection = articuloCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cifProveedor != null ? cifProveedor.hashCode() : 0);
        return hash;
    }


    @Override
    public String toString() {
        return "entities.Proveedor[ cifProveedor=" + cifProveedor + " ]";
    }

}
