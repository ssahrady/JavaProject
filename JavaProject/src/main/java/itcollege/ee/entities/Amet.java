package itcollege.ee.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the AMET database table.
 * 
 */
@Entity
@Table(name="AMET")
public class Amet implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="AMET_ID", unique=true, nullable=false)
	private int ametId;

	@Column(nullable=false, length=32)
	private String avaja;

    @Temporal( TemporalType.DATE)
	@Column(nullable=false)
	private Date avatud;

	@Column(name="ISCO_KOOD", length=10)
	private String iscoKood;

	@Column(length=500)
	private String kommentaar;

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

	//bi-directional many-to-one association to AmetPiiripunkti
	@OneToMany(mappedBy="amet")
	private Set<AmetPiiripunkti> ametPiiripunktis;

	//bi-directional many-to-one association to AmetVaeosa
	@OneToMany(mappedBy="amet")
	private Set<AmetVaeosa> ametVaeosas;

    public Amet() {
    }

	public int getAmetId() {
		return this.ametId;
	}

	public void setAmetId(int ametId) {
		this.ametId = ametId;
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

	public String getIscoKood() {
		return this.iscoKood;
	}

	public void setIscoKood(String iscoKood) {
		this.iscoKood = iscoKood;
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

	public Set<AmetPiiripunkti> getAmetPiiripunktis() {
		return this.ametPiiripunktis;
	}

	public void setAmetPiiripunktis(Set<AmetPiiripunkti> ametPiiripunktis) {
		this.ametPiiripunktis = ametPiiripunktis;
	}
	
	public Set<AmetVaeosa> getAmetVaeosas() {
		return this.ametVaeosas;
	}

	public void setAmetVaeosas(Set<AmetVaeosa> ametVaeosas) {
		this.ametVaeosas = ametVaeosas;
	}
	
}