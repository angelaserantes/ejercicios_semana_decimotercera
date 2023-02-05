public class Jugador extends Entidad{
    private int experiencia;
    private int nivel;

    // constructor por defecto
    public Jugador() {

    }

    // constructor parametrizado
    public Jugador(int vida, int ataque, int defensa, String nombre, int experiencia, int nivel) {
        super(vida, ataque, defensa, nombre); // constructor super o padre
        this.experiencia = experiencia;
        this.nivel = nivel;
    }

    // getters y setter
    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }


    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public int turno(int accion ,Entidad Enemigo) {
        int perdidavida = 0;
        if (accion == 0) {
            perdidavida = (this.getAtaque()* this.getNivel()) - Enemigo.getDefensa();
        } else {

            perdidavida = this.getAtaque() - Enemigo.getDefensa();


        }
        Enemigo.setVida(Enemigo.getVida() - perdidavida);
        return Enemigo.getVida();

    }

    @Override
    public void info() {
        super.info();
    }
    public int experiencia(Enemigo Enemigo){

        experiencia = this.experiencia + Enemigo.getDificultad()*10;

        return  experiencia;

    }
}
