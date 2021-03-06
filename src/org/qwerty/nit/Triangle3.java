/**
 * Created by sanchitgupta001 on 31/05/18.
 */
package org.qwerty.nit;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/* Life Cycle Callbacks Example */
/* InitializingBean interface: marker for bean to know that its method needs to be called after initialization */
/* DisposableBean interface: marker for bean to know that its method needs to be called after bean is destroyed */

public class Triangle3 implements InitializingBean, DisposableBean {
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

    @Override
    public void afterPropertiesSet() throws Exception { // For InitializingBean interface
        System.out.println("InitializingBean init method called for Triangle");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean destroy method called for Triangle");
    }
}
