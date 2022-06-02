package org.tn.zitouna.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tn.zitouna.dao.ListeDistinataireRepository;
import org.tn.zitouna.entities.ListeDestinataires;
@Service
public class ListeDestinataireService implements IDeclaration<ListeDestinataires,String> {
	private ListeDistinataireRepository listeDestinataireRepository;
	
	@Autowired
	public ListeDestinataireService(ListeDistinataireRepository listeDestinataireRepository) {
		this.listeDestinataireRepository = listeDestinataireRepository;
	}

	@Override
	public List<ListeDestinataires> getAll() {
		// TODO Auto-generated method stub
		return listeDestinataireRepository.findAll();
	}

	@Override
	public ListeDestinataires getOne(String id) {
		// TODO Auto-generated method stub
		return listeDestinataireRepository.findById(id).get();
	}

	@Override
	public ListeDestinataires add(ListeDestinataires x) {
		// TODO Auto-generated method stub
		return listeDestinataireRepository.insert(x);
	}

	@Override
	public ListeDestinataires update(ListeDestinataires x) {
		// TODO Auto-generated method stub
		return listeDestinataireRepository.save(x);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		listeDestinataireRepository.deleteById(id);
	}

}
