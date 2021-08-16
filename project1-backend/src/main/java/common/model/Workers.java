package common.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;//look into this. just copying from vimals ex. 
//also looking at stack overflow for better definition on these annotations 

@SuppressWarnings("serial")
@Entity(name="workers")
public class Workers implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="id_generator")
	@SequenceGenerator(name="id_generator", sequenceName="workers_worker_id_seq",allocationSize=1)//look at this again
	@Column(name="worker_id")
	private int id;
	
	@Column(name="fname") 
	private String fname;
	
	@Column(name="lname")
	private String lname;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="worker_role")
	private String role;
	
	@Column(name="worker_role_id")
	private int role_id;
	
	@Column(name="ticket_id")
	private int ticket_id;
	
	@Column(name="ticket_status")
	private boolean ticket_status;//ask about this one later. might make a string, not sure
	
	@Column(name="ticket_type")
	private String ticket_type;
	
	//////constructors////////
	public Workers() {
	}
	
	public Workers(int id,String fname,String lname, String username, String password, String role,
			int role_id, int ticket_id, boolean ticket_status, String ticket_type) {
		super();
		this.id=id;
		this.fname=fname;
		this.lname=lname;
		this.username=username;
		this.password=password;
		this.role=role;
		this.role_id=role_id;
		this.ticket_id=ticket_id;
		this.ticket_status=ticket_status;
		this.ticket_type=ticket_type;
	}
	
	//getters&setters//
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname=fname;
	}
	
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname=lname;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username=username;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role=role;
	}
	
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id=role_id;
	}
	
	public int getTicket_id() {
		return ticket_id;
	}
	public void setTicket_id(int ticket_id) {
		this.ticket_id=ticket_id;
	}
	
	public boolean getTicket_status() {
		return ticket_status;
	}
	public void setTicket_status(boolean ticket_status) {
		this.ticket_status=ticket_status;
	}
	
	public String getTicket_type() {
		return ticket_type;
	}
	public void setTicket_type(String ticket_type) {
		this.ticket_type=ticket_type;
	}
	////toString////
	@Override
	public String toString() {
		return "[" +  this.id + "," + this.fname +"," +this.lname +"," +this.username +"," +
				this.password +"," +this.role +"," +this.role_id +"," +this.ticket_id +"," +
				this.ticket_status +"," +this.ticket_type + "]";
		
	}
}
