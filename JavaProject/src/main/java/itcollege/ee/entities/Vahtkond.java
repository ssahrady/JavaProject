package itcollege.ee.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;

/**
 * Entity implementation class for Entity: Vahtkond
 *
 */

@Entity
@RooToString
@RooEntity

public class Vahtkond implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Vahtkond_Id;
	@Size(min=2, max=20)
	private String Kood;
	@NotNull
	@Size(min=2, max=60)
	private String Nimetus;
	@NotNull
	private ArrayList<Integer> Piiripunkt_Id;
	@DateTimeFormat(style="M-")
	@NotNull
	private Date Alates;
	@DateTimeFormat(style="M-")
	@NotNull
	private Date Kuni;
	private String Kommentaar;
	private static final long serialVersionUID = 1L;

	public Vahtkond() {
		super();
	}   
	public String getKood() {
		return this.Kood;
	}

	public void setKood(String Kood) {
		this.Kood = Kood;
	}   
	public String getNimetus() {
		return this.Nimetus;
	}

	public void setNimetus(String Nimetus) {
		this.Nimetus = Nimetus;
	}   
	public Long getId() {
		return this.Vahtkond_Id;
	}

	public void setId(Long Id) {
		this.Vahtkond_Id = Id;

	}   
	public ArrayList<Integer> getPiiripunkt() {
		return this.Piiripunkt_Id;
	}

	public void setPiiripunkt(ArrayList<Integer> Piiripunkt) {
		this.Piiripunkt_Id = Piiripunkt;
	}   
	public Date getAlates() {
		return this.Alates;
	}

	public void setAlates(Date Alates) {
		this.Alates = Alates;
	}   
	public Date getKuni() {
		return this.Kuni;
	}

	public void setKuni(Date Kuni) {
		this.Kuni = Kuni;
	}   
	public String getKomentaar() {
		return this.Kommentaar;
	}

	public void setKomentaar(String Komentaar) {
		this.Kommentaar = Komentaar;
	}
   
}
