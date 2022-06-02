package org.tn.zitouna.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.tn.zitouna.entities.HistoriqueModifications;

@Repository
public interface HistoriqueModificationsRepository extends MongoRepository<HistoriqueModifications, String> {

}
