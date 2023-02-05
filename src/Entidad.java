public abstract class Entidad {
    private int vida;
    private int ataque;
    private int defensa;
    private String nombre;

    // constructor por defecto
    public Entidad() {

    }

    // constructor parametrizado

    public Entidad(int vida, int ataque, int defensa, String nombre) {
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.nombre = nombre;
    }

    // getters y setters
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int turno(int accion) {

        return getVida();
    }

    public void info() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Vida: " + vida);
        System.out.println("Ataque: " + ataque);
        System.out.println("Defensa: " + defensa);
    }

    public abstract int turno(int accion, Entidad Enemigo);
}