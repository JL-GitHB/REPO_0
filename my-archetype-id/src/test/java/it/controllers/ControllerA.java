package it.controllers;

public class ControllerA {

	public ControllerA() {
		super();
	}

	private String nome;

	private String congome;

	private String descrizione;

	private String piva;

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the congome
	 */
	public String getCongome() {
		return congome;
	}

	/**
	 * @param congome the congome to set
	 */
	public void setCongome(String congome) {
		this.congome = congome;
	}

	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}

	/**
	 * @param descrizione the descrizione to set
	 */
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	/**
	 * @return the piva
	 */
	public String getPiva() {
		return piva;
	}

	/**
	 * @param piva the piva to set
	 */
	public void setPiva(String piva) {
		this.piva = piva;
	}

}
