package org.tn.zitouna.entities;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document
public class Declaration {
	@Id
	private String id;
	private String description;
	private String domaine;
	private String etatEnvoie;
	private String type;
	private String modeDeLancement;
	private String periodicite;
	private String destinataire;

}
