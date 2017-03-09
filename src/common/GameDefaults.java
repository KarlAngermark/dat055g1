package common;

import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;

/**
 * Contains static variables to ease changes and unify standards
 *
 * @author Alexander Andersson (alexaan)
 * @author Linus Berglund (belinus)
 * @author Erik Källberg (kalerik)
 * @author Timmy Truong (timmyt)
 * @author Karl Ängermark (karlang)
 * @version 2017-03-04
 */
public class GameDefaults {

  /**
   * Port to use for network connections
   */
  public static final int SERVER_PORT = 8822;
  /**
   * Global font size for large GUI Text
   */
  public static final int BIG_FONT_SIZE = 70;

  /**
   * {@code GameApplication} window title
   */
  public static final String WINDOW_TITLE = "Freet Stighter: Total Combat";
  /**
   * {@code MainMenuScreen} GUI Text title
   */
  public static final String TITLE = "Total Combat";
  /**
   * {@code MainMenuScreen} GUI Button Text
   */
  public static final String LOCAL_GAME_BUTTON_TEXT = "Local Game";
  /**
   * {@code MainMenuScreen} GUI Button Text
   */
  public static final String JOIN_GAME_BUTTON_TEXT = "Join";
  /**
   * {@code MainMenuScreen} GUI Button Text
   */
  public static final String SETTINGS_BUTTON_TEXT = "Settings";
  /**
   * {@code MainMenuScreen} GUI Button Text
   */
  public static final String EXIT_BUTTON_TEXT = "Exit";

  /**
   * Network bindings used in {@code GameClient}
   */
  public static final KeyCode MOVE_LEFT = KeyCode.A;
  /**
   * Network bindings used in {@code GameClient}
   */
  public static final KeyCode MOVE_RIGHT = KeyCode.D;
  /**
   * Network bindings used in {@code GameClient}
   */
  public static final KeyCode JUMP = KeyCode.W;
  /**
   * Network bindings used in {@code GameClient}
   */
  public static final KeyCode FALL = KeyCode.S;
  /**
   * Network bindings used in {@code GameClient}
   */
  public static final KeyCode HIT = KeyCode.E;

  // If this is implemented, both punch and kick will work over network.
  //  Currently only punch works.
  //public static final KeyCode HIT_KICK = KeyCode.Q;
  //public static final KeyCode HIT_PUNCH = KeyCode.E;

  /**
   * Background color for the game. Used in implementations of {@code GameRenderer}
   */
  public static final Color BACKGROUND_COLOR = Color.web("002b36");
  /**
   * Foreground color for the game. Used in implementations of {@code GameRenderer}
   */
  public static final Color FOREGROUND_COLOR = Color.web("073642");
  /**
   * Used in {@code GameStage}
   */
  public static final Color PLAYER_1_COLOR = Color.web("cb4b16");
  /**
   * Used in {@code GameStage}
   */
  public static final Color PLAYER_2_COLOR = Color.web("268bd2");
  /**
   * Color of a stunned player. Used in {@code PlayerRenderer}
   */
  public static final Color HITSTUN_COLOR = Color.web("d33682");
  /**
   * Color of hitboxes. Used in {@code PlayerRenderer}
   */
  public static final Color HITBOX_COLOR = Color.web("859900");
  /**
   * Healthbar border color. Used in {@code HealthRenderer}
   */
  public static final Color HEALTHBAR_BORDER = Color.web("000000");
  /**
   * Healthbar color for 100% to 75%. Used in {@code HealthRenderer}
   */
  public static final Color HEALTHBAR_GOOD = Color.web("fdf6e3");
  /**
   * Healthbar color for 75% to 40%. Used in {@code HealthRenderer}
   */
  public static final Color HEALTHBAR_BAD = Color.web("eee8d5");
  /**
   * Healthbar color for 40% to 0%. Used in {@code HealthRenderer}
   */
  public static final Color HEALTHBAR_AWFUL = Color.web("93a1a1");
}
