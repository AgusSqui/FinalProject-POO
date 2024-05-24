package jgame.gradle;

public class Paleta extends ObjetoGrafico{

    public Paleta(String filename, double posicionX, double posicionY) {

        super(filename);
        super.setVelocidadY(200);//Modificarlo para que sea variable, o bien agregarlo como parametro al constructor!
        this.setPosicion(posicionX, posicionY);
    }

    public void subirPaleta() {

        setPosicionY(getPosicionY() - velocidadY);
    }

    public void bajarPaleta() {

        setPosicionY(getPosicionY() + velocidadY);
    }
}
