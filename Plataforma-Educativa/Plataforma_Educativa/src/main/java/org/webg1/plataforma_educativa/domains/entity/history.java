package org.webg1.plataforma_educativa.domains.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Data
@Entity
@Table(name = "history")
public class history {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private Date accessDate;

    @ManyToOne
    @JoinColumn(name = "content_id")
    private content content;
}
