package br.com.mtools.helpdesk.entity;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import br.com.mtools.helpdesk.enums.ProfileEnum;
import lombok.Getter;
import lombok.Setter;

@Document
@Getter
@Setter
public class User {
	
	@Id
	private String id;
	
	@Indexed(unique = true)
	@NotBlank(message = "Email requered")
	@Email(message ="Email invalid")
	private String email;
	
	@NotBlank(message = "Password requered")
	@Size(min = 6)
	private String password;
	
	private ProfileEnum profile;	
}
