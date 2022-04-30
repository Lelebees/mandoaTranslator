package com.translator.mandoatranslator.GUI;

import com.translator.mandoatranslator.Applogic.Machinations;
import com.translator.mandoatranslator.Domain.TranslationDirection;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class translatorScreenController {
    @FXML
    Label rightTranslatorLabel;
    @FXML
    Label leftTranslatorLabel;
    @FXML
    TextArea leftTranslatorInput;
    @FXML
    TextArea rightTranslatorInput;
    @FXML
    Button swapLanguagesButton;
    @FXML
    Button translateLanguagesButton;
    @FXML
    MenuBar menuBar;

    TranslationDirection translationDirection = TranslationDirection.ENGLISHTOMANDOA;

    public void Reverse(){
        if (translationDirection == TranslationDirection.ENGLISHTOMANDOA){
            translationDirection = TranslationDirection.MANDOATOENGLISH;
            leftTranslatorLabel.setText("Mando'a");
            rightTranslatorLabel.setText("English");
        } else {
            translationDirection = TranslationDirection.ENGLISHTOMANDOA;
            leftTranslatorLabel.setText("English");
            rightTranslatorLabel.setText("Mando'a");
        }
    }

    public void OpenAbout(){

    }

    public void Translate(){
        rightTranslatorInput.setText(Machinations.Translate(translationDirection, leftTranslatorInput.getText()));

    }
}
