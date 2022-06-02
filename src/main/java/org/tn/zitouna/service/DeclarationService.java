package org.tn.zitouna.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tn.zitouna.dao.DeclarationRepository;
import org.tn.zitouna.entities.Declaration;

@Service
public class DeclarationService implements IDeclaration<Declaration,String> {
	private DeclarationRepository declarationRepository;
	
	@Autowired
	public DeclarationService(DeclarationRepository declarationRepository) {
		super();
		this.declarationRepository = declarationRepository;
	}

	@Override
	public List<Declaration> getAll() {
		// TODO Auto-generated method stub
		return declarationRepository.findAll();
	}

	@Override
	public Declaration getOne(String id) {
		// TODO Auto-generated method stub
		return declarationRepository.findById(id).get();
	}

	@Override
	public Declaration add(Declaration x) {
		// TODO Auto-generated method stub
		return declarationRepository.insert(x);
	}

	@Override
	public Declaration update(Declaration x) {
		// TODO Auto-generated method stub
		return declarationRepository.save(x);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		declarationRepository.deleteById(id);
	}

}
