package itcollege.ee.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the AUASTE database table.
 * 
 */
@Entity
@Table(name="AUASTE")
public class Auaste implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="AUASTE_ID", unique=true, nullable=false)
	private int auasteId;

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

	//bi-directional many-to-one association to AuastmeMuutumine
	@OneToMany(mappedBy="auaste")
	private Set<AuastmeMuutumine> auastmeMuutumines;

    public Auaste() {
    }

	public int getAuasteId() {
		return this.auasteId;
	}

	public void setAuasteId(int auasteId) {
		this.auasteId = auasteId;
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

	public Set<AuastmeMuutumine> getAuastmeMuutumines() {
		return this.auastmeMuutumines;
	}

	public void setAuastmeMuutumines(Set<AuastmeMuutumine> auastmeMuutumines) {
		this.auastmeMuutumines = auastmeMuutumines;
	}
	
}