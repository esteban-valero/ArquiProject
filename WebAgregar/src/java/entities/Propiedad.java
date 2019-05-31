/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sistemas
 */
@Entity
@Table(name = "PROPIEDAD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Propiedad.findAll", query = "SELECT p FROM Propiedad p"),
    @NamedQuery(name = "Propiedad.findByIdproducto", query = "SELECT p FROM Propiedad p WHERE p.idproducto = :idproducto"),
    @NamedQuery(name = "Propiedad.findByCuartos", query = "SELECT p FROM Propiedad p WHERE p.cuartos = :cuartos"),
    @NamedQuery(name = "Propiedad.findByFoto", query = "SELECT p FROM Propiedad p WHERE p.foto = :foto"),
    @NamedQuery(name = "Propiedad.findByTipo", query = "SELECT p FROM Propiedad p WHERE p.tipo = :tipo"),
    @NamedQuery(name = "Propiedad.findByDireccion", query = "SELECT p FROM Propiedad p WHERE p.direccion = :direccion"),
    @NamedQuery(name = "Propiedad.findByUbicacion", query = "SELECT p FROM Propiedad p WHERE p.ubicacion = :ubicacion"),
    @NamedQuery(name = "Propiedad.findByEstado", query = "SELECT p FROM Propiedad p WHERE p.estado = :estado"),
    @NamedQuery(name = "Propiedad.findByMonto", query = "SELECT p FROM Propiedad p WHERE p.monto = :monto")})
public class Propiedad implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPRODUCTO")
    private Long idproducto;
    @Column(name = "CUARTOS")
    private Long cuartos;
    @Column(name = "FOTO")
    private Long foto;
    @Column(name = "TIPO")
    private Short tipo;
    @Size(max = 255)
    @Column(name = "DIRECCION")
    private String direccion;
    @Column(name = "UBICACION")
    private Long ubicacion;
    @Column(name = "ESTADO")
    private Short estado;
    @Column(name = "MONTO")
    private Long monto;
    @JoinColumn(name = "USUARIOSIDUSUARIO", referencedColumnName = "IDUSUARIO")
    @ManyToOne(optional = false)
    private Usuarios usuariosidusuario;

    public Propiedad() {
    }

    public Propiedad(Long idproducto) {
        this.idproducto = idproducto;
    }

    public Long getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Long idproducto) {
        this.idproducto = idproducto;
    }

    public Long getCuartos() {
        return cuartos;
    }

    public void setCuartos(Long cuartos) {
        this.cuartos = cuartos;
    }

    public Long getFoto() {
        return foto;
    }

    public void setFoto(Long foto) {
        this.foto = foto;
    }

    public Short getTipo() {
        return tipo;
    }

    public void setTipo(Short tipo) {
        this.tipo = tipo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Long getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Long ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Short getEstado() {
        return estado;
    }

    public void setEstado(Short estado) {
        this.estado = estado;
    }

    public Long getMonto() {
        return monto;
    }

    public void setMonto(Long monto) {
        this.monto = monto;
    }

    public Usuarios getUsuariosidusuario() {
        return usuariosidusuario;
    }

    public void setUsuariosidusuario(Usuarios usuariosidusuario) {
        this.usuariosidusuario = usuariosidusuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idproducto != null ? idproducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Propiedad)) {
            return false;
        }
        Propiedad other = (Propiedad) object;
        if ((this.idproducto == null && other.idproducto != null) || (this.idproducto != null && !this.idproducto.equals(other.idproducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Propiedad[ idproducto=" + idproducto + " ]";
    }
    
}
