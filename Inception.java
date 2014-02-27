public class Inception {
	private static int MAX_DREAM_DEPTH = 1000;
	private static int dreamLevel = 0;
	public static void main(String[] args) {
		try{
			if(dreamLevel++ < MAX_DREAM_DEPTH) {
				main(null);
			} else {
				throw new InceptionException();
			}
		}
		catch(InceptionException level) {
			level.kick();
			System.exit(0);
		}
	}
}
class InceptionException extends Exception {
	public InceptionException() {
		super();
	}
	public void kick() {
		printStackTrace();
	}
	public void printStackTrace() {
		System.err.println("java.lang.InceptionException: Limbo Reached.\nSorry Leo--we cannot go deeper.");
	}
}
