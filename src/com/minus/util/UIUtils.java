package com.minus.util;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;

public class UIUtils {

	  /** Color*/
	  public static final Color ACTIVE_HEADER_COLOR = new Color(160, 186, 213);
	  public static final Color BORDER_COLOR = Color.LIGHT_GRAY;
	  public static final Color TRANSPARENT_COLOR = new Color(0, 0, 0, 0);
	  public static final Color DARK_RED = new Color(140, 0, 0);
	  public static final Color DARK_GREEN = new Color(0, 140, 0);
	  public static final Color DARK_BLUE = new Color(0, 0, 140);
	  
	  /** int*/
	  public static final int DEFAULT_HGAP = 10;
	  public static final int DEFAULT_VGAP = 4;
	  public static final int LARGE_VGAP = 12;

	  /** Insets */
	  public static final Insets PANEL_REGULAR_INSETS = new Insets(8, 12, 8, 12);
	  public static final Insets PANEL_SMALL_INSETS = new Insets(5, 8, 5, 8);
	  
	  

	    /**
	     * Draws a line, using the current color, between the points
	     * <code>(x1,&nbsp;y1)</code> and <code>(x2,&nbsp;y2)</code>
	     * in this graphics context's coordinate system.
	     * @param   x1  the first point's <i>x</i> coordinate.
	     * @param   y1  the first point's <i>y</i> coordinate.
	     * @param   x2  the second point's <i>x</i> coordinate.
	     * @param   y2  the second point's <i>y</i> coordinate.
	     */
	  public static void drawLine(Graphics g, int x1, int y1, int x2, int y2) {
		    g.drawLine(x1, y1, x2, y2);
	  }
}
