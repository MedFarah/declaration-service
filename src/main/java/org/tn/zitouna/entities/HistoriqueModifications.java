package org.tn.zitouna.entities;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@Document
public class HistoriqueModifications {
	@Id
	private String id;
	private Double version;
	private Date date;
	private String modification;
	private String origine;
	

}
