package DesafioPoo.SistemaSmartPhone;

import DesafioPoo.AparelhoTelefonico.AparelhoTelefonico;
import DesafioPoo.NavegadorInternet.NavegadorInternet;
import DesafioPoo.ReprodutorMusical.ReprodutorMusical;

public class SistemaSmartPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {


    @Override
    public void ligar() {
        System.out.println("Ligando via SmartPhone");

    }

    @Override
    public void atender() {
        System.out.println("Atendendo via SmartPhone");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz do SmartPhone");

    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina no SmartPhone");

    }

    @Override
    public void adicinarNovaAba() {
        System.out.println("Nova aba de internet no SmartPhone");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Pagina de internet no SmartPhone");

    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica no SmartPhone");

    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada no SmartPhone");

    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica no SmartPhone");

    }
}
