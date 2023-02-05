public class Main {
    public static void main(String[] args) {
        Entidad[] entidades;
        Jugador _jugador_1 = new Jugador(1000, 30, 20, "Jugador_1", 5, 3);
        Enemigo _enemigo_1 = new Enemigo(1000, 20, 10, "Enemigo_1", 7);
        entidades = new Entidad[2];
        entidades[0] = _jugador_1;
        entidades[1] = _enemigo_1;


        _enemigo_1.info();
        _jugador_1.info();

        int contador=0;
        while (_jugador_1.getVida() > 0 && _enemigo_1.getVida() > 0) {
            contador++;

            for (int i = 0; i < entidades.length; i++) {
                int accion = (int) (Math.random() * 2);

                int resultado;
                if (i == 0) {
                    resultado = entidades[i].turno(accion, _enemigo_1);
                    System.out.println(entidades[i].getNombre() + " accion realizada: " + accion );

                } else {
                    resultado = entidades[i].turno(accion, _jugador_1);
                    System.out.println(entidades[i].getNombre() + " accion realizada: " + accion );
                }

            }

            System.out.println("Tras el turno " + contador + " :");
            System.out.println( _jugador_1.getNombre() + " vida restante: " + _jugador_1.getVida());
            System.out.println( _enemigo_1.getNombre() + " vida restante: " + _enemigo_1.getVida());


        }
        if (_jugador_1.getVida() <= 0) {
            System.out.println("El jugador ha perdido");

        } else {

            System.out.println("El enemigo ha perdido");
            System.out.println("Tu experiencia ha aumentado: " + _jugador_1.experiencia(_enemigo_1));

        }
    }
}


/*Trabajar con la herencia y el polimorfismo como hemos visto en este ejercicio facilita el uso de funciones o incluso clases en otras clases,
reduciendo así el código, por ejemplo a través del uso de constructores padre y mejora en alguna ocasión la programación orientada a objetos*/