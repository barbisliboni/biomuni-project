package br.com.project.biomuni.repository;

import br.com.project.biomuni.model.Sprinkler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SprinklerRepository extends JpaRepository<Sprinkler, Long> {
}
