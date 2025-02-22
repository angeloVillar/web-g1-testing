package org.webg1.plataforma_educativa.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContenidoDTO {
    private Long id;
    private String titulo;
    private String url;
    private Long cursoId;
}
