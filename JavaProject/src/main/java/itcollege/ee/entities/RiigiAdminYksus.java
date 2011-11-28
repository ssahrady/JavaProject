package itcollege.ee.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the RIIGI_ADMIN_YKSUS database table.
 * 
 */
@Entity
@Table(name="RIIGI_ADMIN_YKSUS")
public class RiigiAdminYksus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="RIIGI_ADMIN_YKSUS_ID", unique=true, nullable=false)
	private int riigiAdminYksusId;

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

	@Column(length=20)
	private String kood;

    @Temporal( TemporalType.DATE)
	@Column(nullable=false)
	private Date kuni;

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

	//bi-directional many-to-one association to AdminAlluvus
	@OneToMany(mappedBy="riigiAdminYksus1")
	private Set<AdminAlluvus> adminAlluvuses1;

	//bi-directional many-to-one association to AdminAlluvus
	@OneToMany(mappedBy="riigiAdminYksus2")
	private Set<AdminAlluvus> adminAlluvuses2;

	//bi-directional many-to-one association to RiigiAdminYksuseLiik
    @ManyToOne
	@JoinColumn(name="RIIGI_ADMIN_YKSUSE_LIK_ID", nullable=false)
	private RiigiAdminYksuseLiik riigiAdminYksuseLiik;

	//bi-directional many-to-one association to Ruumiyksus
	@OneToMany(mappedBy="riigiAdminYksus")
	private Set<Ruumiyksus> ruumiyksuses;

	//bi-directional many-to-one association to Vaeosa
	@OneToMany(mappedBy="riigiAdminYksus")
	private Set<Vaeosa> vaeosas;

    public RiigiAdminYksus() {
    }

	public int getRiigiAdminYksusId() {
		return this.riigiAdminYksusId;
	}

	public void setRiigiAdminYksusId(int riigiAdminYksusId) {
		this.riigiAdminYksusId = riigiAdminYksusId;
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

	public Set<AdminAlluvus> getAdminAlluvuses1() {
		return this.adminAlluvuses1;
	}

	public void setAdminAlluvuses1(Set<AdminAlluvus> adminAlluvuses1) {
		this.adminAlluvuses1 = adminAlluvuses1;
	}
	
	public Set<AdminAlluvus> getAdminAlluvuses2() {
		return this.adminAlluvuses2;
	}

	public void setAdminAlluvuses2(Set<AdminAlluvus> adminAlluvuses2) {
		this.adminAlluvuses2 = adminAlluvuses2;
	}
	
	public RiigiAdminYksuseLiik getRiigiAdminYksuseLiik() {
		return this.riigiAdminYksuseLiik;
	}

	public void setRiigiAdminYksuseLiik(RiigiAdminYksuseLiik riigiAdminYksuseLiik) {
		this.riigiAdminYksuseLiik = riigiAdminYksuseLiik;
	}
	
	public Set<Ruumiyksus> getRuumiyksuses() {
		return this.ruumiyksuses;
	}

	public void setRuumiyksuses(Set<Ruumiyksus> ruumiyksuses) {
		this.ruumiyksuses = ruumiyksuses;
	}
	
	public Set<Vaeosa> getVaeosas() {
		return this.vaeosas;
	}

	public void setVaeosas(Set<Vaeosa> vaeosas) {
		this.vaeosas = vaeosas;
	}
	
}