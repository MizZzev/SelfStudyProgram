package View;

import Controller.ButtonsControllers.*;
import DataBase.*;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class SecondWindow {

    private final GeneralDependence generalDependence;

    public SecondWindow(GeneralDependence genDependence){
        this.generalDependence=genDependence;
    }

    public void startWin() {

        generalDependence.getOutputText().setWrapText(true);
        generalDependence.getOutputText().setStyle("-fx-font-size: 16px;");
        generalDependence.getErrorMessage().setStyle("-fx-text-inner-color: red; -fx-font-size: 20px;");

        CountingResult countingResult = new CountingResult(generalDependence.getWorker());

        StartButtonController startButtonController = new StartButtonController(generalDependence.getWorker(), generalDependence.getDigit());
        NextButtonController nextButtonController = new NextButtonController(generalDependence.getWorker(), generalDependence.getDigit(),generalDependence.getErrorMessage()/*errorMessage*/);
        PreviousButtonController previousButtonController = new PreviousButtonController(generalDependence.getWorker(), generalDependence.getDigit(),generalDependence.getErrorMessage()/*errorMessage*/);
        QuestionButtonController questionButtonController = new QuestionButtonController(generalDependence.getWorker(), generalDependence.getDigit());
        AnswerButtonController answerButtonController = new AnswerButtonController(generalDependence.getWorker(), generalDependence.getDigit());
        YesButtonController yesButtonController = new YesButtonController(generalDependence.getWorker(), generalDependence.getDigit(), generalDependence.getResultMassage()/*resultMassage*/, countingResult);
        NoButtonController noButtonController = new NoButtonController(generalDependence.getWorker(), generalDependence.getDigit());

        ButtonsDependence dependence = new ButtonsDependence(startButtonController, nextButtonController,
                previousButtonController, questionButtonController, answerButtonController,
                yesButtonController, noButtonController);

        SecondWindowConstructor constructor = new SecondWindowConstructor(generalDependence.getOutputText(),
                generalDependence.getErrorMessage(),dependence);

        Stage myStage = new Stage();
        myStage.setTitle("Self study program");
        Pane rootNode = new Pane();
        Scene myScene = new Scene(rootNode, 1024, 768);
        myStage.setResizable(false);
        myStage.setScene(myScene);

        rootNode.getChildren().addAll(constructor.getStartButton(), constructor.getNextButton(),
                constructor.getPreviousButton(), constructor.getQuestionButton(),
                constructor.getAnswerButton(), constructor.getYesButton(), constructor.getNoButton(),
                generalDependence.getOutputText(),generalDependence.getResultMassage(), generalDependence.getErrorMessage());

        myStage.show();
    }
}