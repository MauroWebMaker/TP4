package MainPackage;

import java.util.Objects;

/**
 * @author Grupo 11
 */
public class Materia {

    private Integer idMateria;
    private Integer ano;
    private String nombre;

    public Materia() {
    }

    public Materia(Integer idMateria, Integer ano, String nombre) {
        this.idMateria = idMateria;
        this.ano = ano;
        this.nombre = nombre;
    }

    public Integer getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Integer idMateria) {
        this.idMateria = idMateria;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.idMateria;
        hash = 89 * hash + this.ano;
        hash = 89 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Materia other = (Materia) obj;
        if (this.idMateria != other.idMateria) {
            return false;
        }
        if (this.ano != other.ano) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }
    
    @Override
    public String toString() {
        return "Materia{" + "idMateria=" + idMateria + ", ano=" + ano + ", nombre=" + nombre + '}';
    }
}
