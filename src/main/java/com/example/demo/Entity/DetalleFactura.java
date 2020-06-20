package com.example.demo.Entity;



import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name = "DetalleFactura")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetalleFactura.findAll", query = "SELECT d FROM DetalleFactura d")
    , @NamedQuery(name = "DetalleFactura.findByCantidad", query = "SELECT d FROM DetalleFactura d WHERE d.cantidad = :cantidad")
    , @NamedQuery(name = "DetalleFactura.findByPorcentajeGanancia", query = "SELECT d FROM DetalleFactura d WHERE d.porcentajeGanancia = :porcentajeGanancia")
    , @NamedQuery(name = "DetalleFactura.findByNumeroDetalleFactura", query = "SELECT d FROM DetalleFactura d WHERE d.numeroDetalleFactura = :numeroDetalleFactura")})
public class DetalleFactura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "Cantidad")
    private String cantidad;
    @Column(name = "PorcentajeGanancia")
    private String porcentajeGanancia;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "NumeroDetalleFactura")
    private Integer numeroDetalleFactura;
    @JoinColumn(name = "Articulo_Cod_Articulo", referencedColumnName = "Cod_Articulo")
    @ManyToOne(optional = false)
    private Articulo articuloCodArticulo;
    @JoinColumn(name = "Factura_NumeroFactura", referencedColumnName = "NumeroFactura")
    @ManyToOne(optional = false)
    private Factura facturaNumeroFactura;

    public DetalleFactura() {
    }

    public DetalleFactura(Integer numeroDetalleFactura) {
        this.numeroDetalleFactura = numeroDetalleFactura;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPorcentajeGanancia() {
        return porcentajeGanancia;
    }

    public void setPorcentajeGanancia(String porcentajeGanancia) {
        this.porcentajeGanancia = porcentajeGanancia;
    }

    public Integer getNumeroDetalleFactura() {
        return numeroDetalleFactura;
    }

    public void setNumeroDetalleFactura(Integer numeroDetalleFactura) {
        this.numeroDetalleFactura = numeroDetalleFactura;
    }

    public Articulo getArticuloCodArticulo() {
        return articuloCodArticulo;
    }

    public void setArticuloCodArticulo(Articulo articuloCodArticulo) {
        this.articuloCodArticulo = articuloCodArticulo;
    }

    public Factura getFacturaNumeroFactura() {
        return facturaNumeroFactura;
    }

    public void setFacturaNumeroFactura(Factura facturaNumeroFactura) {
        this.facturaNumeroFactura = facturaNumeroFactura;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numeroDetalleFactura != null ? numeroDetalleFactura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleFactura)) {
            return false;
        }
        DetalleFactura other = (DetalleFactura) object;
        if ((this.numeroDetalleFactura == null && other.numeroDetalleFactura != null) || (this.numeroDetalleFactura != null && !this.numeroDetalleFactura.equals(other.numeroDetalleFactura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.DetalleFactura[ numeroDetalleFactura=" + numeroDetalleFactura + " ]";
    }

}
