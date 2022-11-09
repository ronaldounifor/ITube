import model.Video;
import observer.Canal;
import observer.Usuario;

public class Main {
    public static void main(String[] args) {

        Usuario pedrito = new Usuario("Pedrito", 98, "pedrito@uni4.br");
        Usuario manoelito = new Usuario("Manoelito", 1, "wow@uni4.br");
        Usuario paulito = new Usuario("Paulito", 44, "que@uni4.br");
        Usuario davizito = new Usuario("Davizito", 55, "creatividade@uni4.br");

        Canal quasemiro = new Canal("Quasemito", new Usuario("Carlos", 14, "secreto@fbi.gov"));

        quasemiro.adicionar(pedrito);
        quasemiro.adicionar(manoelito);
        quasemiro.adicionar(paulito);
        quasemiro.adicionar(davizito);

        quasemiro.publicarVideo(new Video("*Passando mal* Melhores comidas da Paulista", 10*60));

    }
}
