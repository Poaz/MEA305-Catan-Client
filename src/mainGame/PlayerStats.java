package mainGame;

import com.esotericsoftware.kryonet.Connection;
import org.newdawn.slick.Color;

/**
 * A class created for storing all the playerStats.
 * Since the Kryonet server doesn't work well with static variables, these are all copied to non-static values in ClientData,
 * and converted from non-static values in ServerData
 */
public class PlayerStats {

    // Personal stats
    public static int ID = 1;
    public static String name = "";
    public static int point = 0;
    public static int knights_played = 0;
    public static int length_of_road = 0;
    public static int resources_on_hand = 0;
    public static int TEMPpoint=0;
    public static boolean lobbyReady = false;
    public static boolean textSent = false;
    public static String[] textPackage = new String[3];
    public static String[] textToRender = new String[3];
    public static String[] oldText = new String[10];
    public static boolean endTurn = false;
    public static boolean diceRoll = false;
    public static boolean[] playerturn = new boolean[]{true,false,false,false};
    public static Color[] playerColors = new Color[]{Color.black, Color.blue, Color.red, Color.magenta, Color.cyan};
    public static boolean diceUsed;
    public static int[] rolledDiceStatistics = new int[]{0,0,0,0,0,0,0,0,0,0,0,0};
    public static int cardID;
    public static boolean updateCard;
    public static boolean sendTrade = false;
    public static boolean resetTradingResources = true;
    public static int[] resourcesTrade = new int[10];
    public static int targetPlayerTrade;
    public static boolean tradeResourcesToHandle = false;
    public static boolean adjustMyResources = false;
    public static boolean canGetNewCard = false;

    //Stats for all players
    public static String[] names = new String[]{" "," "," "," "};
    public static int[] points = new int[]{0,0,0,0};
    public static int[] knightsPlayed = new int[]{0,0,0,0};
    public static int[] resourcesOnHand = new int[]{0,0,0,0};
    public static int[] cardsOnHand = new int[]{0,0,0,0};
    public static boolean[] lobbyReadyAll = new boolean[]{true,false,false,false};
    public static int [] longestRoad = new int[]{0,0,0,0};
    public static int turn;
    public static boolean StartGame;
    public static int die1 = 0;
    public static int die2 = 0;

    public PlayerStats(){

    }
}
