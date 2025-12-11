/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nominas;

/**
 *
 * @author macky
 */
public class Empleado {
    
    private String nombre, apellidos;
    private String dni, nss;
    private int categoria, grupo, nivel;
    private int trienios;
    private String calle, ciudad, provincia;
    private int numero, cp;
   
    public Empleado (String nombre,String apellidos,String dni,String nss,String calle,int numero,String ciudad,String provincia,int cp,int categoria,int grupo,int nivel) {
        
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.nss = nss;
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.cp = cp;
        this.categoria = categoria;
        this.grupo = grupo;
        this.nivel = nivel;
        
    }
    
    // Getters
    public String getNombreCompleto(){return apellidos + ", " + nombre;}
    public String getNombre(){return nombre;}            
    public String getApellidos(){return apellidos;}
    public String getDni(){return dni;}                
    public String getNss(){return nss;}
    public String getCalle(){return calle;}
    public int getNumero(){return numero;}
    public String getCiudad(){return ciudad;}
    public String getProvincia(){return provincia;}
    public int getCp(){return cp;}
    public int getCategoria(){return categoria;}
    public int getGrupo(){return grupo;}
    public int getNivel(){return nivel;}
 
    // Setters
    public void setNombre(String nombre){this.nombre = nombre;}
    public void setApellidos(String apellidos){this.apellidos = apellidos;}
    public void setDni(String dni){this.dni = dni;}
    public void setNss(String nss){this.nss = nss;}
    public void setCalle(String calle){this.calle = calle;}
    public void setNumero(int numero){this.numero = numero;}
    public void setCiudad(String ciudad){this.ciudad = ciudad;}
    public void setProvincia(String provincia){this.provincia = provincia;}
    public void setCp(int cp){this.cp = cp ;}
    public void setCategoria(int categoria){this.categoria = categoria;}
    public void setGrupo(int grupo){this.grupo = grupo;}
    public void setNivel(int nivel){this.nivel = nivel;}
    
}