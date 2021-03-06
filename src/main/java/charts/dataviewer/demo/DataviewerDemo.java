package charts.dataviewer.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import charts.dataviewer.factory.DataViewerFactory;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

@SuppressWarnings("unused")
public class DataviewerDemo extends Application {

	private static final Logger logger = LoggerFactory.getLogger(DataviewerDemo.class.getName());

	private final String PROJECT_TITLE = "DataViewerDemo";
	private final int WINDOW_WIDTH = 1024;
	private final int WINDOW_HEIGHT = 768;

	public static void main(String[] args) throws Exception {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {

		logger.info("DataviewerDemo Started");
		
		/**********************************************
		 * Change the test
		 **********************************************/
		HBox testHBox = test1();
//		HBox testHBox = test2();
//		HBox testHBox = test3();
		/**********************************************/
		
		Scene mainScene = new Scene(testHBox);
		stage.setScene(mainScene);
		stage.setTitle(PROJECT_TITLE);
		stage.setHeight(WINDOW_HEIGHT);
		stage.setWidth(WINDOW_WIDTH);
		stage.setOnCloseRequest(e -> closeApplication());
		stage.show();
	}

	private void closeApplication() {

		logger.info("Exiting...");
		System.exit(0);
	}

	private HBox test1() {
		VBox vboxLeft = new VBox();
		vboxLeft.getChildren().add(DataViewerFactory.createDataViewerExample1());
		vboxLeft.getChildren().add(DataViewerFactory.createDataViewerExample2());
		VBox vboxMiddle = new VBox();
		vboxMiddle.getChildren().add(DataViewerFactory.createDataViewerExample3());
		vboxMiddle.getChildren().add(DataViewerFactory.createDataViewerExample4());
		VBox vboxRight = new VBox();
		vboxRight.getChildren().add(DataViewerFactory.createDataViewerExample5());
		vboxRight.getChildren().add(DataViewerFactory.createDataViewerExample6());

		HBox hbox = new HBox();
		hbox.getChildren().addAll(vboxLeft, vboxMiddle, vboxRight);
		return hbox;
	}

	private HBox test2() {
		VBox vboxLeft = new VBox();
		vboxLeft.getChildren().add(DataViewerFactory.createDataViewerTuneExample(1));
		vboxLeft.getChildren().add(DataViewerFactory.createDataViewerTuneExample(2));
		VBox vboxRight = new VBox();
		vboxRight.getChildren().add(DataViewerFactory.createDataViewerTuneExample(3));
		vboxRight.getChildren().add(DataViewerFactory.createDataViewerTuneExample(4));

		HBox hbox = new HBox();
		hbox.getChildren().addAll(vboxLeft, vboxRight);
		return hbox;
	}

	private HBox test3() {
		VBox vboxLeft = new VBox();
		vboxLeft.getChildren().add(DataViewerFactory.createDataViewerExample7());
		VBox vboxMiddle = new VBox();
		vboxMiddle.getChildren().add(DataViewerFactory.createDataViewerExample8());
		VBox vboxRight = new VBox();
		vboxRight.getChildren().add(DataViewerFactory.createDataViewerExample9());

		HBox hbox = new HBox();
		hbox.getChildren().addAll(vboxLeft, vboxMiddle, vboxRight);
		return hbox;
	}

}
