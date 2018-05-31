/**
 * Created by sanchitgupta001 on 27/05/18.
 */
package org.qwerty.nit;

public class Triangle1 {
    private String type;
    private int height;

    public Triangle1(String type) {
        this.type = type;
    }

    public Triangle1(String type, int height) {
        this.type = type;
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHeight() {
        return height;
    }

    public void draw() {
        System.out.println(getType() + " Triangle Drawn of height " + getHeight());
    }
}
