package org.tn.zitouna.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.tn.zitouna.entities.ListeDestinataires;
@Repository
public interface ListeDistinataireRepository extends MongoRepository<ListeDestinataires, String> {

}
