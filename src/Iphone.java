import apps.IphoneTools;

public class Iphone {
    public static void main(String[] args) throws Exception {
        IphoneTools myIphone = new IphoneTools();
        myIphone.adicionarNovaAba();
        myIphone.atender();
        myIphone.atualizarPagina();
        myIphone.exibirPagina();
        myIphone.iniciarCorreioVoz();
        myIphone.ligar();
        myIphone.selecionarMusica();
        myIphone.tocar();
        myIphone.pausar();

        //testes:
        System.out.println("--testes--");
        //tocar sem selecionar musica
        System.out.println("--tocar sem selecionar musica--");
        myIphone.tocar();
        myIphone.selecionarMusica();
        myIphone.tocar();
        myIphone.pausar();
        //pausar sem tocar
        System.out.println("--pausar sem tocar--");
        myIphone.pausar();
        myIphone.selecionarMusica();
        myIphone.tocar();
        myIphone.pausar();
    
    }
}
