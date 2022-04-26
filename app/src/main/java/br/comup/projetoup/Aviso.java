package br.comup.projetoup;

import java.util.ArrayList;

public class Aviso {

    private String mensagem;

    public Aviso() {
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public ArrayList<Aviso> avisosCadastrados(){
        ArrayList<Aviso> avisos = new ArrayList<>();

        Aviso aviso = new Aviso();
        aviso.setMensagem("Teste 1");
        avisos.add(aviso);

        aviso = new Aviso();
        aviso.setMensagem("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
        avisos.add(aviso);

        aviso = new Aviso();
        aviso.setMensagem("Teste 3");
        avisos.add(aviso);

        return avisos;
    }
}
