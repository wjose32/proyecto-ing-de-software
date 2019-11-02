/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A2.Proyecto.Entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author WELLINGTON
 */
@Entity
@Table(name = "cambiostock")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cambiostock.findAll", query = "SELECT c FROM Cambiostock c"),
    @NamedQuery(name = "Cambiostock.findByCodigo", query = "SELECT c FROM Cambiostock c WHERE c.codigo = :codigo"),
    @NamedQuery(name = "Cambiostock.findByCodigoProducto", query = "SELECT c FROM Cambiostock c WHERE c.codigoProducto = :codigoProducto"),
    @NamedQuery(name = "Cambiostock.findByCantidad", query = "SELECT c FROM Cambiostock c WHERE c.cantidad = :cantidad"),
    @NamedQuery(name = "Cambiostock.findByTipo", query = "SELECT c FROM Cambiostock c WHERE c.tipo = :tipo"),
    @NamedQuery(name = "Cambiostock.findByFecha", query = "SELECT c FROM Cambiostock c WHERE c.fecha = :fecha")})
public class Cambiostock implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Column(name = "codigoProducto")
    private String codigoProducto;
    @Column(name = "cantidad")
    private Integer cantidad;
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;

    public Cambiostock() {
    }

    public Cambiostock(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cambiostock)) {
            return false;
        }
        Cambiostock other = (Cambiostock) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "A2.Proyecto.Entidades.Cambiostock[ codigo=" + codigo + " ]";
    }
    
}
