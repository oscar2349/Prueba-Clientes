package com.example.demo.Entity;


import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
    @Column(name = "FechaFactura")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFactura;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "NumeroFactura")
    private Integer numeroFactura;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "facturaNumeroFactura")
    private Collection<DetalleFactura> detalleFacturaCollection;
    @JoinColumn(name = "Cliente_CIF_Cliente", referencedColumnName = "CIF_Cliente")
    @ManyToOne(optional = false)
    private Cliente clienteCIFCliente;

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
    public Collection<DetalleFactura> getDetalleFacturaCollection() {
        return detalleFacturaCollection;
    }

    public void setDetalleFacturaCollection(Collection<DetalleFactura> detalleFacturaCollection) {
        this.detalleFacturaCollection = detalleFacturaCollection;
    }

    public Cliente getClienteCIFCliente() {
        return clienteCIFCliente;
    }

    public void setClienteCIFCliente(Cliente clienteCIFCliente) {
        this.clienteCIFCliente = clienteCIFCliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numeroFactura != null ? numeroFactura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Factura)) {
            return false;
        }
        Factura other = (Factura) object;
        if ((this.numeroFactura == null && other.numeroFactura != null) || (this.numeroFactura != null && !this.numeroFactura.equals(other.numeroFactura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Factura[ numeroFactura=" + numeroFactura + " ]";
    }

}
