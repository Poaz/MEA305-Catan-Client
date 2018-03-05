package Network;

import mainGame.PlayerStats;
import mainGame.GameMap;

/**
 * This class is what is sent to the server, and contains everything meant to be seen and accessed by other clients.
 * Prior to sending, the pack() method is called, copying static variables from PlayerStats.
 */
public class ClientData
{
    public String nsname;
    public int nspoint;
    public int nsknights_played;
    public int nslength_of_road;
    public int nsresources_on_hand;
    public boolean nslobbyReady;
    public String[] nstextPackage = new String[]{"", "", ""};
    public boolean nsTextSent;
    public int[] serializedHouse = new int[]{0,0};
    public int[] serializedRoad = new int[] {0,0};
    public int serializedCity = 99;
    public int serializedThief = 99;
    public boolean endTurn = false, diceRoll, diceUsed;
    public boolean gameEnded = false;
    public boolean sendTrade = false;
    public boolean resetTradingResources = true;
    public int[] resourcesTrade = new int[10];
    public int targetPlayerTrade;
    public boolean updateCard;

    public ClientData()
    {
    }

    public void pack()
    {
        nsname = PlayerStats.name;
        nspoint = PlayerStats.point;
        nsknights_played = PlayerStats.knights_played;
        nslength_of_road = PlayerStats.length_of_road;
        nsresources_on_hand = PlayerStats.resources_on_hand;
        nslobbyReady = PlayerStats.lobbyReady;
        nstextPackage = PlayerStats.textPackage;
        nsTextSent = PlayerStats.textSent;
        endTurn = PlayerStats.endTurn;
        diceRoll = PlayerStats.diceRoll;
        serializedHouse = GameMap.serializedHouse;
        serializedRoad = GameMap.serializedRoad;
        serializedCity = GameMap.serializedCity;
        serializedThief = GameMap.serializedThief;
        endTurn = PlayerStats.endTurn;
        diceUsed = PlayerStats.diceUsed;
        sendTrade = PlayerStats.sendTrade;
        resetTradingResources = PlayerStats.resetTradingResources;
        resourcesTrade = PlayerStats.resourcesTrade;
        targetPlayerTrade = PlayerStats.targetPlayerTrade;
        updateCard = PlayerStats.updateCard;
    }

}
