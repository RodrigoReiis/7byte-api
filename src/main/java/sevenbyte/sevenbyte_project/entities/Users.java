package sevenbyte.sevenbyte_project.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="name")
	private String name;	

	@Column(name="login")
	private String login;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
}
