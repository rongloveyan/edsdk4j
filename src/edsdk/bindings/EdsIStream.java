package edsdk.bindings;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

/**
 * <i>native declaration : EDSDK\Header\EDSDKTypes.h</i><br>
 * This file was autogenerated by <a
 * href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a
 * href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few
 * opensource projects.</a>.<br>
 * For help, please visit <a
 * href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a
 * href="http://rococoa.dev.java.net/">Rococoa</a>, or <a
 * href="http://jna.dev.java.net/">JNA</a>.
 */
public class EdsIStream extends Structure {

    /// C type : void*
    public Pointer context;
    /**
     * @see edsdk.EdSdkLibrary.EdsReadStream<br>
     *      C type : EdsReadStream*
     */
    public Pointer read;
    /**
     * @see edsdk.EdSdkLibrary.EdsWriteStream<br>
     *      C type : EdsWriteStream*
     */
    public Pointer write;
    /**
     * @see edsdk.EdSdkLibrary.EdsSeekStream<br>
     *      C type : EdsSeekStream*
     */
    public Pointer seek;
    /**
     * @see edsdk.EdSdkLibrary.EdsTellStream<br>
     *      C type : EdsTellStream*
     */
    public Pointer tell;
    /**
     * @see edsdk.EdSdkLibrary.EdsGetStreamLength<br>
     *      C type : EdsGetStreamLength*
     */
    public Pointer getLength;

    public EdsIStream() {
        super();
        initFieldOrder();
    }

    protected void initFieldOrder() {
        setFieldOrder( new String[] { "context", "read", "write", "seek",
                                     "tell", "getLength" } );
    }

    /**
     * @param context C type : void*<br>
     * @param read @see edsdk.EdSdkLibrary.EdsReadStream<br>
     *            C type : EdsReadStream*<br>
     * @param write @see edsdk.EdSdkLibrary.EdsWriteStream<br>
     *            C type : EdsWriteStream*<br>
     * @param seek @see edsdk.EdSdkLibrary.EdsSeekStream<br>
     *            C type : EdsSeekStream*<br>
     * @param tell @see edsdk.EdSdkLibrary.EdsTellStream<br>
     *            C type : EdsTellStream*<br>
     * @param getLength @see edsdk.EdSdkLibrary.EdsGetStreamLength<br>
     *            C type : EdsGetStreamLength*
     */
    public EdsIStream( final Pointer context, final Pointer read,
                       final Pointer write, final Pointer seek,
                       final Pointer tell, final Pointer getLength ) {
        super();
        this.context = context;
        this.read = read;
        this.write = write;
        this.seek = seek;
        this.tell = tell;
        this.getLength = getLength;
        initFieldOrder();
    }

    public EdsIStream( final Pointer pointer ) {
        super( pointer );
        read();
    }

    public static class ByReference extends EdsIStream implements Structure.ByReference {

    };

    public static class ByValue extends EdsIStream implements Structure.ByValue {

    };
}
