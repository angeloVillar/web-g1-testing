package org.webg1.plataforma_educativa.domains.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Data
@Entity
@Table(name = "material")
public class material {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private Date uploadDate;
    private String url;
    private String fileType; // PDF, DOCX, etc.
}
