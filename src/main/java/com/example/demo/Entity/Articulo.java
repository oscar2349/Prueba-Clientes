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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
    @Column(name = "cod_Articulo")
    private Integer codArticulo;
    @Column(name = "nombreArticulo")
    private String nombreArticulo;
    @Column(name = "caracteristicas")
    private String caracteristicas;
    @JoinColumn(name = "Proveedor_cif_Proveedor", referencedColumnName = "cif_Proveedor")
    @ManyToOne(optional = false)
    private Proveedor proveedorcifProveedor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "articulocodArticulo")
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

    public Proveedor getProveedorcifProveedor() {
        return proveedorcifProveedor;
    }

    public void setProveedorcifProveedor(Proveedor proveedorcifProveedor) {
        this.proveedorcifProveedor = proveedorcifProveedor;
    }

    @XmlTransient
    public Collection<DetalleFactura> getDetalleFacturaCollection() {
        return detalleFacturaCollection;
    }

    public void setDetalleFacturaCollection(List<DetalleFactura> detalleFacturaCollection) {
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
