import org.crsh.cli.Command
import org.crsh.cli.Usage
import org.crsh.command.InvocationContext

class hello {

	@Command
	@Usage("Say Hello")
	def main(InvocationContext context) {
		return "Hello JavaCRO '16!"
	}

}
