public class ControleRemoto implements Controlador{

    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        volume = 50;
        ligado = false;
        tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("-----MENU-----");
        System.out.println("Esta ligado? " + this.isLigado());
        System.out.println("Esta tocando? " + this.isTocando());
        System.out.print("Volume: " + this.getVolume() + " ");
        for(int i = 0; i <= this.getVolume(); i+= 10) {
            System.out.print("/");
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if(this.isLigado()) {
            this.setVolume(this.getVolume() + 5);
        } else {
            throw new IllegalArgumentException("Impossivel aumentar o volume");
        }
    }

    @Override
    public void menosVolume() {
        if(this.isLigado()) {
            this.setVolume(this.getVolume() - 5);
        } else {
            throw new IllegalArgumentException("Impossivel diminuir o volume");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.isLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(isLigado() && getVolume() == 0) {
            setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.isLigado() && !(this.isTocando())) {
            this.setTocando(true);

        } else {
            throw new IllegalArgumentException("Nao consegui reproduzir");
        }
    }

    @Override
    public void pause() {
        if(this.isLigado() && this.isTocando()) {
            this.setTocando(false);
        } else {
            throw new IllegalArgumentException("Nao consegui pausar");
        }
    }
}
