// Define la interfaz 'Playable' con un único método 'play'.
interface Playable {
    void play();
}

// 'Guitar' es una clase concreta que implementa la interfaz 'Playable'.
class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("Playing the guitar, strum strum");
    }
}

// 'Piano' es otra clase concreta que implementa la interfaz 'Playable'.
class Piano implements Playable {
    @Override
    public void play() {
        System.out.println("Playing the piano, tink tink");
    }
}

public class Main {
    public static void main(String[] args) {
        // Crear instancias de Guitar y Piano
        Playable guitar = new Guitar();
        Playable piano = new Piano();

        // Llamar al método play en cada instancia
        guitar.play();  // Muestra: Playing the guitar, strum strum
        piano.play();  // Muestra: Playing the piano, tink tink

        // Array de objetos Playable
        Playable[] instruments = {guitar, piano};

        // Demostrar polimorfismo iterando a través del array y llamando a play en cada objeto
        for (Playable instrument : instruments) {
            instrument.play();
        }
    }
}
