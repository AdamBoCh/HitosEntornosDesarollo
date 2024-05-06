package com.ejemplo.clases;
/**
 * Representa a un alumno con identificador, nombre y curso.
 */
public class Alumno {
    private String identificador;
    private String nombre;
    private String curso;

    /**
     * Crea un nuevo alumno con identificador, nombre y curso.
     * @param identificador el identificador del alumno
     * @param nombre el nombre del alumno
     * @param curso el curso del alumno
     */
    public Alumno(String identificador, String nombre, String curso) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.curso = curso;
    }

    /**
     * Matricula al alumno en un nuevo curso incrementando el número de curso en 1.
     * @param nuevoCurso el nuevo curso en el que matricular al alumno
     */
    public void matricular(String nuevoCurso){
        this.curso = nuevoCurso + " " + (obtenerNumeroCurso() + 1);
    }

    /**
     * Pasa al alumno al siguiente curso o lo titula si ya ha pasado todos los cursos.
     */
    public void pasarDeCurso(){
        int numeroCurso = obtenerNumeroCurso();
        if(numeroCurso == 1) {
            this.curso = this.curso.split(" ")[0] + " " + (numeroCurso + 1);
        } else {
            this.curso = "Titulado en " + this.curso.split(" ")[0];
        }
    }

    private int obtenerNumeroCurso() {
        String[] partesCurso = this.curso.split(" ");
        return Integer.parseInt(partesCurso[1]);
    }

    // Getters y Setters
    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
