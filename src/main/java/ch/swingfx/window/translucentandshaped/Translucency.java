package ch.swingfx.window.translucentandshaped;

/**
 * This enum is used in combination with {@link ITranslucentAndShapedWindowApi}.isTranslucencySupported()<br />
 * @author Heinrich Spreiter
 *
 */
public enum Translucency {
	/** shaping */
	PERPIXEL_TRANSPARENT,
	/** simple translucency (everything or nothing) */
	TRANSLUCENT,
	/** per-pixel translucency (example: Only window but not the button).<br/>
	 * check with isTranslucencyCapable(gc)  */
	PERPIXEL_TRANSLUCENT
}
