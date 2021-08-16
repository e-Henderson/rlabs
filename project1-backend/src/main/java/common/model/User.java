package common.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name="emp_login")
//@Entity(name="login")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="id_generator")//does not require ;
	@SequenceGenerator(name="id_generator", sequenceName="emp_login_empid_seq",allocationSize=1)
	private int empid;
	
	@Column
	private int roleid;
	@Column
	private String fname;
	@Column
	private String lname;
	@Column
	private String username;
	@Column
	private String password;
	
	public User() {}
	
	public User(String username,String password) {
		super();
		this.username=username;
		this.password=password; 
	}

	public int getEmpId() {
		return empid;
	}

	public void setEmpId(int empid) {
		this.empid = empid;
	}

	public int getRoleId() {
		return roleid;
	}

	public void setRoleId(int roleId) {
		this.roleid = roleId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
