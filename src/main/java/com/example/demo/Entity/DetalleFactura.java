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
    @Column(name = "cantidad")
    private String cantidad;
    
    @Column(name = "porcentajeGanancia")
    private String porcentajeGanancia;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "numeroDetalleFactura")
    private Integer numeroDetalleFactura;
    
    @JoinColumn(name = "Articulo_cod_Articulo", referencedColumnName = "cod_Articulo")
    @ManyToOne(optional = false)
    private Articulo articulocodArticulo;
    
    @JoinColumn(name = "Factura_numeroFactura", referencedColumnName = "numeroFactura")
    @ManyToOne(optional = false)
    private Factura facturanumeroFactura;

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

    public Articulo getArticulocodArticulo() {
        return articulocodArticulo;
    }

    public void setArticulocodArticulo(Articulo articulocodArticulo) {
        this.articulocodArticulo = articulocodArticulo;
    }

    public Factura getFacturanumeroFactura() {
        return facturanumeroFactura;
    }

    public void setFacturanumeroFactura(Factura facturanumeroFactura) {
        this.facturanumeroFactura = facturanumeroFactura;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numeroDetalleFactura != null ? numeroDetalleFactura.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "entities.DetalleFactura[ numeroDetalleFactura=" + numeroDetalleFactura + " ]";
    }

}
