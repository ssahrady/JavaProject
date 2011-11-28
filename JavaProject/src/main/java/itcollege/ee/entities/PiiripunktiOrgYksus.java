package itcollege.ee.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the PIIRIPUNKTI_ORG_YKSUS database table.
 * 
 */
@Entity
@Table(name="PIIRIPUNKTI_ORG_YKSUS")
public class PiiripunktiOrgYksus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PIIRIPUNKTI_ORG_YKSUS_ID", unique=true, nullable=false)
	private int piiripunktiOrgYksusId;

    @Temporal( TemporalType.DATE)
	@Column(nullable=false)
	private Date alates;

	@Column(nullable=false, length=32)
	private String avaja;

    @Temporal( TemporalType.DATE)
	@Column(nullable=false)
	private Date avatud;

	@Column(length=500)
	private String kommentaar;

	@Column(nullable=false, length=20)
	private String kood;

    @Temporal( TemporalType.DATE)
	@Column(nullable=false)
	private Date kuni;

    @Temporal( TemporalType.DATE)
	@Column(nullable=false)
	private Date muudetud;

	@Column(nullable=false, length=32)
	private String muutja;

	@Column(nullable=false, length=100)
	private String nimetus;

    @Temporal( TemporalType.DATE)
	@Column(nullable=false)
	private Date suletud;

	@Column(length=32)
	private String sulgeja;

	@Column(name="VAEOSA_ID_ID", nullable=false)
	private int vaeosaIdId;

	//bi-directional many-to-one association to Piiripunkt
    @ManyToOne
	@JoinColumn(name="PIIRIPUNKT_ID", nullable=false)
	private Piiripunkt piiripunkt;

	//bi-directional many-to-one association to PiiripunktiOrgYksus
    @ManyToOne
	@JoinColumn(name="YLEM_ORG_YKSUS_ID")
	private PiiripunktiOrgYksus piiripunktiOrgYksus;

	//bi-directional many-to-one association to PiiripunktiOrgYksus
	@OneToMany(mappedBy="piiripunktiOrgYksus")
	private Set<PiiripunktiOrgYksus> piiripunktiOrgYksuses;

    public PiiripunktiOrgYksus() {
    }

	public int getPiiripunktiOrgYksusId() {
		return this.piiripunktiOrgYksusId;
	}

	public void setPiiripunktiOrgYksusId(int piiripunktiOrgYksusId) {
		this.piiripunktiOrgYksusId = piiripunktiOrgYksusId;
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

	public int getVaeosaIdId() {
		return this.vaeosaIdId;
	}

	public void setVaeosaIdId(int vaeosaIdId) {
		this.vaeosaIdId = vaeosaIdId;
	}

	public Piiripunkt getPiiripunkt() {
		return this.piiripunkt;
	}

	public void setPiiripunkt(Piiripunkt piiripunkt) {
		this.piiripunkt = piiripunkt;
	}
	
	public PiiripunktiOrgYksus getPiiripunktiOrgYksus() {
		return this.piiripunktiOrgYksus;
	}

	public void setPiiripunktiOrgYksus(PiiripunktiOrgYksus piiripunktiOrgYksus) {
		this.piiripunktiOrgYksus = piiripunktiOrgYksus;
	}
	
	public Set<PiiripunktiOrgYksus> getPiiripunktiOrgYksuses() {
		return this.piiripunktiOrgYksuses;
	}

	public void setPiiripunktiOrgYksuses(Set<PiiripunktiOrgYksus> piiripunktiOrgYksuses) {
		this.piiripunktiOrgYksuses = piiripunktiOrgYksuses;
	}
	
}