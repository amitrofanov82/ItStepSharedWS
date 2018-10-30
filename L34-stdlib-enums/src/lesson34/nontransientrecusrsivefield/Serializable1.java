package lesson34.nontransientrecusrsivefield;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class Serializable1 implements Externalizable {
	
	int a =65;
	int b = 67;
	String c = "vasya";

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		System.out.println("Наша сериализация началась");
		out.writeByte(a);
		out.writeByte((byte) b);
		out.write(c.getBytes());
	}
	
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		System.out.println("Наша десериализация началась");
		a = in.read();
		b = in.read();
		c = in.readLine();
		System.out.println("прочитано: " + a + " " + b + " " +c);
	}
}
