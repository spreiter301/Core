package ch.swingfx.window.translucentandshaped;

import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.Shape;
import java.awt.Window;

/**
 * Support for Translucent and Shaped Windows. It unifies the private (java 6) and official (java 7 and upwards) apis.
 * @author Heinrich Spreiter
 *
 */
public interface ITranslucentAndShapedWindowApi {
	public boolean isTranslucencySupported(Translucency translucencyKind, GraphicsDevice gd);
	public void setWindowOpacity(Window window, float opacity);
	public float getWindowOpacity(Window window);
	public void setWindowShape(Window window, Shape shape);
	public Shape getWindowShape(Window window);
	public void setWindowOpaque(Window window, boolean isOpaque);
	public boolean isWindowOpaque(Window window);
	public boolean isTranslucencyCapable(GraphicsConfiguration gc);
	public ApiType getApiType();
}
