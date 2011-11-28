package itcollege.ee.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the PIIRIVALVUR_INTSIDENDIS database table.
 * 
 */
@Entity
@Table(name="PIIRIVALVUR_INTSIDENDIS")
public class PiirivalvurIntsidendi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PIIRIVALVUR_INTSIDENDIS_ID", unique=true, nullable=false)
	private int piirivalvurIntsidendisId;

    @Temporal( TemporalType.DATE)
	private Date alates;

	@Column(nullable=false, length=32)
	private String avaja;

    @Temporal( TemporalType.DATE)
	@Column(nullable=false)
	private Date avatud;

	@Column(length=500)
	private String kirjeldus;

	@Column(length=500)
	private String kommentaar;

    @Temporal( TemporalType.DATE)
	private Date kuni;

    @Temporal( TemporalType.DATE)
	@Column(nullable=false)
	private Date muudetud;

	@Column(nullable=false, length=32)
	private String muutja;

    @Temporal( TemporalType.DATE)
	@Column(nullable=false)
	private Date suletud;

	@Column(length=32)
	private String sulgeja;

	//bi-directional many-to-one association to PiirivalvuriSeadusIntsidendi
	@OneToMany(mappedBy="piirivalvurIntsidendi")
	private Set<PiirivalvuriSeadusIntsidendi> piirivalvuriSeadusIntsidendis;

	//bi-directional many-to-one association to Intsident
    @ManyToOne
	@JoinColumn(name="INTSIDENT_ID")
	private Intsident intsident;

	//bi-directional many-to-one association to Piirivalvur
    @ManyToOne
	@JoinColumn(name="PIIRIVALVUR_ID", nullable=false)
	private Piirivalvur piirivalvur;

	//bi-directional many-to-one association to VahtkondIntsidendi
    @ManyToOne
	@JoinColumn(name="VAHTKOND_INTSIDENDIS_ID")
	private VahtkondIntsidendi vahtkondIntsidendi;

    public PiirivalvurIntsidendi() {
    }

	public int getPiirivalvurIntsidendisId() {
		return this.piirivalvurIntsidendisId;
	}

	public void setPiirivalvurIntsidendisId(int piirivalvurIntsidendisId) {
		this.piirivalvurIntsidendisId = piirivalvurIntsidendisId;
	}

	public Date getAlates() {
		return this.alates;
	}

	public void setAlates(Date alates) {
		this.alates = alates;
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

	public String getKirjeldus() {
		return this.kirjeldus;
	}

	public void setKirjeldus(String kirjeldus) {
		this.kirjeldus = kirjeldus;
	}

	public String getKommentaar() {
		return this.kommentaar;
	}

	public void setKommentaar(String kommentaar) {
		this.kommentaar = kommentaar;
	}

	public Date getKuni() {
		return this.kuni;
	}

	public void setKuni(Date kuni) {
		this.kuni = kuni;
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

	public Set<PiirivalvuriSeadusIntsidendi> getPiirivalvuriSeadusIntsidendis() {
		return this.piirivalvuriSeadusIntsidendis;
	}

	public void setPiirivalvuriSeadusIntsidendis(Set<PiirivalvuriSeadusIntsidendi> piirivalvuriSeadusIntsidendis) {
		this.piirivalvuriSeadusIntsidendis = piirivalvuriSeadusIntsidendis;
	}
	
	public Intsident getIntsident() {
		return this.intsident;
	}

	public void setIntsident(Intsident intsident) {
		this.intsident = intsident;
	}
	
	public Piirivalvur getPiirivalvur() {
		return this.piirivalvur;
	}

	public void setPiirivalvur(Piirivalvur piirivalvur) {
		this.piirivalvur = piirivalvur;
	}
	
	public VahtkondIntsidendi getVahtkondIntsidendi() {
		return this.vahtkondIntsidendi;
	}

	public void setVahtkondIntsidendi(VahtkondIntsidendi vahtkondIntsidendi) {
		this.vahtkondIntsidendi = vahtkondIntsidendi;
	}
	
}