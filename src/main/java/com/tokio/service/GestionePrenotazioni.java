package com.tokio.service;
import com.tokio.model.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionePrenotazioni {
    private List<Prenotazioni> listaprenotazioni = new ArrayList<Prenotazioni>();
    private int selezione;
    static Scanner scanner = new Scanner(System.in);

    /*public GestionePrenotazioni(List<Prenotazioni> listaprenotazioni) {
        this.listaprenotazioni = listaprenotazioni;
    }

     */

    public  int getSelezione() {
        return selezione;
    }

    public  void setSelezione(int n) {
        this.selezione = n;
    }

    public void aggiungiCamera() {
    }

    public void aggiungiCliente() {

    }

    public void visualizzaPrenotazioni() {
    }

    public void cancellaPrenotazione() {
    }

    public void aggiungiPrenotazione() {
    }

    public void visualizzaCamereDisponibili() {
    }


    public static void main(String[] args) {

        System.out.println("BENVENUTO NEL SISTEMA DI GESTIONE PRENOTAZIONI HOTEL TOKIO\n" +
                "Premi 1 per registrarti come Cliente\n" +
                "Premi 2 per prenotare una Camera\n" +
                "Premi 3 per visualizzare le Camere Disponibili\n" +
                "Premi 4 per visualizzare le tue Prenotazioni\n" +
                "Premi 5 per cancellare una Prenotazione\n" +
                "Premi 6 per uscire dal sistema\n");

        GestionePrenotazioni gestionePrenotazioni = new GestionePrenotazioni();

        gestionePrenotazioni.setSelezione(scanner.nextInt());

        switch(gestionePrenotazioni.getSelezione()) {
        case 1:
            gestionePrenotazioni.aggiungiCliente();
            break;


    }
}


