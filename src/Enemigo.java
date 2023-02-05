public class Enemigo extends Entidad{

    private int dificultad;

    // constructor por defecto
    public Enemigo(){

    }

    // constructor parametrizado

    public Enemigo(int vida, int ataque, int defensa, String nombre, int dificultad) {
        super(vida, ataque, defensa, nombre); //constructor super o padre
        this.dificultad = dificultad;

    }

    // getter y setter
    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }

    @Override
    public int turno(int accion ,Entidad Jugador) {
        int perdidavida = 0;
        if (accion == 0) {
            perdidavida = this.getAtaque() * this.getDificultad() - Jugador.getDefensa();
        } else {

            perdidavida = this.getAtaque() - Jugador.getDefensa();


        }
        Jugador.setVida(Jugador.getVida() - perdidavida);

        return Jugador.getVida();


    }

    @Override
    public void info() {
        super.info();
    }
}