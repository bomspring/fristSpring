package SSpring;

public interface SeialCommunication {
	void send(byte[] data);
	byte[] receive();
}
