package apps;

public class IphoneTools implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    boolean musicaSel = false;
    boolean musicaOn = false;
    @Override
    public void tocar() {
        try{
            checarMusicaSel();
            System.out.println("tocando musica");
            musicaOn = true;
        }  catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        } 
    }

    @Override
    public void pausar() {
        try{
            checarMusicaOn();
            System.out.println("musica pausada");
            musicaOn=false;
            musicaSel=false;
        }  catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        } 
    }

    @Override
    public void selecionarMusica() {
        musicaSel= true;
        System.out.println("musica selecionada");
    }

    @Override
    public void checarMusicaOn() throws Exception {
        if (musicaOn==false)  {
            throw new Exception("Erro: nenhuma musica tocando.");
        }
    }

    @Override
    public void checarMusicaSel() throws Exception {
        if (musicaSel==false){
            throw new Exception("Erro: nenhuma musica selecionada.");
        }
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina atualizada");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

}
