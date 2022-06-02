package org.tn.zitouna.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tn.zitouna.dao.HistoriqueModificationsRepository;
import org.tn.zitouna.entities.HistoriqueModifications;
@Service
public class HistoriqueModificationsService implements IDeclaration<HistoriqueModifications, String>{
	private HistoriqueModificationsRepository historiqueModificationsRepository;
	
	@Autowired
	public HistoriqueModificationsService(HistoriqueModificationsRepository historiqueModificationsRepository) {
		this.historiqueModificationsRepository = historiqueModificationsRepository;
	}

	@Override
	public List<HistoriqueModifications> getAll() {
		// TODO Auto-generated method stub
		return historiqueModificationsRepository.findAll();
	}

	@Override
	public HistoriqueModifications getOne(String id) {
		// TODO Auto-generated method stub
		return historiqueModificationsRepository.findById(id).get();
	}

	@Override
	public HistoriqueModifications add(HistoriqueModifications x) {
		// TODO Auto-generated method stub
		return historiqueModificationsRepository.insert(x);
	}

	@Override
	public HistoriqueModifications update(HistoriqueModifications x) {
		// TODO Auto-generated method stub
		return historiqueModificationsRepository.save(x);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		historiqueModificationsRepository.deleteById(id);
	}

}
