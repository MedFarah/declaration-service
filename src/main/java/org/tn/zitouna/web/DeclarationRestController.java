package org.tn.zitouna.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.tn.zitouna.entities.ApprobationDocument;
import org.tn.zitouna.entities.Declaration;
import org.tn.zitouna.entities.HistoriqueModifications;
import org.tn.zitouna.entities.ListeDestinataires;
import org.tn.zitouna.service.ApprobationDocumentService;
import org.tn.zitouna.service.DeclarationService;
import org.tn.zitouna.service.HistoriqueModificationsService;
import org.tn.zitouna.service.ListeDestinataireService;

@RestController
public class DeclarationRestController {
	private ApprobationDocumentService approbationDocumentService;
	private DeclarationService declarationService;
	private HistoriqueModificationsService historiqueModificationsService;
	private ListeDestinataireService destinataireService;

	@Autowired
	public DeclarationRestController(ApprobationDocumentService approbationDocumentService,
			DeclarationService declarationService, HistoriqueModificationsService historiqueModificationsService,
			ListeDestinataireService destinataireService) {
		this.approbationDocumentService = approbationDocumentService;
		this.declarationService = declarationService;
		this.historiqueModificationsService = historiqueModificationsService;
		this.destinataireService = destinataireService;
	}

	@PostMapping(path = "/approbation")
	public ApprobationDocument ajouterApprobation(@RequestBody ApprobationDocument entity) {
		return approbationDocumentService.add(entity);
	}

	@PutMapping(path = "/approbation")
	public ApprobationDocument modifierApprobation(@RequestBody ApprobationDocument entity) {
		return approbationDocumentService.update(entity);
	}

	@DeleteMapping(path = "/approbation/{id}")
	public void supprimerApprobation(@PathVariable String id) {
		approbationDocumentService.delete(id);
	}

	@GetMapping(path = "/approbation")
	public List<ApprobationDocument> afficherApprobations() {
		return approbationDocumentService.getAll();
	}

	@GetMapping(path = "/approbation/{id}")
	public ApprobationDocument getApprobation(@PathVariable String id) {
		return approbationDocumentService.getOne(id);
	}

// **************************************** Declaration ******************************************************
	
	@PostMapping(path = "/declaration")
	public Declaration ajouterDeclaration(@RequestBody Declaration entity) {
		return declarationService.add(entity);
	}

	@PutMapping(path = "/declaration")
	public Declaration modifierDeclaration(@RequestBody Declaration entity) {
		return declarationService.update(entity);
	}

	@DeleteMapping(path = "/declaration/{id}")
	public void supprimerDeclaration(@PathVariable String id) {
		declarationService.delete(id);
	}

	@GetMapping(path = "/declaration")
	public List<Declaration> afficherDeclaration() {
		return declarationService.getAll();
	}

	@GetMapping(path = "/declaration/{id}")
	public Declaration getDeclaration(@PathVariable String id) {
		return declarationService.getOne(id);
	}
	
	// **************************************** Historique Modifications ******************************************************
	
		@PostMapping(path = "/historique")
		public HistoriqueModifications ajouterHistoriqueModifications(@RequestBody HistoriqueModifications entity) {
			return historiqueModificationsService.add(entity);
		}

		@PutMapping(path = "/historique")
		public HistoriqueModifications modifierHistoriqueModifications(@RequestBody HistoriqueModifications entity) {
			return historiqueModificationsService.update(entity);
		}

		@DeleteMapping(path = "/historique/{id}")
		public void supprimerHistoriqueModifications(@PathVariable String id) {
			historiqueModificationsService.delete(id);
		}

		@GetMapping(path = "/historique")
		public List<HistoriqueModifications> afficherHistoriqueModifications() {
			return historiqueModificationsService.getAll();
		}

		@GetMapping(path = "/historique/{id}")
		public HistoriqueModifications getHistoriqueModifications(@PathVariable String id) {
			return historiqueModificationsService.getOne(id);
		}
		
		
		// **************************************** Liste Destinataire ******************************************************
		
			@PostMapping(path = "/destinataire")
			public ListeDestinataires ajouterListeDestinataires(@RequestBody ListeDestinataires entity) {
				return destinataireService.add(entity);
			}

			@PutMapping(path = "/destinataire")
			public ListeDestinataires modifierListeDestinataires(@RequestBody ListeDestinataires entity) {
				return destinataireService.update(entity);
			}

			@DeleteMapping(path = "/destinataire/{id}")
			public void supprimerListeDestinataires(@PathVariable String id) {
				destinataireService.delete(id);
			}

			@GetMapping(path = "/destinataire")
			public List<ListeDestinataires> afficherListeDestinataires() {
				return destinataireService.getAll();
			}

			@GetMapping(path = "/destinataire/{id}")
			public ListeDestinataires getListeDestinataires(@PathVariable String id) {
				return destinataireService.getOne(id);
			}
	
	
	
	
	
	

}
