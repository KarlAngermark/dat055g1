package client;

import client.screen.*;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import javax.xml.stream.events.EndDocument;


/**
 * Client entry class handles switching of screens/modes
 *
 * @author Alexander Andersson (alexaan)
 * @author Linus Berglund (belinus)
 * @author Erik Källberg (kalerik)
 * @author Timmy Truong (timmyt)
 * @author Karl Ängermark (karlang)
 * @version 2017-02-23
 */
public class GameApplication extends Application {

  public PlayScreen playScreen;
  public MainMenuScreen mainMenuScreen;
  public JoinScreen joinScreen;
  public NetworkPlayScreen networkPlayScreen;
  public EndScreen endScreen;

  private Screen activeScreen;
  private Stage stage;

  public static void main(String args[]) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) throws Exception {
    stage = primaryStage;
    stage.setTitle("TimmyFightGoGo");
    javafx.stage.Screen screen = javafx.stage.Screen.getPrimary();
    stage.setWidth(screen.getBounds().getMaxX());
    stage.setHeight(screen.getBounds().getMaxY());
    //stage.setFullScreen(true);

    playScreen = new PlayScreen(this);
    mainMenuScreen = new MainMenuScreen(this);
    joinScreen = new JoinScreen(this);
    networkPlayScreen = new NetworkPlayScreen(this);
    endScreen = new EndScreen(this);

    setActiveScreen(mainMenuScreen);

    // primaryStage is the stage provided by the javafx app instance
    stage.setOnCloseRequest(this::exit);
    stage.show();

    /*The following makes it so the screen pops-up in focus even when not in full screen*/
    stage.requestFocus();
    stage.setAlwaysOnTop(true);
    stage.setAlwaysOnTop(false);
  }

  public void setActiveScreen(Screen screen) {
    if (activeScreen != null) {
      activeScreen.exit();
    }
    activeScreen = screen;
    activeScreen.enter(stage);
  }

  private void exit(WindowEvent windowEvent) {
    activeScreen.exit();
    Platform.exit();
  }
}
