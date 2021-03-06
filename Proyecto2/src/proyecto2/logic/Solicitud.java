package proyecto2.logic;
// Generated 19/10/2018 09:29:17 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Solicitud generated by hbm2java
 */
public class Solicitud  implements java.io.Serializable {


     private Integer codigo;
     private Dependencia dependencia;
     private Funcionario funcionario;
     private Date fecha;
     private Integer cantidad;
     private String tipoAdquisicion;
     private Double monto;
     private String estado;
     private String comprobante;
     private Set biens = new HashSet(0);

    public Solicitud() {
    }

	
    public Solicitud(Dependencia dependencia, Funcionario funcionario) {
        this.dependencia = dependencia;
        this.funcionario = funcionario;
    }
    public Solicitud(Dependencia dependencia, Funcionario funcionario, Date fecha, Integer cantidad, String tipoAdquisicion, Double monto, String estado, String comprobante, Set biens) {
       this.dependencia = dependencia;
       this.funcionario = funcionario;
       this.fecha = fecha;
       this.cantidad = cantidad;
       this.tipoAdquisicion = tipoAdquisicion;
       this.monto = monto;
       this.estado = estado;
       this.comprobante = comprobante;
       this.biens = biens;
    }
   
    public Integer getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public Dependencia getDependencia() {
        return this.dependencia;
    }
    
    public void setDependencia(Dependencia dependencia) {
        this.dependencia = dependencia;
    }
    public Funcionario getFuncionario() {
        return this.funcionario;
    }
    
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Integer getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    public String getTipoAdquisicion() {
        return this.tipoAdquisicion;
    }
    
    public void setTipoAdquisicion(String tipoAdquisicion) {
        this.tipoAdquisicion = tipoAdquisicion;
    }
    public Double getMonto() {
        return this.monto;
    }
    
    public void setMonto(Double monto) {
        this.monto = monto;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getComprobante() {
        return this.comprobante;
    }
    
    public void setComprobante(String comprobante) {
        this.comprobante = comprobante;
    }
    public Set getBiens() {
        return this.biens;
    }
    
    public void setBiens(Set biens) {
        this.biens = biens;
    }




}


