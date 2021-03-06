package View;

import Controller.ButtonsControllers.*;

public class ButtonsDependence {

    private final StartButtonController startButtonController;
    private final NextButtonController nextButtonController;
    private final PreviousButtonController previousButtonController;
    private final QuestionButtonController questionButtonController;
    private final AnswerButtonController answerButtonController;
    private final YesButtonController yesButtonController;

    public ButtonsDependence(StartButtonController startController, NextButtonController nextController,
                             PreviousButtonController previousController, QuestionButtonController questionController,
                             AnswerButtonController answerController, YesButtonController yesController) {

        this.startButtonController = startController;
        this.nextButtonController = nextController;
        this.previousButtonController = previousController;
        this.questionButtonController = questionController;
        this.answerButtonController = answerController;
        this.yesButtonController = yesController;

    }
    public StartButtonController getStartButtonController() { return startButtonController; }

    public NextButtonController getNextButtonController() { return nextButtonController; }

    public PreviousButtonController getPreviousButtonController() {
        return previousButtonController;
    }

    public QuestionButtonController getQuestionButtonController() {
        return questionButtonController;
    }

    public AnswerButtonController getAnswerButtonController() {
        return answerButtonController;
    }

    public YesButtonController getYesButtonController() {
        return yesButtonController;
    }
}