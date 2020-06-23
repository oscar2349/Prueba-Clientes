package com.example.demo.Entity;


import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "Factura")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Factura.findAll", query = "SELECT f FROM Factura f")
    , @NamedQuery(name = "Factura.findByFechaFactura", query = "SELECT f FROM Factura f WHERE f.fechaFactura = :fechaFactura")
    , @NamedQuery(name = "Factura.findByNumeroFactura", query = "SELECT f FROM Factura f WHERE f.numeroFactura = :numeroFactura")})
public class Factura implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Column(name = "fechaFactura")
    //@Temporal(TemporalType.TIMESTAMP)
    private Date fechaFactura;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "numeroFactura")
    private Integer numeroFactura;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "facturanumeroFactura")
    private List<DetalleFactura> detalleFacturaCollection;
    
    @JoinColumn(name = "cliente_cif_cliente", referencedColumnName = "cif_cliente")
    @ManyToOne(optional = false)
    private Cliente clienteCifCliente;

    public Factura() {
    }

    public Factura(Integer numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public Integer getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(Integer numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    @XmlTransient
    public List<DetalleFactura> getDetalleFacturaList() {
        return detalleFacturaCollection;
    }

    public void setDetalleFacturaList(List<DetalleFactura> detalleFactura) {
        this.detalleFacturaCollection = detalleFactura;
    }

    public Cliente getClienteCifCliente() {
        return clienteCifCliente;
    }

    public void setClienteCifCliente(Cliente clienteCifCliente) {
        this.clienteCifCliente = clienteCifCliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numeroFactura != null ? numeroFactura.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "entities.Factura[ numeroFactura=" + numeroFactura + " ]";
    }

}
