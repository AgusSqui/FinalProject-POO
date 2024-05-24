package jgame.gradle;


import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class ObjetoGrafico {

    protected BufferedImage imagen = null;
    double posicionX = 0;
    double posicionY = 0;
    int velocidadX = 0;
    int velocidadY = 0;

    public ObjetoGrafico(String filename) {

        try {

            imagen = ImageIO.read(getClass().getClassLoader().getResourceAsStream(filename));

        } catch (IOException e){

            System.out.println("ZAS! en ObjetoGrafico " + e);
        }
    }

    public int getWidth() {

        return imagen.getWidth();
    }

    public int getHeight() {

        return imagen.getHeight();
    }

    public void setPosicion(double posicionX, double posicionY) {

        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }

    public void setPosicionX(double posicionX) {

        this.posicionX = posicionX;
    }

    public void setPosicionY(double posicionY) {

        this.posicionY = posicionY;
    }

    public double getPosicionX() {

        return posicionX;
    }

    public double getPosicionY() {

        return this.posicionY;
    }

    public void setVelocidad(int velocidadX, int velocidadY) {

        this.velocidadX = velocidadX;
        this.velocidadY = velocidadY;
    }

    public void setVelocidadX(int velocidadX) {

        this.velocidadX = velocidadX;
    }

    public void setVelocidadY(int velocidadY) {

        this.velocidadY = velocidadY;
    }

    public int getVelocidadX() {

        return this.velocidadX;
    }

    public int getVelocidadY() {

        return this.velocidadY;
    }

    public void display(Graphics2D g2) {

        g2.drawImage(imagen, (int)this.posicionX, (int)this.posicionY, null);
    }

//    public Rectangle getBounds() {
//
//        return new Rectangle((int)this.posicionX, (int)this.posicionY, this.imagen.getWidth(), this.imagen.getHeight());
//    }
}