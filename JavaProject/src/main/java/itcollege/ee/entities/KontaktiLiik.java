package itcollege.ee.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the KONTAKTI_LIIK database table.
 * 
 */
@Entity
@Table(name="KONTAKTI_LIIK")
public class KontaktiLiik implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="KONTAKTI_LIIK_ID", unique=true, nullable=false)
	private int kontaktiLiikId;

	@Column(nullable=false, length=32)
	private String avaja;

    @Temporal( TemporalType.DATE)
	@Column(nullable=false)
	private Date avatud;

	@Column(nullable=false, length=500)
	private String kommentaar;

    @Temporal( TemporalType.DATE)
	@Column(nullable=false)
	private Date muudetud;

	@Column(nullable=false, length=32)
	private String muutja;

	@Column(nullable=false, length=60)
	private String nimetus;

    @Temporal( TemporalType.DATE)
	@Column(nullable=false)
	private Date suletud;

	@Column(length=32)
	private String sulgeja;

	@Column(name="XML_KIRJELDUS", length=500)
	private String xmlKirjeldus;

	//bi-directional many-to-one association to PiirivalvuriKontakt
	@OneToMany(mappedBy="kontaktiLiik")
	private Set<PiirivalvuriKontakt> piirivalvuriKontakts;

    public KontaktiLiik() {
    }

	public int getKontaktiLiikId() {
		return this.kontaktiLiikId;
	}

	public void setKontaktiLiikId(int kontaktiLiikId) {
		this.kontaktiLiikId = kontaktiLiikId;
	}

	public String getAvaja() {
		return this.avaja;
	}

	public void setAvaja(String avaja) {
		this.avaja = avaja;
	}

	public Date getAvatud() {
		return this.avatud;
	}

	public void setAvatud(Date avatud) {
		this.avatud = avatud;
	}

	public String getKommentaar() {
		return this.kommentaar;
	}

	public void setKommentaar(String kommentaar) {
		this.kommentaar = kommentaar;
	}

	public Date getMuudetud() {
		return this.muudetud;
	}

	public void setMuudetud(Date muudetud) {
		this.muudetud = muudetud;
	}

	public String getMuutja() {
		return this.muutja;
	}

	public void setMuutja(String muutja) {
		this.muutja = muutja;
	}

	public String getNimetus() {
		return this.nimetus;
	}

	public void setNimetus(String nimetus) {
		this.nimetus = nimetus;
	}

	public Date getSuletud() {
		return this.suletud;
	}

	public void setSuletud(Date suletud) {
		this.suletud = suletud;
	}

	public String getSulgeja() {
		return this.sulgeja;
	}

	public void setSulgeja(String sulgeja) {
		this.sulgeja = sulgeja;
	}

	public String getXmlKirjeldus() {
		return this.xmlKirjeldus;
	}

	public void setXmlKirjeldus(String xmlKirjeldus) {
		this.xmlKirjeldus = xmlKirjeldus;
	}

	public Set<PiirivalvuriKontakt> getPiirivalvuriKontakts() {
		return this.piirivalvuriKontakts;
	}

	public void setPiirivalvuriKontakts(Set<PiirivalvuriKontakt> piirivalvuriKontakts) {
		this.piirivalvuriKontakts = piirivalvuriKontakts;
	}
	
}