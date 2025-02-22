package org.webg1.plataforma_educativa.service;

import Plataforma_Educativa.model.dto.CursoDTO;
import Plataforma_Educativa.model.entity.Contenido;
import Plataforma_Educativa.model.entity.Curso;
import java.util.List;

public interface CursoService {
    Curso crearCurso(CursoDTO cursoDTO);
    Curso editarCurso(Long cursoID, Curso curso);
    void eliminarCurso(Long cursoID);
    Curso obtenerCursoPorID(Long cursoID);
    Contenido agregarContenido(Long cursoID, Contenido contenido);
}