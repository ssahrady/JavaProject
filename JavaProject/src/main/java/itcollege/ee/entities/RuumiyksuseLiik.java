package itcollege.ee.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the RUUMIYKSUSE_LIIK database table.
 * 
 */
@Entity
@Table(name="RUUMIYKSUSE_LIIK")
public class RuumiyksuseLiik implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="RUUMIYKSUSE_LIIK_ID", unique=true, nullable=false)
	private int ruumiyksuseLiikId;

	@Column(nullable=false, length=32)
	private String avaja;

    @Temporal( TemporalType.DATE)
	@Column(nullable=false)
	private Date avatud;

	@Column(length=500)
	private String kommentaar;

	@Column(length=20)
	private String kood;

    @Temporal( TemporalType.DATE)
	@Column(nullable=false)
	private Date muudetud;

	@Column(nullable=false, length=32)
	private String muutja;

	@Column(length=60)
	private String nimetus;

    @Temporal( TemporalType.DATE)
	@Column(nullable=false)
	private Date suletud;

	@Column(length=32)
	private String sulgeja;

	//bi-directional many-to-one association to Ruumiyksus
	@OneToMany(mappedBy="ruumiyksuseLiik")
	private Set<Ruumiyksus> ruumiyksuses;

    public RuumiyksuseLiik() {
    }

	public int getRuumiyksuseLiikId() {
		return this.ruumiyksuseLiikId;
	}

	public void setRuumiyksuseLiikId(int ruumiyksuseLiikId) {
		this.ruumiyksuseLiikId = ruumiyksuseLiikId;
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

	public String getKood() {
		return this.kood;
	}

	public void setKood(String kood) {
		this.kood = kood;
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

	public Set<Ruumiyksus> getRuumiyksuses() {
		return this.ruumiyksuses;
	}

	public void setRuumiyksuses(Set<Ruumiyksus> ruumiyksuses) {
		this.ruumiyksuses = ruumiyksuses;
	}
	
}