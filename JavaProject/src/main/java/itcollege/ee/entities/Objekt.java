package itcollege.ee.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the OBJEKT database table.
 * 
 */
@Entity
@Table(name="OBJEKT")
public class Objekt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="OBJEKT_ID", unique=true, nullable=false)
	private int objektId;

	@Column(nullable=false, length=32)
	private String avaja;

    @Temporal( TemporalType.DATE)
	@Column(nullable=false)
	private Date avatud;

	@Column(length=500)
	private String kommentaar;

    @Temporal( TemporalType.DATE)
	@Column(nullable=false)
	private Date muudetud;

	@Column(nullable=false, length=32)
	private String muutja;

	@Column(length=100)
	private String nimetus;

    @Temporal( TemporalType.DATE)
	@Column(nullable=false)
	private Date suletud;

	@Column(length=32)
	private String sulgeja;

	//bi-directional many-to-one association to ObjektiLiik
    @ManyToOne
	@JoinColumn(name="OBJEKT_LIIK_ID", nullable=false)
	private ObjektiLiik objektiLiik;

	//bi-directional many-to-one association to ObjektIntsidendi
	@OneToMany(mappedBy="objekt")
	private Set<ObjektIntsidendi> objektIntsidendis;

	//bi-directional many-to-one association to Piiririkkuja
	@OneToMany(mappedBy="objekt")
	private Set<Piiririkkuja> piiririkkujas;

    public Objekt() {
    }

	public int getObjektId() {
		return this.objektId;
	}

	public void setObjektId(int objektId) {
		this.objektId = objektId;
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

	public ObjektiLiik getObjektiLiik() {
		return this.objektiLiik;
	}

	public void setObjektiLiik(ObjektiLiik objektiLiik) {
		this.objektiLiik = objektiLiik;
	}
	
	public Set<ObjektIntsidendi> getObjektIntsidendis() {
		return this.objektIntsidendis;
	}

	public void setObjektIntsidendis(Set<ObjektIntsidendi> objektIntsidendis) {
		this.objektIntsidendis = objektIntsidendis;
	}
	
	public Set<Piiririkkuja> getPiiririkkujas() {
		return this.piiririkkujas;
	}

	public void setPiiririkkujas(Set<Piiririkkuja> piiririkkujas) {
		this.piiririkkujas = piiririkkujas;
	}
	
}