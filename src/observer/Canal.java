package observer;

import model.Video;
import util.Mensagem;

public class Canal extends Observavel {
    private String nome;
    private Usuario dono;
    private Video video;

    public Canal(String nome, Usuario dono) {
        this.nome = nome;
        this.dono = dono;
    }

    public void publicarVideo(Video video){
        //Envio serializado do video pela rede - upload
        System.out.println(nome + " publicou o vídeo "+video.getTitulo());
        this.video = video;
        notificar();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Usuario getDono() {
        return dono;
    }

    public void setDono(Usuario dono) {
        this.dono = dono;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    @Override
    public String toString() {
        StringBuilder textoCanal = new StringBuilder();

        textoCanal.append(Mensagem.SEPARADOR);
        textoCanal.append(System.lineSeparator());
        textoCanal.append(Mensagem.CANAL).append(this.nome).append("(").append(this.dono.getNome()).append(")");
        textoCanal.append(System.lineSeparator());
        textoCanal.append("Vídeo: ").append(this.video.getTitulo()).append("(").append(this.video.getDuracao()).append("s").append(")");
        textoCanal.append(System.lineSeparator());

        return textoCanal.toString();
    }
}
