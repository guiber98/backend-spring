package ude.proyecto.bombsaway.websockets;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import org.jboss.logging.Logger;
import org.springframework.stereotype.Component;

@Component
@ServerEndpoint(value = "/mensaje")
public class PartidaWebSocket {

	private Session session;

	public static Set<PartidaWebSocket> listeners = new CopyOnWriteArraySet<>();

	private final static Logger logger = Logger.getLogger(PartidaWebSocket.class);

	@OnOpen
	public void onOpen(Session session) {
		this.session = session;
		listeners.add(this);
	}

	@OnMessage
	public void onMessage(String mensaje) {
		broadcast(mensaje);
	}

	@OnClose
	public void onClose(Session session) {
		listeners.remove(this);
	}

	@OnError
	public void onError(Session session, Throwable throwable) {
	}

	private static void broadcast(String mensaje) {
		for (PartidaWebSocket listener : listeners) {
			listener.sendMessage(mensaje);
		}
	}

	private void sendMessage(String mensaje) {
		try {
			this.session.getBasicRemote().sendText(mensaje);
		} catch (IOException e) {
			logger.error("Caught exception while sending message to Session Id: " + this.session.getId(),
					e.getMessage(), e);
		}
	}

}
