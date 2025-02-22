package org.webg1.plataforma_educativa.domains.dto;

import lombok.Data;
import java.util.Date;

@Data
public class videoDTO {
    private String title;
    private String description;
    private Date uploadDate;
    private String url;
    private int duration;
}
