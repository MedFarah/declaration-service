package org.tn.zitouna.entities;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document
public class ListeDestinataires {
	@Id
	private String id;
	private String entite;
	private String destinataire;
	private String pourApprob;
	private String pourComment;
	private String pourAppli;
	private String pourInfo;
	

}
