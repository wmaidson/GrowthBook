public class ExecutaControleRemoto {

    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.maisVolume();
        c.ligarMudo();
        c.abrirMenu();
        c.fecharMenu();
    }
}