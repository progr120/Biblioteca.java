/* 
 * Creare un tipo che rappresenti un punto su un piano cartesiano.
 * Gli oggeti punto devono essere immodificabili.
 * Scrivere toString e equals
 * Scrivere un main che utilizzi come esempio degli oggeto di tipo punto.
*/

package objori;

import java.util.Objects;

public class Esercizio1 {
    public static void main(String[] args) {
        Point point1 = new Point(5, 5);
        Point point2 = new Point(5, 5);

        System.out.println("P1:");
        System.out.println(point1.toString());

        System.out.println("P2:");
        System.out.println(point2.toString());

        System.out.println("Sono uguale:");
        System.out.println(point1.equals(point2));
    }
}

class Punto {
    private final int x;
    private final int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /*
     * Getters...
     */

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Punto [x=" + x + ", y=" + y + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Punto punto = (Punto) obj;
        return x == punto.x && y == punto.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}

record Point(int x, int y){
    public Punto move(int deltaX, int deltaY){
        return new Punto(
        x + deltaX,
        y + deltaY);
    }
}
