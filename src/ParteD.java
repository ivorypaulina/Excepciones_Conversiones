class Animal {
    public void sonido() {
        System.out.println("Sonido animal");
    }
}

class Perro extends Animal {
    public void ladrar() {
        System.out.println("Guau guau");
    }
}

public class ParteD {
    public static void main(String[] args) {
        Animal animal = new Perro();

        if (animal instanceof Perro) {
//instanceof = operador de Java que sirve para verificar si un objeto pertenece a una clase.
            Perro perro = (Perro) animal;
            perro.ladrar();
        }
    }
}
