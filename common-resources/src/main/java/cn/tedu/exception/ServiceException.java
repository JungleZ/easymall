package cn.tedu.exception;

/**
 * 自定义异常
 */
public class ServiceException extends RuntimeException {
	private static final long serialVersionUID = 8000361684975719031L;

	public ServiceException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ServiceException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public ServiceException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}



	
}
