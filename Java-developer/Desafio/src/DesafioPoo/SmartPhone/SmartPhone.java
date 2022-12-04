package DesafioPoo.SmartPhone;

import DesafioPoo.AparelhoTelefonico.AparelhoTelefonico;
import DesafioPoo.NavegadorInternet.NavegadorInternet;
import DesafioPoo.ReprodutorMusical.ReprodutorMusical;
import DesafioPoo.SistemaSmartPhone.SistemaSmartPhone;


public class SmartPhone {
    public static void main(String[] args) {

        SistemaSmartPhone smartPhone = new SistemaSmartPhone();
        AparelhoTelefonico aparelhoTelefonico = smartPhone;
        NavegadorInternet navegadorInternet = smartPhone;
        ReprodutorMusical reprodutorMusical = smartPhone;


        aparelhoTelefonico.atender();
        System.out.println("");
        aparelhoTelefonico.ligar();
        System.out.println("");
        aparelhoTelefonico.iniciarCorreioVoz();
        System.out.println("");
        navegadorInternet.adicinarNovaAba();
        System.out.println("");
        navegadorInternet.atualizarPagina();
        System.out.println("");
        navegadorInternet.exibirPagina();
        System.out.println("");
        reprodutorMusical.tocar();
        System.out.println("");
        reprodutorMusical.selecionarMusica();
        System.out.println("");
        reprodutorMusical.pausar();
    }
}
