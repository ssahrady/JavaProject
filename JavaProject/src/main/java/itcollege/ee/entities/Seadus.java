package itcollege.ee.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the SEADUS database table.
 * 
 */
@Entity
@Table(name="SEADUS")
public class Seadus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SEADUSE_ID", unique=true, nullable=false)
	private int seaduseId;

	@Column(nullable=false, length=32)
	private String avaja;

    @Temporal( TemporalType.DATE)
	@Column(nullable=false)
	private Date avatud;

	@Column(name="KEHTIV_ALATES", length=18)
	private String kehtivAlates;

	@Column(name="KEHTIV_KUNI", length=18)
	private String kehtivKuni;

	@Column(nullable=false, length=20)
	private String kommentaar;

	@Column(nullable=false, length=20)
	private String kood;

    @Temporal( TemporalType.DATE)
	@Column(nullable=false)
	private Date muudetud;

	@Column(nullable=false, length=32)
	private String muutja;

	@Column(nullable=false, length=20)
	private String nimetus;

    @Temporal( TemporalType.DATE)
	@Column(nullable=false)
	private Date suletud;

	@Column(length=32)
	private String sulgeja;

	//bi-directional many-to-one association to SeadusePunkt
	@OneToMany(mappedBy="seadus")
	private Set<SeadusePunkt> seadusePunkts;

    public Seadus() {
    }

	public int getSeaduseId() {
		return this.seaduseId;
	}

	public void setSeaduseId(int seaduseId) {
		this.seaduseId = seaduseId;
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

	public String getKehtivAlates() {
		return this.kehtivAlates;
	}

	public void setKehtivAlates(String kehtivAlates) {
		this.kehtivAlates = kehtivAlates;
	}

	public String getKehtivKuni() {
		return this.kehtivKuni;
	}

	public void setKehtivKuni(String kehtivKuni) {
		this.kehtivKuni = kehtivKuni;
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

	public Set<SeadusePunkt> getSeadusePunkts() {
		return this.seadusePunkts;
	}

	public void setSeadusePunkts(Set<SeadusePunkt> seadusePunkts) {
		this.seadusePunkts = seadusePunkts;
	}
	
}