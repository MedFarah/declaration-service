package org.tn.zitouna.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tn.zitouna.dao.ApprobationDocumentRepository;
import org.tn.zitouna.entities.ApprobationDocument;
@Service
public class ApprobationDocumentService implements IDeclaration<ApprobationDocument, String> {
	
private ApprobationDocumentRepository approbationDocumentRepository;

	@Autowired
	public ApprobationDocumentService(ApprobationDocumentRepository approbationDocumentRepository) {
	this.approbationDocumentRepository = approbationDocumentRepository;
}

	@Override
	public List<ApprobationDocument> getAll() {
		// TODO Auto-generated method stub
		return approbationDocumentRepository.findAll();
	}

	@Override
	public ApprobationDocument getOne(String id) {
		// TODO Auto-generated method stub
		return approbationDocumentRepository.findById(id).get();
	}

	@Override
	public ApprobationDocument add(ApprobationDocument x) {
		// TODO Auto-generated method stub
		return approbationDocumentRepository.insert(x);
	}

	@Override
	public ApprobationDocument update(ApprobationDocument x) {
		// TODO Auto-generated method stub
		return approbationDocumentRepository.save(x);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		approbationDocumentRepository.deleteById(id);
	}

}
