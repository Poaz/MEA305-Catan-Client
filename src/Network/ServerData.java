package Network;

import com.esotericsoftware.kryonet.Connection;
import mainGame.GUI_Overlay;
import mainGame.PlayerStats;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * This class is what is received from the server, and contains everything meant to be seen and accessed from other clients.
 * The method unpack() is called when data is received, which copies variables from here to PlayerStats, for the client to use
 */
public class ServerData
{
    public String[] names = new String[]{"", "", "", ""};
    public int[] points = new int[]{0, 0, 0, 0};
    public int[] knightsPlayed = new int[]{0, 0, 0, 0};
    public int[] resourcesOnHand = new int[]{0, 0, 0, 0};
    public boolean[] lobbyReadyAll = new boolean[]{false, false, false, false};
    public int longestRoad[] = new int[]{0, 0, 0, 0};
    public int turn, die1, die2, ID, cardID;
    public boolean StartGame = false, gameStart = false;
    public String[] textToRender = new String[]{"", "", ""};
    public String[] oldText = new String[10];
    public ArrayList<Integer> cards = new ArrayList<Integer>();
    public int[] serializedHouse = new int[]{0,0};
    public int[] serializedRoad = new int[] {0,0};
    public int serializedCity = 99;
    public int serializedThief = 99;
    public boolean endTurn = false, diceRoll;
    public boolean diceUsed = true;
    public int turnorderturn = 1;
    public boolean gameEnded = false;
    public boolean[] playerturn = new boolean[]{true, false, false, false};
    public Connection c;
    boolean first = true;
    public int[] rolledDiceStatistics = new int[]{0,0,0,0,0,0,0,0,0,0,0,0};
    public boolean sendTrade = false;
    public boolean resetTradingResources = true;
    public int[] resourcesTrade = new int[10];
    public int targetPlayerTrade;
    public boolean tradeResourcesToHandle = false;
    public boolean updateCard;
    public boolean isCardUpToDate;
    public boolean isNormalGameRound = false;

    Integer[] yieldNumbers = {2, 3, 3, 4, 4, 5, 5, 6, 6, 8, 8, 9, 9, 10, 10, 11, 11, 12};
    ArrayList<Integer> listOfYieldNumbers = new ArrayList<Integer>(Arrays.asList(yieldNumbers));
    ArrayList<String> listOfTileTypes = new ArrayList<String>(Arrays.<String>asList(
            "Grain", "Grain", "Grain", "Grain",
            "Lumber", "Lumber", "Lumber", "Lumber",
            "Wool", "Wool", "Wool", "Wool",
            "Ore", "Ore", "Ore",
            "Brick", "Brick", "Brick",
            "Desert"));

    public ServerData()
    {
    }

    public void unpack(Connection c)
    {
        PlayerStats.names = names;
        PlayerStats.points = points;
        PlayerStats.knightsPlayed = knightsPlayed;
        PlayerStats.resourcesOnHand = resourcesOnHand;
        PlayerStats.lobbyReadyAll = lobbyReadyAll;
        PlayerStats.longestRoad = longestRoad;
        PlayerStats.turn = turn;
        PlayerStats.StartGame = StartGame;
            PlayerStats.textToRender = textToRender;
        if(oldText[0] != null) {
            PlayerStats.oldText = oldText;
        }
        PlayerStats.ID = c.getID();
        PlayerStats.die1 = die1;
        PlayerStats.die2 = die2;
        PlayerStats.endTurn = endTurn;
        PlayerStats.diceRoll = diceRoll;
        PlayerStats.diceUsed = diceUsed;
        PlayerStats.rolledDiceStatistics = rolledDiceStatistics;
        PlayerStats.cardID = cardID;
        PlayerStats.updateCard = isCardUpToDate;
        PlayerStats.sendTrade = sendTrade;
        PlayerStats.resourcesTrade = resourcesTrade;
        PlayerStats.targetPlayerTrade = targetPlayerTrade;
        PlayerStats.resetTradingResources = resetTradingResources;
        PlayerStats.tradeResourcesToHandle = tradeResourcesToHandle;
        PlayerStats.canGetNewCard = isCardUpToDate;
        if (PlayerStats.tradeResourcesToHandle && !PlayerStats.resetTradingResources) {
            GUI_Overlay.popTrade = true;
        }
    }
}