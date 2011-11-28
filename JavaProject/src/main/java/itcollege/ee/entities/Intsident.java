package itcollege.ee.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the INTSIDENT database table.
 * 
 */
@Entity
@Table(name="INTSIDENT")
public class Intsident implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="INTSIDENT_ID", unique=true, nullable=false)
	private int intsidentId;

	@Column(nullable=false, length=32)
	private String avaja;

    @Temporal( TemporalType.DATE)
	@Column(nullable=false)
	private Date avatud;

	@Column(name="GPS_LATITUUD", precision=9)
	private BigDecimal gpsLatituud;

	@Column(name="GPS_LONGITUUD", precision=9)
	private BigDecimal gpsLongituud;

	@Column(length=500)
	private String kirjeldus;

	@Column(length=500)
	private String kommentaar;

	@Column(length=20)
	private String kood;

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

    @Temporal( TemporalType.DATE)
	@Column(name="TOIMUMISE_ALGUS")
	private Date toimumiseAlgus;

    @Temporal( TemporalType.DATE)
	@Column(name="TOIMUMISE_LOPP")
	private Date toimumiseLopp;

	//bi-directional many-to-one association to IntsidendiLiik
    @ManyToOne
	@JoinColumn(name="INTSIDENDI_LIIK_ID", nullable=false)
	private IntsidendiLiik intsidendiLiik;

	//bi-directional many-to-one association to Piiriloik
    @ManyToOne
	@JoinColumn(name="PIIRILOIK_ID")
	private Piiriloik piiriloik;

	//bi-directional many-to-one association to IsikIntsidendi
	@OneToMany(mappedBy="intsident")
	private Set<IsikIntsidendi> isikIntsidendis;

	//bi-directional many-to-one association to ObjektIntsidendi
	@OneToMany(mappedBy="intsident")
	private Set<ObjektIntsidendi> objektIntsidendis;

	//bi-directional many-to-one association to PiirivalvurIntsidendi
	@OneToMany(mappedBy="intsident")
	private Set<PiirivalvurIntsidendi> piirivalvurIntsidendis;

	//bi-directional many-to-one association to VahtkondIntsidendi
	@OneToMany(mappedBy="intsident")
	private Set<VahtkondIntsidendi> vahtkondIntsidendis;

    public Intsident() {
    }

	public int getIntsidentId() {
		return this.intsidentId;
	}

	public void setIntsidentId(int intsidentId) {
		this.intsidentId = intsidentId;
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

	public BigDecimal getGpsLatituud() {
		return this.gpsLatituud;
	}

	public void setGpsLatituud(BigDecimal gpsLatituud) {
		this.gpsLatituud = gpsLatituud;
	}

	public BigDecimal getGpsLongituud() {
		return this.gpsLongituud;
	}

	public void setGpsLongituud(BigDecimal gpsLongituud) {
		this.gpsLongituud = gpsLongituud;
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

	public Date getToimumiseAlgus() {
		return this.toimumiseAlgus;
	}

	public void setToimumiseAlgus(Date toimumiseAlgus) {
		this.toimumiseAlgus = toimumiseAlgus;
	}

	public Date getToimumiseLopp() {
		return this.toimumiseLopp;
	}

	public void setToimumiseLopp(Date toimumiseLopp) {
		this.toimumiseLopp = toimumiseLopp;
	}

	public IntsidendiLiik getIntsidendiLiik() {
		return this.intsidendiLiik;
	}

	public void setIntsidendiLiik(IntsidendiLiik intsidendiLiik) {
		this.intsidendiLiik = intsidendiLiik;
	}
	
	public Piiriloik getPiiriloik() {
		return this.piiriloik;
	}

	public void setPiiriloik(Piiriloik piiriloik) {
		this.piiriloik = piiriloik;
	}
	
	public Set<IsikIntsidendi> getIsikIntsidendis() {
		return this.isikIntsidendis;
	}

	public void setIsikIntsidendis(Set<IsikIntsidendi> isikIntsidendis) {
		this.isikIntsidendis = isikIntsidendis;
	}
	
	public Set<ObjektIntsidendi> getObjektIntsidendis() {
		return this.objektIntsidendis;
	}

	public void setObjektIntsidendis(Set<ObjektIntsidendi> objektIntsidendis) {
		this.objektIntsidendis = objektIntsidendis;
	}
	
	public Set<PiirivalvurIntsidendi> getPiirivalvurIntsidendis() {
		return this.piirivalvurIntsidendis;
	}

	public void setPiirivalvurIntsidendis(Set<PiirivalvurIntsidendi> piirivalvurIntsidendis) {
		this.piirivalvurIntsidendis = piirivalvurIntsidendis;
	}
	
	public Set<VahtkondIntsidendi> getVahtkondIntsidendis() {
		return this.vahtkondIntsidendis;
	}

	public void setVahtkondIntsidendis(Set<VahtkondIntsidendi> vahtkondIntsidendis) {
		this.vahtkondIntsidendis = vahtkondIntsidendis;
	}
	
}