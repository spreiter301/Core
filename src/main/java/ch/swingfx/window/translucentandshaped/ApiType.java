package ch.swingfx.window.translucentandshaped;

/**
 * Enum off all supported API types for translucent and shaped windows<br />
 * For more details see http://download.oracle.com/javase/tutorial/uiswing/misc/trans_shaped_windows.html#6u10<br />
 * Note: Only Sun/Oracle JREs support sun.awt.AWTUtilities. Other JDK/JREs (example OpenJDK) do not support the private API
 * @author Heinrich Spreiter
 *
 */
public enum ApiType {
	/** support for official api */
	OFFICIAL,
	/** support for sun.awt.AWTUtilities api */
	PRIVATE,
	/** no support for any api */
	NONE
}