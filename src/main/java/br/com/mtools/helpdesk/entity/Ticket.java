package br.com.mtools.helpdesk.entity;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import br.com.mtools.helpdesk.enums.PriorityEnum;
import br.com.mtools.helpdesk.enums.StatusEnum;
import lombok.Getter;
import lombok.Setter;

@Document
@Getter
@Setter
public class Ticket {

	@Id
	private String id;
	
	@DBRef(lazy=true)
	private User user;
	
	private Date date;
	
	private String title;
	
	private Integer number;
	
	private StatusEnum status;
	
	private PriorityEnum priority;
	
	@DBRef(lazy=true)
	private User assignedUser;
	
	private String description;
	
	private String image;
	
	@Transient
	private List<ChangeStatus> changes;
}
