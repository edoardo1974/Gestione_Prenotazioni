package com.tokio.model;

public class Cliente extends Dati {
    private String nome;
    private String cognome;
    private String email;
    private String telefono;
    private Prenotazioni prenotazione;

    public Cliente(String nome, String cognome, String email, String telefono, Prenotazioni prenotazione, String idcliente) {
        super(idcliente);
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.telefono = telefono;
        this.prenotazione = prenotazione;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Prenotazioni getPrenotazione() {
        return prenotazione;
    }

    public void setPrenotazione(Prenotazioni prenotazione) {
        this.prenotazione = prenotazione;
    }
}
