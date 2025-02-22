package org.webg1.plataforma_educativa.domains.dto;

import lombok.Data;
import java.util.Date;

@Data
public class historyDTO {
    private Long contentId;
    private Long userId;
    private Date accessDate;
}
