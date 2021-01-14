package net.sothatsit.royalurserver.network.incoming;

import net.sothatsit.royalurserver.game.GameID;

/**
 * A packet sent to request to join a game.
 *
 * @author Paddy Lamont
 */
public class PacketInJoinGame extends PacketIn {

    public GameID gameID;

    public PacketInJoinGame() {
        super(Type.JOIN_GAME);
    }

    @Override
    public void readContents(PacketReader reader) {
        this.gameID = GameID.read(reader);
    }

    @Override
    public String toString() {
        return "PacketInJoinGame(gameID=" + gameID + ")";
    }
}
