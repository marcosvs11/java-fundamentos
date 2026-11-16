package ex03;

import java.util.Scanner;

public class ControleRemoto implements Controlador {
    // atributos
    private int volume;
    private int volumeAnterior;
    private boolean ligado;
    private boolean tocando;

    // métodos definidos interface
    @Override
    public void ligar() {
        if (!getLigado()) {
            setLigado(true);
            System.out.println("Ligando...");
        } else {
            System.out.println("Dispositivo já está ligado!");
        }
    }

    @Override
    public void desligar() {
        if (getLigado()) {
            setLigado(false);
            setTocando(false);
            System.out.println("Desligando...");
        } else {
            System.out.println("Dispositivo já está desligado");
        }
    }

    @Override
    public void abrirMenu() {
        Scanner teclado = new Scanner(System.in);
        boolean flag;
        do {
            if (getLigado()) {
                flag = false;
                System.out.println("Abrindo menu...");
                System.out.println("===================");
                System.out.println("    OSvieira");
                System.out.println("===================");
                System.out.println("1 - Wetflix");
                System.out.println("2 - Voutube");
                System.out.println("3 - GrimeVídeo");
                System.out.println("0 - Sair");
                System.out.print("Digite a sua opção: ");
                int opcao = teclado.nextInt();
                if (opcao == 1 || opcao == 2 || opcao == 3) {
                    System.out.println("Plataforma em manutenção!");
                } else if (opcao == 0) {
                    fecharMenu();
                } else {
                    System.out.println("Digite uma opção válida!");
                    flag = true;
                }
            } else {
                System.out.println("Impossível acessar menu.");
                flag = false;
            }
        } while (flag);
    }

    @Override
    public void fecharMenu() {
        if (getLigado()) {
            System.out.println("Menu está fechado.");
        } else {
            System.out.println("Impossível fechar menu com dispositivo desligado.");
        }
    }

    @Override
    public void maisVolume() {
        if  (getLigado()) {
            setVolume(getVolume() + 5);
            System.out.println("Volume: " + getVolume());
        } else {
            System.out.println("Impossível aumentar volume com o dispositivo desligado!");
        }
    }

    @Override
    public void menosVolume() {
        if  (getLigado()) {
            setVolume(getVolume() - 5);
            System.out.println("Volume: " + getVolume());
        } else {
            System.out.println("Impossível diminuir volume com o dispositivo desligado!");
        }
    }

    @Override
    public void ligarMudo() {
        if  (getLigado()) {
            volumeAnterior = getVolume();
            setVolume(0);
            System.out.println("Mudo ativado.");
        } else {
            System.out.println("Impossível ligar o mudo com o dispositivo desligado!");
        }
    }

    @Override
    public void desligarMudo() {
        if (getLigado()) {
            if (getVolume() == 0) {
                setVolume(volumeAnterior);
                System.out.println("Mudos desativado.");
            } else {
                System.out.println("Erro, o mudo não está ativado!");
            }
        } else {
            System.out.println("Impossível desligar o mudo com o dispositivo desligado!");
        }
    }

    @Override
    public void play() {
        if (getLigado()) {
            if (!getTocando()) {
                setTocando(true);
                System.out.println("Reprodução ativada.");
            } else {
                System.out.println("O play já está ativo");
            }
        } else {
            System.out.println("Impossível dar play com o dispositivo desligado!");
        }
    }

    @Override
    public void pause() {
        if (getLigado()) {
            if (getTocando()) {
                setTocando(false);
                System.out.println("Reprodução desativada.");
            } else {
                System.out.println("O pause já está ativo");
            }
        } else {
            System.out.println("Impossível dar pause com o dispositivo desligado!");
        }
    }
    // construtor
    public ControleRemoto() {
        this.volume = 0;
        this.ligado = false;
        this.tocando = false;
    }

    // métodos especiais
    private int getVolume() {
        return this.volume;
    }

    private void setVolume(int volume) {
        if (getLigado()) {
            if (volume < 0) {
                this.volume = 0;
                System.out.println("Volume mínimo atingido.");
            } else if (volume > 100) {
                this.volume = 100;
                System.out.println("Volume máximo atingido.");
            } else {
                this.volume = volume;
            }
        } else {
            System.out.println("O disposito está desligado!");
        }
    }

    private boolean getLigado() {
        return this.ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return this.tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
}
