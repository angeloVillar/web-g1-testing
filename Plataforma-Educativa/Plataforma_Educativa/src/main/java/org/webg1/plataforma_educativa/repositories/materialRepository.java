package org.webg1.plataforma_educativa.repositories;

import com.Plataforma_Educativa.domains.entity.material;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface materialRepository extends JpaRepository<material, Long> {
}
