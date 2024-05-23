package ma.xproce.flowerspro.dao.repositories;

import ma.xproce.flowerspro.dao.entities.Favori;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavoriRepository extends JpaRepository<Favori,Integer> {
}
