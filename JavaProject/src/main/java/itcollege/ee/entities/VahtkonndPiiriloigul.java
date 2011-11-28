package itcollege.ee.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the VAHTKONND_PIIRILOIGUL database table.
 * 
 */
@Entity
@Table(name="VAHTKONND_PIIRILOIGUL")
public class VahtkonndPiiriloigul implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="VAHTKOND_PIIRILOIUL_ID", unique=true, nullable=false)
	private int vahtkondPiiriloiulId;

    @Temporal( TemporalType.DATE)
	private Date alates;

	@Column(nullable=false, length=32)
	private String avaja;

    @Temporal( TemporalType.DATE)
	@Column(nullable=false)
	private Date avatud;

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

	//bi-directional many-to-one association to Piiriloik
    @ManyToOne
	@JoinColumn(name="PIIRILOIK_ID", nullable=false)
	private Piiriloik piiriloik;

	//bi-directional many-to-one association to Vahtkond
    @ManyToOne
	@JoinColumn(name="VAHTKOND_ID", nullable=false)
	private Vahtkond vahtkond;

    public VahtkonndPiiriloigul() {
    }

	public int getVahtkondPiiriloiulId() {
		return this.vahtkondPiiriloiulId;
	}

	public void setVahtkondPiiriloiulId(int vahtkondPiiriloiulId) {
		this.vahtkondPiiriloiulId = vahtkondPiiriloiulId;
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

	public Piiriloik getPiiriloik() {
		return this.piiriloik;
	}

	public void setPiiriloik(Piiriloik piiriloik) {
		this.piiriloik = piiriloik;
	}
	
	public Vahtkond getVahtkond() {
		return this.vahtkond;
	}

	public void setVahtkond(Vahtkond vahtkond) {
		this.vahtkond = vahtkond;
	}
	
}