package com.com.exception.handling;

public class InSufficientBalException extends RuntimeException {
    public  static  final long serialVersionId=-978908900;
    public  static  final int  DEFAULT_STATUS=500;
    public  static  final String DEFAULT_CODE="APP:ERROR";
    public  static  final String DEFAULT_MESSAGE="unknown error";

    private final  int httpStatus;
    private  final String code;
    private final String message="";


    public  InSufficientBalException(final InSufficientBalException other,final InSufficientBalException cause){
        super(other.getMessage (),cause);
        httpStatus= other.httpStatus;
        code=other.code;


    }

    /**
     * Constructs a new runtime exception with the specified detail
     * message, cause, suppression enabled or disabled, and writable
     * stack trace enabled or disabled.
     *
     * @param message            the detail message.
     * @param cause              the cause.  (A {@code null} value is permitted,
     *                           and indicates that the cause is nonexistent or unknown.)
     * @param enableSuppression  whether or not suppression is enabled
     *                           or disabled
     * @param writableStackTrace whether or not the stack trace should
     *                           be writable
     * @since 1.7
     */
    public InSufficientBalException (String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, int httpStatus, String code, String message1) {
        super (message, cause, enableSuppression, writableStackTrace);
        this.httpStatus = httpStatus;
        this.code = code;
    }

    /**
     * Constructs a new runtime exception with the specified cause and a
     * detail message of <tt>(cause==null ? null : cause.toString())</tt>
     * (which typically contains the class and detail message of
     * <tt>cause</tt>).  This constructor is useful for runtime exceptions
     * that are little more than wrappers for other throwables.
     *
     * @param cause the cause (which is saved for later retrieval by the
     *              {@link #getCause()} method).  (A <tt>null</tt> value is
     *              permitted, and indicates that the cause is nonexistent or
     *              unknown.)
     * @since 1.4
     */
    public InSufficientBalException (Throwable cause, int httpStatus, String code, String message) {
        super (cause);
        this.httpStatus = httpStatus;
        this.code = code;

    }

    /**
     * Constructs a new runtime exception with the specified detail message and
     * cause.  <p>Note that the detail message associated with
     * {@code cause} is <i>not</i> automatically incorporated in
     * this runtime exception's detail message.
     *
     * @param message the detail message (which is saved for later retrieval
     *                by the {@link #getMessage()} method).
     * @param cause   the cause (which is saved for later retrieval by the
     *                {@link #getCause()} method).  (A <tt>null</tt> value is
     *                permitted, and indicates that the cause is nonexistent or
     *                unknown.)
     * @since 1.4
     */
    public InSufficientBalException (String message, Throwable cause, int httpStatus, String code, String message1) {
        super (message, cause);
        this.httpStatus = httpStatus;
        this.code = code;
    }

    /**
     * Constructs a new runtime exception with the specified detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     *
     * @param message the detail message. The detail message is saved for
     *                later retrieval by the {@link #getMessage()} method.
     */
    public InSufficientBalException (String message, int httpStatus, String code, String message1) {
        super (message);
        this.httpStatus = httpStatus;
        this.code = code;

    }

    /**
     * Constructs a new runtime exception with {@code null} as its
     * detail message.  The cause is not initialized, and may subsequently be
     * initialized by a call to {@link #initCause}.
     */
    public InSufficientBalException (int httpStatus, String code, String message) {
        this.httpStatus = httpStatus;
        this.code = code;
    }

    public InSufficientBalException (int httpStatus, String code) {
        this.httpStatus = httpStatus;
        this.code = code;
    }

    public int getHttpStatus () {
        return httpStatus;
    }

    public String getCode () {
        return code;
    }

    @Override
    public String getMessage () {
        return message;
    }




}
