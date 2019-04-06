package br.com.mtools.helpdesk.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import br.com.mtools.helpdesk.enums.StatusEnum;
import lombok.Getter;
import lombok.Setter;

@Document
@Getter
@Setter
public class ChangeStatus {

	@Id
	private String id;

	@DBRef
	private Ticket ticket;

	@DBRef
	private User userChange;

	private Date dateChangeStatus;

	private StatusEnum status;

}
