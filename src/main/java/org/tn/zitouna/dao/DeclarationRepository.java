package org.tn.zitouna.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.tn.zitouna.entities.Declaration;

@Repository
public interface DeclarationRepository extends MongoRepository<Declaration, String> {

}
