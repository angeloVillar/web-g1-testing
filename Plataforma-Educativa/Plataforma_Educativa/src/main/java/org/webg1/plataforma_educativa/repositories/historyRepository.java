package org.webg1.plataforma_educativa.repositories;

import com.Plataforma_Educativa.domains.entity.history;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface historyRepository extends JpaRepository<history, Long> {
}
