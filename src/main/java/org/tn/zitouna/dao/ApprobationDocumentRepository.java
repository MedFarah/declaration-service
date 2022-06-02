package org.tn.zitouna.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.tn.zitouna.entities.ApprobationDocument;

@Repository
public interface ApprobationDocumentRepository extends  MongoRepository<ApprobationDocument,String> {

}
