package org.webg1.plataforma_educativa.repositories;

import com.Plataforma_Educativa.domains.entity.grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface gradeRepository extends JpaRepository<grade, Long> {
}
