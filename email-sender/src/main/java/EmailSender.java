
public class EmailSender {
	public static void main(String[] args) {
		final String fromEmail = "soriano.dev.2016@gmail.com";
		final String password = "uts@24";
		final String toEmail = "soriano.mateus@gmail.com";
		
		System.out.println("Initializing email send");
		
		EmailConfig config = new EmailConfig();
		
		config.sendEmail(fromEmail, password, toEmail, "Subject", "Email Body");
}
}
