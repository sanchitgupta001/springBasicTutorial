/**
 * Created by sanchitgupta001 on 27/05/18.
 */
package org.qwerty.nit;

import java.util.List;

/* Using Collections for Beans Example */

public class Triangle {
    private List<Point> points;

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public void draw() {
        for(Point point : points) {
            System.out.println("Point = (" + point.getX() + ", " + point.getY() + ")");
        }
    }
}
