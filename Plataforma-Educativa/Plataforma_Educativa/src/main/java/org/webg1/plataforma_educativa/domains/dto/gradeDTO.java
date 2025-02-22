package org.webg1.plataforma_educativa.domains.dto;

import lombok.Data;

@Data
public class gradeDTO {
    private Long userId;
    private Long contentId;
    private Double score;
}
