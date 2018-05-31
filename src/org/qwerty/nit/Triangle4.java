/**
 * Created by sanchitgupta001 on 31/05/18.
 */
package org.qwerty.nit;

/* Custom Callback Methods */

public class Triangle4 {
    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void draw() {
        System.out.println("Point A : (" + getPointA().getX() + ", " + getPointA().getY() +")");
        System.out.println("Point B : (" + getPointB().getX() + ", " + getPointB().getY() +")");
        System.out.println("Point C : (" + getPointC().getX() + ", " + getPointC().getY() +")");
    }

    public void customInit() {
        System.out.println("Custom Init method called for Triangle");
    }

    public void customDestroy() {
        System.out.println("Custom Destroy method called for Triangle");
    }
}
