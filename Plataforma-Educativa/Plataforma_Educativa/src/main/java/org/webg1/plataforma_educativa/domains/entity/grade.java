package org.webg1.plataforma_educativa.domains.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "grade")
public class grade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private Double score;

    @ManyToOne
    @JoinColumn(name = "content_id")
    private content content;
}
