import java.util.Calendar;
import java.util.Date;

public final class Main {

	public static final void main(final String[] args) {
		new Main().start();
	}

	private final void start() {
		final Date d = new Date();
		final Calendar c = Calendar.getInstance();
		//
		System.out.println("d: " + d);
		System.out.println("c: " + c.getTime());
	}

}
