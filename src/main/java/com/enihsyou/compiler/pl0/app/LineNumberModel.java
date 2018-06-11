package com.enihsyou.compiler.pl0.app;


import java.awt.*;

/**
 * A generic model interface which defines an underlying component with line numbers.
 *
 * @author Greg Cope
 */

public interface LineNumberModel {


    /**
     * @return
     */

    public int getNumberLines();


    /**
     * Returns a Rectangle defining the location in the view of the parameter line. Only the y and height fields are required by callers.
     *
     * @param line
     *
     * @return A Rectangle defining the view coordinates of the line.
     */

    public Rectangle getLineRect(int line);


}
