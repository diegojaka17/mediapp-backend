package com.mitocode.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;

@ApiModel(description="Informacion de signo votal")
@Entity
@Table(name="signo_vital")
public class SignoVital {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idSignoVital;
	
	@ManyToOne
	@JoinColumn(name = "id_paciente",nullable = false, foreignKey = @ForeignKey(name = "FK_signoVital_paciente"))
	private Paciente paciente;
	
	private LocalDateTime fecha;
	
	@Column(name = "temperatura", nullable = false)
	private Double temperatura;
	
	@Column(name = "pulso", nullable = false)
	private Integer pulso;
	
	@Column(name = "ritmoRespiratorio", nullable = false)
	private Integer ritmoRespiratorio;
	
	
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public Double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(Double temperatura) {
		this.temperatura = temperatura;
	}
	public Integer getPulso() {
		return pulso;
	}
	public void setPulso(Integer pulso) {
		this.pulso = pulso;
	}
	public Integer getRitmoRespirarotio() {
		return ritmoRespiratorio;
	}
	public void setRitmoRespirarotio(Integer ritmoRespitarotio) {
		this.ritmoRespiratorio = ritmoRespitarotio;
	}
	public Integer getIdSignoVital() {
		return idSignoVital;
	}
	public void setIdSignoVital(Integer idSignoVital) {
		this.idSignoVital = idSignoVital;
	}
	
}
