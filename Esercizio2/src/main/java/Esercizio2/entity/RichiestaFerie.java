package Esercizio2.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="richiesta_ferie")
public class RichiestaFerie {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column (name="data_creazione")
	private Date dataCreazione;
	@Column (name="data_modifica")
	private Date dataModifica;
	@Column (name="giorno_inizio")
	private Date giornoInizio;
	@Column (name="giorno_fine")
	private Date giornoFine;
	@Column
	private String motivazione;
	@Column
	private String stato;
	@Column (name="motivazione_rifiuto")
	private String motivazioneRifiuto;
	public RichiestaFerie() {
		super();
	}
	public RichiestaFerie(Integer id, String stato) {
		super();
		this.id = id;
		this.stato = stato;
	}
	public RichiestaFerie(Integer id, Date dataCreazione, Date dataModifica, Date giornoInizio, Date giornoFine,
			String motivazione, String stato, String motivazioneRifiuto) {
		super();
		this.id = id;
		this.dataCreazione = dataCreazione;
		this.dataModifica = dataModifica;
		this.giornoInizio = giornoInizio;
		this.giornoFine = giornoFine;
		this.motivazione = motivazione;
		this.stato = stato;
		this.motivazioneRifiuto = motivazioneRifiuto;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getDataCreazione() {
		return dataCreazione;
	}
	public void setDataCreazione(Date dataCreazione) {
		this.dataCreazione = dataCreazione;
	}
	public Date getDataModifica() {
		return dataModifica;
	}
	public void setDataModifica(Date dataModifica) {
		this.dataModifica = dataModifica;
	}
	public Date getGiornoInizio() {
		return giornoInizio;
	}
	public void setGiornoInizio(Date giornoInizio) {
		this.giornoInizio = giornoInizio;
	}
	public Date getGiornoFine() {
		return giornoFine;
	}
	public void setGiornoFine(Date giornoFine) {
		this.giornoFine = giornoFine;
	}
	public String getMotivazione() {
		return motivazione;
	}
	public void setMotivazione(String motivazione) {
		this.motivazione = motivazione;
	}
	public String getStato() {
		return stato;
	}
	public void setStato(String stato) {
		this.stato = stato;
	}
	public String getMotivazioneRifiuto() {
		return motivazioneRifiuto;
	}
	public void setMotivazioneRifiuto(String motivazioneRifiuto) {
		this.motivazioneRifiuto = motivazioneRifiuto;
	}
	@Override
	public String toString() {
		return "RichiestaFerie [id=" + id + ", dataCreazione=" + dataCreazione + ", dataModifica=" + dataModifica
				+ ", giornoInizio=" + giornoInizio + ", giornoFine=" + giornoFine + ", motivazione=" + motivazione
				+ ", stato=" + stato + ", motivazioneRifiuto=" + motivazioneRifiuto + "]";
	}
	
	
	

}
