package cn.lweizhou.command.demo1;

public class ConcreteCommand extends Command {

	private Receiver receiver;

	@Override
	public void execute() {

		receiver.action();
	}

}
