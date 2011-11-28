package itcollege.ee.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the SUGULUSE_ROLLI_LIIK database table.
 * 
 */
@Entity
@Table(name="SUGULUSE_ROLLI_LIIK")
public class SuguluseRolliLiik implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SUGULUSE_ROLLI_LIIK_ID", unique=true, nullable=false)
	private int suguluseRolliLiikId;

	@Column(nullable=false, length=32)
	private String avaja;

    @Temporal( TemporalType.DATE)
	@Column(nullable=false)
	private Date avatud;

	@Column(nullable=false, length=500)
	private String kommentaar;

    @Temporal( TemporalType.DATE)
	@Column(nullable=false)
	private Date muudetud;

	@Column(nullable=false, length=32)
	private String muutja;

	@Column(nullable=false, length=60)
	private String nimetus;

	@Column(name="SUGULANE_VOI_MITTE", length=1)
	private String sugulaneVoiMitte;

    @Temporal( TemporalType.DATE)
	@Column(nullable=false)
	private Date suletud;

	@Column(length=32)
	private String sulgeja;

	//bi-directional many-to-one association to SeotudKontaktisik
	@OneToMany(mappedBy="suguluseRolliLiik")
	private Set<SeotudKontaktisik> seotudKontaktisiks;

    public SuguluseRolliLiik() {
    }

	public int getSuguluseRolliLiikId() {
		return this.suguluseRolliLiikId;
	}

	public void setSuguluseRolliLiikId(int suguluseRolliLiikId) {
		this.suguluseRolliLiikId = suguluseRolliLiikId;
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

	public String getSugulaneVoiMitte() {
		return this.sugulaneVoiMitte;
	}

	public void setSugulaneVoiMitte(String sugulaneVoiMitte) {
		this.sugulaneVoiMitte = sugulaneVoiMitte;
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

	public Set<SeotudKontaktisik> getSeotudKontaktisiks() {
		return this.seotudKontaktisiks;
	}

	public void setSeotudKontaktisiks(Set<SeotudKontaktisik> seotudKontaktisiks) {
		this.seotudKontaktisiks = seotudKontaktisiks;
	}
	
}