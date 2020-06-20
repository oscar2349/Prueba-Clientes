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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "Articulo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Articulo.findAll", query = "SELECT a FROM Articulo a")
    , @NamedQuery(name = "Articulo.findByCodArticulo", query = "SELECT a FROM Articulo a WHERE a.codArticulo = :codArticulo")
    , @NamedQuery(name = "Articulo.findByNombreArticulo", query = "SELECT a FROM Articulo a WHERE a.nombreArticulo = :nombreArticulo")
    , @NamedQuery(name = "Articulo.findByCaracteristicas", query = "SELECT a FROM Articulo a WHERE a.caracteristicas = :caracteristicas")})
public class Articulo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Cod_Articulo")
    private Integer codArticulo;
    @Column(name = "NombreArticulo")
    private String nombreArticulo;
    @Column(name = "Caracteristicas")
    private String caracteristicas;
    @JoinColumn(name = "Proveedor_CIF_Proveedor", referencedColumnName = "CIF_Proveedor")
    @ManyToOne(optional = false)
    private Proveedor proveedorCIFProveedor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "articuloCodArticulo")
    private Collection<DetalleFactura> detalleFacturaCollection;

    public Articulo() {
    }

    public Articulo(Integer codArticulo) {
        this.codArticulo = codArticulo;
    }

    public Integer getCodArticulo() {
        return codArticulo;
    }

    public void setCodArticulo(Integer codArticulo) {
        this.codArticulo = codArticulo;
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public Proveedor getProveedorCIFProveedor() {
        return proveedorCIFProveedor;
    }

    public void setProveedorCIFProveedor(Proveedor proveedorCIFProveedor) {
        this.proveedorCIFProveedor = proveedorCIFProveedor;
    }

    @XmlTransient
    public Collection<DetalleFactura> getDetalleFacturaCollection() {
        return detalleFacturaCollection;
    }

    public void setDetalleFacturaCollection(Collection<DetalleFactura> detalleFacturaCollection) {
        this.detalleFacturaCollection = detalleFacturaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codArticulo != null ? codArticulo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Articulo)) {
            return false;
        }
        Articulo other = (Articulo) object;
        if ((this.codArticulo == null && other.codArticulo != null) || (this.codArticulo != null && !this.codArticulo.equals(other.codArticulo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Articulo[ codArticulo=" + codArticulo + " ]";
    }

}
