package edsdk;
import com.sun.jna.NativeLong;
import com.sun.jna.Structure;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.free.fr/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class EdsCapacity extends Structure {
	/// C type : EdsInt32
	public NativeLong numberOfFreeClusters;
	/// C type : EdsInt32
	public NativeLong bytesPerSector;
	/// C type : EdsBool
	public int reset;
	public EdsCapacity() {
		super();
	}
	/**
	 * @param numberOfFreeClusters C type : EdsInt32<br>
	 * @param bytesPerSector C type : EdsInt32<br>
	 * @param reset C type : EdsBool
	 */
	public EdsCapacity(NativeLong numberOfFreeClusters, NativeLong bytesPerSector, int reset) {
		super();
		this.numberOfFreeClusters = numberOfFreeClusters;
		this.bytesPerSector = bytesPerSector;
		this.reset = reset;
	}
	protected ByReference newByReference() {
		ByReference s = new ByReference();
		s.useMemory(getPointer());
		write();
		s.read();
		return s;
	}
	protected ByValue newByValue() {
		ByValue s = new ByValue();
		s.useMemory(getPointer());
		write();
		s.read();
		return s;
	}
	protected EdsCapacity newInstance() {
		EdsCapacity s = new EdsCapacity();
		s.useMemory(getPointer());
		write();
		s.read();
		return s;
	}
	public static class ByReference extends EdsCapacity implements Structure.ByReference {
		
	};
	public static class ByValue extends EdsCapacity implements Structure.ByValue {
		
	};
}