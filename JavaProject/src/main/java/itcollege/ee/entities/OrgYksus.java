package itcollege.ee.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the ORG_YKSUS database table.
 * 
 */
@Entity
@Table(name="ORG_YKSUS")
public class OrgYksus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ORG_YKSUS_ID", unique=true, nullable=false)
	private int orgYksusId;

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

	//bi-directional many-to-one association to OrgYksus
    @ManyToOne
	@JoinColumn(name="YLEM_ORG_YKSUS_ID")
	private OrgYksus orgYksus;

	//bi-directional many-to-one association to OrgYksus
	@OneToMany(mappedBy="orgYksus")
	private Set<OrgYksus> orgYksuses;

	//bi-directional many-to-one association to Vaeosa
    @ManyToOne
	@JoinColumn(name="VAEOSA_ID_ID", nullable=false)
	private Vaeosa vaeosa;

    public OrgYksus() {
    }

	public int getOrgYksusId() {
		return this.orgYksusId;
	}

	public void setOrgYksusId(int orgYksusId) {
		this.orgYksusId = orgYksusId;
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

	public OrgYksus getOrgYksus() {
		return this.orgYksus;
	}

	public void setOrgYksus(OrgYksus orgYksus) {
		this.orgYksus = orgYksus;
	}
	
	public Set<OrgYksus> getOrgYksuses() {
		return this.orgYksuses;
	}

	public void setOrgYksuses(Set<OrgYksus> orgYksuses) {
		this.orgYksuses = orgYksuses;
	}
	
	public Vaeosa getVaeosa() {
		return this.vaeosa;
	}

	public void setVaeosa(Vaeosa vaeosa) {
		this.vaeosa = vaeosa;
	}
	
}