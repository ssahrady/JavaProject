package itcollege.ee.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the PIIRIVALVUR_PIIRIPUNKTIS database table.
 * 
 */
@Entity
@Table(name="PIIRIVALVUR_PIIRIPUNKTIS")
public class PiirivalvurPiiripunkti implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PIIRIVALVUR_PIIRIPUNKTIS_ID", unique=true, nullable=false)
	private int piirivalvurPiiripunktisId;

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

	@Column(nullable=false, precision=5)
	private BigDecimal koormus;

    @Temporal( TemporalType.DATE)
	@Column(nullable=false)
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

	//bi-directional many-to-one association to AmetPiiripunkti
    @ManyToOne
	@JoinColumn(name="AMET_PIIRIPUNKTIS_ID", nullable=false)
	private AmetPiiripunkti ametPiiripunkti;

	//bi-directional many-to-one association to Piirivalvur
    @ManyToOne
	@JoinColumn(name="PIIRIVALVUR_ID", nullable=false)
	private Piirivalvur piirivalvur;

    public PiirivalvurPiiripunkti() {
    }

	public int getPiirivalvurPiiripunktisId() {
		return this.piirivalvurPiiripunktisId;
	}

	public void setPiirivalvurPiiripunktisId(int piirivalvurPiiripunktisId) {
		this.piirivalvurPiiripunktisId = piirivalvurPiiripunktisId;
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

	public BigDecimal getKoormus() {
		return this.koormus;
	}

	public void setKoormus(BigDecimal koormus) {
		this.koormus = koormus;
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

	public AmetPiiripunkti getAmetPiiripunkti() {
		return this.ametPiiripunkti;
	}

	public void setAmetPiiripunkti(AmetPiiripunkti ametPiiripunkti) {
		this.ametPiiripunkti = ametPiiripunkti;
	}
	
	public Piirivalvur getPiirivalvur() {
		return this.piirivalvur;
	}

	public void setPiirivalvur(Piirivalvur piirivalvur) {
		this.piirivalvur = piirivalvur;
	}
	
}