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
@Table(name = "Proveedor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proveedor.findAll", query = "SELECT p FROM Proveedor p")
    , @NamedQuery(name = "Proveedor.findByCIFProveedor", query = "SELECT p FROM Proveedor p WHERE p.cIFProveedor = :cIFProveedor")
    , @NamedQuery(name = "Proveedor.findByNombre", query = "SELECT p FROM Proveedor p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "Proveedor.findByApellido", query = "SELECT p FROM Proveedor p WHERE p.apellido = :apellido")
    , @NamedQuery(name = "Proveedor.findByNombreEmpresa", query = "SELECT p FROM Proveedor p WHERE p.nombreEmpresa = :nombreEmpresa")
    , @NamedQuery(name = "Proveedor.findByDirrecion", query = "SELECT p FROM Proveedor p WHERE p.dirrecion = :dirrecion")
    , @NamedQuery(name = "Proveedor.findByCiudad", query = "SELECT p FROM Proveedor p WHERE p.ciudad = :ciudad")
    , @NamedQuery(name = "Proveedor.findByCp", query = "SELECT p FROM Proveedor p WHERE p.cp = :cp")
    , @NamedQuery(name = "Proveedor.findByProvinicia", query = "SELECT p FROM Proveedor p WHERE p.provinicia = :provinicia")
    , @NamedQuery(name = "Proveedor.findByPais", query = "SELECT p FROM Proveedor p WHERE p.pais = :pais")})
public class Proveedor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CIF_Proveedor")
    private Integer cIFProveedor;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Apellido")
    private String apellido;
    @Column(name = "Nombre_Empresa")
    private String nombreEmpresa;
    @Column(name = "Dirrecion")
    private String dirrecion;
    @Column(name = "Ciudad")
    private String ciudad;
    @Column(name = "CP")
    private Integer cp;
    @Column(name = "Provinicia")
    private String provinicia;
    @Column(name = "Pais")
    private String pais;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "proveedorCIFProveedor")
    private Collection<Articulo> articuloCollection;

    public Proveedor() {
    }

    public Proveedor(Integer cIFProveedor) {
        this.cIFProveedor = cIFProveedor;
    }

    public Integer getCIFProveedor() {
        return cIFProveedor;
    }

    public void setCIFProveedor(Integer cIFProveedor) {
        this.cIFProveedor = cIFProveedor;
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

    public String getProvinicia() {
        return provinicia;
    }

    public void setProvinicia(String provinicia) {
        this.provinicia = provinicia;
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

    public void setArticuloCollection(Collection<Articulo> articuloCollection) {
        this.articuloCollection = articuloCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cIFProveedor != null ? cIFProveedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proveedor)) {
            return false;
        }
        Proveedor other = (Proveedor) object;
        if ((this.cIFProveedor == null && other.cIFProveedor != null) || (this.cIFProveedor != null && !this.cIFProveedor.equals(other.cIFProveedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Proveedor[ cIFProveedor=" + cIFProveedor + " ]";
    }

}
